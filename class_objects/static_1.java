package class_objects;

class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
    }
}
public class static_1 {
    public static void main(String[] args) {
        Human pra=new Human(22, "Pratyush", 89080, false);
        Human sra=new Human(90, "Ruchi", 89080, true);
        System.out.println(Human.population);
        System.out.println(sra.population);
 

    }
}
