package class_object;

class Shape{
    int side;
    Shape(int side){
        this.side=side;
    }
    int area(){
        return side*side;
    }
    static void greeting(){
        System.out.println("Hey Greetinh fom parent class..");
    }
}
class Square extends Shape{
    int height;

    Square(int side,int height){
        super(side);
        this.height=height;
    }
    @Override
    int area(){
        return side*side;
    }
    static void greeting(){
        System.out.println("Hey Greetinh fom sub class..");

    }
}
public class Singleton {

    public static void main(String[] args) {
        // Singleton1 ss=Singleton1.getInstance();
        // Singleton1 ss1=Singleton1.getInstance();

        Square sq=new Square(2, 3);
        System.out.println(sq.area());
        System.out.println(sq.height);
        
        Shape sq1=new Square(2,3);
        System.out.println(sq1.area());
        System.out.println(sq1.side);

        Square s=new Square(1, 2);
        s.greeting();
        sq1.greeting();

        
    }
}
