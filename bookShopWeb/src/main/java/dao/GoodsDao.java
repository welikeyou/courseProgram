package main.java.dao;

import main.java.modul.Goods;
import main.java.util.Database;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * author:ChenKaiyi
 * Date:2019/5/3
 * Time:0:06
 * Introduction:
 */
public class GoodsDao {
    private static Connection conn = Database.getConnect();
    //获取所有商品列表
    public List<Goods> getGoods(){
        try{
            Statement st  = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM goods");
            List<Goods> goodsList = new ArrayList<>();
            while(rs.next()){
                Goods goods = new Goods(rs.getString("goodsId"),rs.getString("goodsName"),rs.getString("price"),rs.getString("type"),rs.getString("amount"),rs.getString("describe"),rs.getString("releaser"),rs.getString("picture"));
                goodsList.add(goods);
            }
             return goodsList;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }
    //根据商品ID查询
    public Goods getGoodsById(String goodsId){
        try{
            Statement st  = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM goods WHERE goodsId="+goodsId);
            Goods goods=null;
            while(rs.next()){
                goods = new Goods(rs.getString("goodsId"),rs.getString("goodsName"),rs.getString("price"),rs.getString("type"),rs.getString("amount"),rs.getString("describe"),rs.getString("releaser"),rs.getString("picture"));
            }
            return goods;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    //根据商品名称查询
    public List<Goods> getGoodsByName(String goodsName){
        try{
            Statement st  = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM goods WHERE goodsName="+goodsName);
            List<Goods> goodsList = new ArrayList<>();
            while(rs.next()){
                Goods goods = new Goods(rs.getString("goodsId"),rs.getString("goodsName"),rs.getString("price"),rs.getString("type"),rs.getString("amount"),rs.getString("describe"),rs.getString("releaser"),rs.getString("picture"));
                goodsList.add(goods);
            }
            return goodsList;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }
    //添加商品
    public boolean addGoods(Goods goods){
        try{
            Statement st = conn.createStatement();
            boolean rs = st.execute("INSERT INTO goods (goodsId, goodsName,price,type,amount,describe,releaser) VALUES("+goods.getGoodsId()+","+goods.getGoodsName()+
                    ","+goods.getPrice()+","+goods.getType()+","+goods.getAmount()+","+goods.getDescribe()+","+goods.getReleaser()+")");
            return rs;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    //删除商品
    public boolean deleteGoods(String goodsId){
        try{
            Statement st = conn.createStatement();
            boolean rs = st.execute("DELETE * FROM goods WHERE goodsId = "+goodsId);
                    return rs;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    //修改商品信息
    public boolean updateGoods(Goods goods){
        try{
            Statement st = conn.createStatement();
            boolean rs = st.execute("UPDATE goods SET goodsId="+goods.getGoodsId()+", goodsName="+goods.getGoodsName()+",price="+goods.getPrice()+",type="+goods.getType()+",amount="+goods.getAmount()+",describe="+goods.getDescribe()+",releaser="+goods.getReleaser()+",picture="+goods.getPicture()+"WHERE goodsId="+goods.getGoodsId());
            return rs;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    //将商品加入购物车
    public boolean addToCar(String userId, String goodsId, int num, int beforNum){
        int leftNum = beforNum - num;
        try{
            Statement st = conn.createStatement();
            boolean rs1 = st.execute("UPDATE goods SET amount="+leftNum);
            boolean rs2 = st.execute("INSERT INTO goodsInCar (userId, goodsId, amount) VALUES ("+userId+","+goodsId+","+num+")");
            return rs1&&rs2;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
