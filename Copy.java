package OOPS;

public class Copy {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.name="Suraj";
        s1.roll=95;
        s1.pwd="abc";
        s1.mark[0]=100;
        s1.mark[1]=90;
        s1.mark[2]=95;
        Stud s2 = new Stud(s1);   //copy
        s2.pwd="xyz";
        s1.mark[2]=100;

        for(int i=0;i<3;i++){
            System.out.println(s2.mark[i]);
        }
    }
}

class Stud {
    String name;
    int roll;
    String pwd;
    int mark[];
    Stud(Stud s1){
        mark=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.mark=s1.mark;  //reference is copied here i.e. this concept known as shallow copy(changes reflect)
        // whereas the new object is created(change is not reflect)
    }
    Stud(){
        mark=new int[3];
        System.out.println("Constructor is called");
    }
}
