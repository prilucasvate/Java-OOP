public class interfaceee {
    public static void main(String[] args) {
        System.out.println("this is interface");//like abstract class but can extends more
        Dog d=new Dog();
        d.running();
        Bird b=new Bird();
        b.flying();
        Chicken c=new Chicken();
        c.flying();
        c.running();
    }
}
