package main.java.dao;

import main.java.modul.User;
import main.java.util.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IDEA
 * author:ChenKaiyi
 * Date:2019/5/2
 * Time:18:16
 * Introduction:
 */
public class UserDao {
    //连接数据库
private static Connection conn = Database.getConnect();
//根据用户id获取用户信息
    public User getUser(String account){
        try{
            Statement st = conn.createStatement();
            String querySt = "SELECT * FROM user WHERE account ='"+account+"'";
            ResultSet rs = st.executeQuery(querySt);
            User user = new User();
            while(rs.next()){
//                User user=new User(id,rs.getString("name"),rs.getString("password"),rs.getString("sex"),rs.getBoolean("isManager"));
                user.setAccount(account);
                user.setUserName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setSex(rs.getString("sex"));
                user.setManager(rs.getBoolean("isManager"));
            }
            System.out.println(user.getUserName());
            return user;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    //添加用户
    public boolean addUser(User user){
        try{
            Statement st = conn.createStatement();
            boolean rs = st.execute("INSERT INTO user(userId,name,password,sex,isManager) VALUES("+user.getAccount()+","+user.getUserName()+","+user.getPassword()+","+user.getSex());

            return rs;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }

    }


//根据用户id修改信息
    public boolean changeUser(User user){
        try{
            Statement st = conn.createStatement();
            boolean rs = st.execute("UPDATE user SET name="+user.getUserName()+"sex="+user.getSex());
            return rs;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
