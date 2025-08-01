package class_object;

class Singleton1{

    private Singleton1(){

    }

    private static  Singleton1 instance;

    public static Singleton1 getInstance(){

        if(instance==null){
            instance=new Singleton1();
        }
        
        return instance;
    }

}

class Student{
    int marks=90;
    String name;
    int rno;
    Student(int marks,String name,int rno){
        this.marks=marks;
        this.name=name;
        this.rno=rno;
    }
    Student(Student other){
        this.name=other.name;
        this.marks=other.marks;
        this.rno=other.rno;
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1=new Student(90,"Pratyush",89);
        System.out.println(student1.marks);
        student1.marks=95;
        System.out.println(student1.marks);
        Student student2=new Student(student1);

    }
}
