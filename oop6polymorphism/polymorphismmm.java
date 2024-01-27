import java.util.Scanner;

public class polymorphismmm {
    public static void main(String[] args) {
        Human a=new Man();
        a.hi();
        Human b=new Woman();
        b.hi();

        System.out.println("==polymorphism====");
        Scanner scanner = new Scanner(System.in);
        Human chris;

        System.out.println("Man=1 Woman=2");
        int n= scanner.nextInt();
        if(n==1){
            chris=new Man();
            chris.hi();
        }else if (n==2){
            chris=new Woman();
            chris.hi();
        }else{
            chris=new Human();
            chris.hi();
        }
        System.out.println("-=========-");
        Human[] arr={a,b,chris};
        for (Human x:arr) {
            x.hi();
        }
    }
}
