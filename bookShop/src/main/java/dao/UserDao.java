package dao;

import modul.User;
import util.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/5/2
 * Time:18:16
 * Introduction:
 */
public class UserDao {
    //连接数据库
private static Connection conn = Database.getConnect();
//根据用户id获取用户信息
    public User getUser(String id){
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user WHERE userId="+id);
            User user = new User();
            while(rs.next()){
                user.setUserName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setSex(rs.getString("sex"));
                user.setManager(rs.getBoolean("isManager"));
            }
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
