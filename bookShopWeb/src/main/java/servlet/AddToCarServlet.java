package main.java.servlet;

import main.java.dao.GoodsDao;
import main.java.dao.UserDao;
import main.java.modul.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IDEA
 * author:HanJinli
 * Date:2019/5/5
 * Time:12:20
 * Introduction:
 */
public class AddToCarServlet  extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String goodsId = request.getParameter("goodsIdAdd");
        int num =Integer.parseInt(request.getParameter("num"));
        int beforeNum = Integer.parseInt(request.getParameter("beforeNum"));
        GoodsDao goodsDao = new GoodsDao();
        if(goodsDao.addToCar((String)request.getSession().getAttribute("userId"),goodsId,num,12)){
         response.getWriter().println("添加成功");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
