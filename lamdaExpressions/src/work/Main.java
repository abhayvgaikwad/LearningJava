package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system starts.....");

        MyInter myInter1 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("First anonymous class overriding the sayHello() method.");
            }
        };
        myInter1.sayHello();

        MyInter myInter2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("Second anonymous class overriding sayHello() method.");
            }
        };
        myInter2.sayHello();

        MyInter l = ()->{
            System.out.println("Implementing Lambda for the first time");
        };
        l.sayHello();

        MyInter l2 = () -> System.out.println("This is second time I am using Lambda Expression.");
        l2.sayHello();

        SumInter s =(int a, int b) ->{
          return a+b;
        };

        SumInter s1 =(int a, int b) -> a+b;

        SumInter s2 =(a ,b) -> a+b;


        System.out.println(s.sum(3,5));
        System.out.println(s1.sum(3,5));
        System.out.println(s2.sum(3,5));

    }
}
