// access modifiers = (private, default, protected, public)
                    //(with in class, with in package, outside package by subclass only, outside package)
                    // (Y               N                   N                                  N)
                    // (Y               Y                   N                                  N)
                    // (Y               Y                   Y                                  N)
                    // (Y               Y                   Y                                  Y)
public class accessModifiers 
{
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.username = "nitish";
        myAccount.setPassword("rathod");
        System.out.println(myAccount.username);
    }
}


class BankAccount 
{
    public  String username;
    private String password;
    public void setPassword(String pwd)
    {
        password = pwd;
    }
}