package src.Basics_07;

public class Lab024{
    public static void main(String[] args) {
        Loginfix loginfix = new Loginfix("admin", "admin");

        boolean check = loginfix.isloggedin("admin", "admin");
        String u = loginfix.getUsername();
        System.out.println(u);
        //String p = loginfix.getPassword; // not possible

        System.out.println(check);

    }

}


class Loginfix {

    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    Loginfix(String u, String p){
        this.username = u;
        this.password = p;
    }
    boolean isloggedin(String username, String password){
            if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
    {
            System.out.println("Logged in");
            return true;

        }else{
            System.out.println("Wrong");
            return false;

        }
    }

}
