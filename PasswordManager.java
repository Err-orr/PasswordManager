public class PasswordManager {
    private String username = "";
    private String password = "";
    public PasswordManager() {
        username = null;
        password = null;
    }
    public PasswordManager(String user, String pass) {
        username = user;
        password = pass;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String u) {
        username = u;
    }
    public void setPassword(String p) {
        password = p;
    }
    public String information() {
        return "Your username is: " + username + ", and your password is: " + password + ".";
    }
    public void expirationDate() {
        System.out.println("Your password expiration date is " + (int) (Math.random() * 12 + 1) + "/" + (int) (Math.random() * 31 + 1) + "/" + (int) (Math.random() * 99 + 1) + ".");
    }
}