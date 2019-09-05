package main.java.servlet;

import main.java.dao.GoodsDao;
import main.java.dao.UserDao;
import main.java.modul.Goods;
import main.java.modul.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IDEA
 * author:HanJinli
 * Date:2019/5/5
 * Time:11:32
 * Introduction:
 */
@WebServlet(name = "DetailServlet.do")
public class DetailServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            String goodsId = request.getParameter("goodsId");
            GoodsDao goodsDao = new GoodsDao();
            Goods goods = goodsDao.getGoodsById(goodsId);
            request.setAttribute("goodsInfo",goods);
            request.getRequestDispatcher("detail.jsp").forward(request, response);
        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
        }

}
