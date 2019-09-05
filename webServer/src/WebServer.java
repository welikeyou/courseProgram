/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/5/8
 * Time:19:36
 * Introduction:
 */
import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WebServer {
    public static void main(String[] args) throws IOException {
        try {
            //connection number
            int i = 1;

            //创建服务器Socket，端口号为8081
            ServerSocket s = new ServerSocket(8081);

            while (true) {
                //程序无限循环，等待服务器连接，当服务器连接后建立新线程
                Socket incoming = s.accept();
                System.out.println("服务器运行端口号： " + s.getLocalPort());
                System.out.println("创建的连接个数: " + i);
                Runnable r = new ThreadHandler(incoming);
                Thread t = new Thread(r);
                t.start();
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/**
 * This class handles the client input for one server socket
 */
class ThreadHandler implements Runnable {
    private Socket incomig;

    public ThreadHandler(Socket i) {
        incomig = i;
    }

    public void run() {
        try {
            try {
                InputStream inStream = incomig.getInputStream();
                OutputStream outStream = incomig.getOutputStream();
                Scanner in = new Scanner(inStream);
                PrintWriter out = new PrintWriter(outStream, true);

                while (true) {
                    String line = in.nextLine();
                    if (line.equals("\r\n") && line.equals("")) {
                        break;
                    }
                    System.out.println("the client request is :" + line);
                    //read request line
                    String[] requests = line.split("\\s");
                    //read request head
                    Map<String, String> headMap = null;
                    //read request body
                    Map<String, String> parameterMap = null;
                    System.out.print(requests[0]);
                    if (requests[0].equals("GET")) {
                        //response GET request
                        //respense with the file that the request wants
                        System.out.print(requests[1]);
                        String str = requests[1].replaceAll("\\/", "//");
                        String path = System.getProperties().getProperty("user.dir") +"\\src"+ requests[1].replaceAll("\\/", "//");
                        System.out.println("The file that the client wants is:" + path);
                        //read request head
//                        headMap = readhead(in);
                        //read request body
//                        parameterMap = readbody(in);
                        System.out.print("hasRuned");
                        doGet(path, out);

                    } else if (requests[0].equals("POST")) {
                        //response POST request
                        //response with the file that the request wants and write the parameter at the of the file

                        String path = System.getProperties().getProperty("user.dir") +"\\src"+ requests[1].replaceAll("\\/", "//");
                        System.out.println("The file that the client wants is:" + path);
                        //read request head
                        headMap = readhead(in);
                        //read request body
                        parameterMap = readbody(in);
                        doPost(path, out, parameterMap);

                    }
                }

            } finally {
                incomig.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, String> readhead(Scanner in) {
        String headline = in.nextLine();
        Map<String, String> headMap = new HashMap<>();
        while (!headline.equals("\r\n") && !headline.equals("")) {
            String[] keyValue = {"", ""};
            String[] temp = headline.split(": |:");
            if (temp.length == 2) {
                keyValue = temp;
            }
            if (temp.length == 1) {
                keyValue[0] = temp[0];
            }
            headMap.put(keyValue[0], keyValue[1]);
            headline = in.nextLine();
        }
        return headMap;
    }

    private Map<String, String> readbody(Scanner in) {
        String bodyline = in.nextLine();
        if (bodyline.equals("\r\n") || bodyline.equals("")) {
            return null;
        }
        String t = in.nextLine();
        while (!t.equals("\r\n") && !t.equals("")) {
            bodyline += t + "\r\n";
            t = in.nextLine();
        }
        String[] parameters = bodyline.split("&");
        Map<String, String> parameterMap = new HashMap<>();
        String[] keyV = {"", ""};
        for (String parameter : parameters) {
            String[] temp = parameter.split("=");
            if (temp.length == 2) {
                keyV = temp;
            }
            if (temp.length == 1) {
                keyV[0] = temp[0];
            }
            parameterMap.put(keyV[0], keyV[1]);
        }
        return parameterMap;
    }

    private void doGet(String requestPath, PrintWriter out) {
        final String CRLF = "\r\n";
        String statusLine = null;
        String date = new Date().toString();
        String contentTypeLine = "";
        String contentLengthLine = "";
        String entityBody = "";

        File requestFile = new File(requestPath);
        Path path = Paths.get(requestPath);
        if (requestFile.exists()) {
            statusLine = "HTTP/1.0 200 OK";
            contentLengthLine = String.valueOf(requestFile.length());
            try {
                contentTypeLine = Files.probeContentType(path);
                List<String> contents = Files.readAllLines(path);
                for (String line : contents) {
                    entityBody += line + CRLF;
                }
            } catch (IOException e) {
                statusLine = "HTTP/1.0 400 BadRequest";
                entityBody = "<HTML>400 Not BadRequest</TITLE></HEAD>" +
                        "<BODY>400 BadRequest" +
                        e.getMessage();
                e.printStackTrace();
            }
        } else {
            statusLine = "HTTP/1.0 404 Not Found";
            entityBody = "<HTML>404 Not Found</TITLE></HEAD>" +
                    "<BODY>404 Not Found";

        }
        out.print(statusLine + CRLF);
        out.print("Date: " + date + CRLF);
        out.print("Content-Type: " + contentTypeLine + CRLF);
        out.print("Content-Length: " + contentLengthLine + CRLF);
        out.print(CRLF);
        out.print(entityBody + CRLF);
        out.flush();
    }

    private void doPost(String requestPath, PrintWriter out, Map<String, String> parameterMap) {
        final String CRLF = "\r\n";
        String statusLine = null;
        String date = new Date().toString();
        String contentTypeLine = "";
        String contentLengthLine = "";
        String entityBody = "";

        File requestFile = new File(requestPath);
        Path path = Paths.get(requestPath);
        if (requestFile.exists()) {
            statusLine = "HTTP/1.0 200 OK";
            try {
                PrintWriter fileWrite = new PrintWriter(new FileWriter(requestFile, true));
                fileWrite.append(parameterMap.toString());
                fileWrite.close();
                contentLengthLine = String.valueOf(requestFile.length());
                contentTypeLine = Files.probeContentType(path);
                List<String> contents = Files.readAllLines(path);
                for (String line : contents) {
                    entityBody += line + CRLF;
                }
            } catch (IOException e) {
                statusLine = "HTTP/1.0 400 BadRequest";
                entityBody = "<HTML>400 Not BadRequest</TITLE></HEAD>" +
                        "<BODY>400 BadRequest" +
                        e.getMessage();
                e.printStackTrace();
            }
        } else {
            statusLine = "HTTP/1.0 404 Not Found";
            entityBody = "<HTML>404 Not Found</TITLE></HEAD>" +
                    "<BODY>404 Not Found";

        }
        out.print(statusLine + CRLF);
        out.print("Date: " + date + CRLF);
        out.print("Content-Type: " + contentTypeLine + CRLF);
        out.print("Content-Length: " + contentLengthLine + CRLF);
        out.print(CRLF);
        out.print(entityBody + CRLF);
        out.flush();
    }

}
