public class Main {
    public static void main(String[] args) {
        PasswordManager account = new PasswordManager("Error", "fdoygsfgwhi");
        System.out.println(account.getUsername());
        System.out.println(account.getPassword());
        account.setUsername("Nuh-Uh!");
        account.setPassword("',,d[,dfaf");
        System.out.println(account.information());
        account.expirationDate();
    }
}