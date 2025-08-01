package class_object;

public class Static {
    static  int a=4;
    static int b;

    static {
        System.out.println("It will run only once when the first object is created i.e the class is loaded for the first time");
        b=a*5;
    }
    public static void main(String[] args) {
        Static st=new Static();
        System.out.println(Static.a+" "+Static.b);
        Static.b+=3;
        System.out.println(Static.a+" "+Static.b);
        Static st2=new Static();
        System.out.println(Static.a+" "+Static.b);

        
    }
}
