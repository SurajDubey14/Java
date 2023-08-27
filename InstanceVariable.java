package Variable;

class student{
    String name;
    int Roll_no;
}
public class InstanceVariable {
    public static void main(String[] args) {
        student stud = new student();
        stud.name="Suraj Dubey";
        stud.Roll_no=95;

        System.out.println(stud.name);
        System.out.println(stud.Roll_no);
    }
}
