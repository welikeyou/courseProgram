package main.java.servlet;

import main.java.dao.UserDao;
import main.java.modul.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/5/5
 * Time:11:49
 * Introduction:
 */
@WebServlet(name = "RegisterServlet.do")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String account = request.getParameter("accountReg");
        String name = request.getParameter("name");
        String password = request.getParameter("password1");
        UserDao userDao = new UserDao();
        User myInfo = new User(account,name,password,null,false);
        User userInfo = userDao.getUser(account);
        if(userInfo==null){
            userDao.addUser(myInfo);
        }else{
            response.getWriter().print("账号已存在");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
