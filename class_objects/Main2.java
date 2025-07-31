package class_objects;

class Student2 {
    String name;
    int age;

    Student2() {
        this("Unknown", 0);  // Calls the second constructor
    }

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
} 
public class Main2{
    public static void main(String[] args) {
        Student2 s1=new Student2();
        System.out.println(s1.name);
        System.out.println(s1.age);

    }
}
