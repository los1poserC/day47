package Entity;

/**
 * @author As_los
 * @date 2019/8/30  14:54
 */

public class User {
    private String userName;
    private String userPassword;
    private String user_status;

    public User() {
    }

    public User(String userName, String userPassword, String user_status) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.user_status = user_status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", user_status='" + user_status + '\'' +
                '}';
    }
}
