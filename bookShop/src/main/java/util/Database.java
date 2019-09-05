package util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/5/2
 * Time:17:45
 * Introduction:
 */

public class Database {
    private static Connection connect=getConnect();



    public static Connection getConnect() {
                   Connection connect = null;
                 //驱动程序名
                 String driver = "com.mysql.jdbc.Driver";
                 //URL指向要访问的数据库名mydata
                 String url = "jdbc:mysql://localhost:3306/bookShop";
                 //MySQL配置时的用户名
                 String user = "root";
                 //MySQL配置时的密码
                 String password = "123456";
        try {
                         //加载驱动程序
                         Class.forName(driver);
                         connect = DriverManager.getConnection(url,user,password);
        } catch (SQLException | ClassNotFoundException  e) {
            e.printStackTrace();
        }
        return connect;
    }

    public static boolean checkExist(String sql) {
        try {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int update(String sql) {
        try {
            Statement st = connect.createStatement();
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

}

