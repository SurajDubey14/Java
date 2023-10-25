package OOPS.Static;

import Variable.StaticVariable;

public class Student {
    public static void main(String[] args) {
        Balak s1= new Balak();
        s1.SchoolName="NRSI";

        Balak s2 = new Balak();
        System.out.println(s2.SchoolName);
    }
}

class Balak{
    String Name;
    int roll;

    static String SchoolName;

    void setName(String Name){
        this.Name= Name;
    }
    String getName(){
        return this.Name;
    }
}
