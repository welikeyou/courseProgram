package servlet;
import dao.UserDao;
import modul.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/5/3
 * Time:12:38
 * Introduction:
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
         String account = request.getParameter("account");
         String password = request.getParameter("password");
         UserDao userDao = new UserDao();
         User userInfo = userDao.getUser(account);
         if(userInfo!=null&&password.equals(userInfo.getPassword())){
             response.getWriter().print("success");
             request.getSession().setAttribute("account",userInfo.getAccount());
             request.getSession().setAttribute("name",userInfo.getUserName());
             if(userInfo.isManager()){
              request.getRequestDispatcher("page/managerHome.jsp").forward(request, response);;

             }else{
                 request.getRequestDispatcher("page/userHome.jsp").forward(request, response);;

             }
         }
         else{
             response.getWriter().print("fail");
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
