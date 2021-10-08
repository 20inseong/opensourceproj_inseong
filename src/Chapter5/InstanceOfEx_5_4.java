package Chapter5;

class Person_4{ }
class Student_4 extends Person_4{ }
class Researcher extends Person_4{ }
class Professor extends  Person_4{ }

public class InstanceOfEx_5_4 {
    static void print(Person_4 p) {
        if(p instanceof Person_4)
            System.out.print("Person ");
        if(p instanceof Student_4)
            System.out.print("Student ");
        if(p instanceof Researcher)
            System.out.print("Researcher ");
        if(p instanceof Professor)
            System.out.print("Professor");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new Student_4());
        System.out.print("new Researcher() ->\t"); print(new Researcher());
        System.out.print("new Professor() ->\t"); print(new Professor());
    }
}
