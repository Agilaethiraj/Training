import java.util.Scanner;

public class BoxPractice {
    // create a class Circle
    // with property as radius
    // write method to calculate circumefernce and diameter
    // write a contructor which takes radius as argument
    // create 2 object and call methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Width / Height/ Legth");
//
//        Box box = new Box(3);
//        Box box2 ;
//        box2 = box;
//        System.out.println(box.height);
//        System.out.println(box.length);
//        System.out.println(box.width);
//        box.length = 10;
//
//        System.out.println("Volume " + box.getVolume());
//        printBox(box);
//        System.out.println(box.length);
//        System.out.println("Volume " + box.getVolume());
//        int abc = 20;
//        printVar(abc);
//        System.out.println(abc);

        System.out.println(Box.boxtype);
        Box.doSomething();

        Box b = new Box(2);
        b.getVolume();
    }

    public  void printBox(Box box) {
        System.out.println(box);
        box.length = 20;
    }
    public static void printVar(int a) {
        System.out.println(a);
        a= 40;
        System.out.println("agila");
     
    }
}
