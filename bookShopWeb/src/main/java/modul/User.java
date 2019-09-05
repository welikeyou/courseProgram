package main.java.modul;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/5/2
 * Time:19:15
 * Introduction:
 */
public class User {
    private String account;
    private String  userName;
    private String password;
    private String sex;
    private boolean isManager;

    public User(String account, String userName, String password, String sex, boolean isManager) {
        this.account = account;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.isManager = isManager;
    }

    public User() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
