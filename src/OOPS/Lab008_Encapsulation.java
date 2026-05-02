package OOPS;

public class Lab008_Encapsulation {

    public static void main(String[] args) {

        Login l=new Login("Mukesh","Admin");

        System.out.println(l.getUsername());
        System.out.println(l.getPassword());

        boolean isAdmin=true;

        l.setPassword("Muk",true);
        System.out.println(l.getPassword());

    }
}

class Login
{
   private String username;
    private String password;

    public Login(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }
        else {
            System.out.println("Not allowed");
        }
    }
}
