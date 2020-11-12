package bll;

public class UserManage {
    public boolean login(String username, String password) {
        boolean result = false;
        if (username.equals("admin") && password.equals("1234")) {
            result = true;
        }
        return result;
    }
}
