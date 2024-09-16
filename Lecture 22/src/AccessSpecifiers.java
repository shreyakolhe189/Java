public class AccessSpecifiers {
    public static void main(String[] args){
        BankAccount myacc = new BankAccount();
        myacc.username = "shreyakolhe";
        System.out.println(myacc.username);

        myacc.setPassword("abcdefghi");
    }

}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}
