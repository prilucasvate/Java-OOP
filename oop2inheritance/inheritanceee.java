public class inheritanceee {
    public static void main(String[] args) {
        Car mycar=new Car();
        mycar.go();
        Vehicle vc=new Vehicle(30);
        vc.go();
        mycar.closedoor();
        Feet myft=new Feet();
        myft.run();
        Bicycle bike=new Bicycle();
        System.out.println("bike has "+bike.wheels+" wheels");
        System.out.println("==============");
        myft.go();
        Car mycar2=new Car("red","toyota","V22");
        System.out.println(mycar2.tostring());
        System.out.println("==============");

    }
}
