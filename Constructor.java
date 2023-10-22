package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s= new Student();
        Student s1= new Student("Rahul");
        System.out.println(s1.name);

    }
}

class Student {
    String name;
    int age;

    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name) {
        this.name = name;
    }
}