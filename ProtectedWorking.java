package OOPS;

public class ProtectedWorking {
    public static void main(String[] args) {
        Bank Client= new Bank();
        Client.setPassword("SurajPandat");
        System.out.println(Client.getPassword());
    }
}
class Bank{
    private String password;
    public void setPassword(String pwd){
        this.password = pwd;
    }
    public String getPassword(){
        return this.password;
    }
}
