import pkg2.C;

public class encapsulationnn {
    public static void main(String[] args) {
        Car mycar=new Car("tesla","model3",10,2025);
        System.out.println(mycar.year);
        System.out.println("====use getter=====");
        System.out.println(mycar.getBrand()+" "+mycar.getName()+" "+mycar.getPrice());
        System.out.println("====reset=====");
        mycar.year=2045;
        mycar.setBrand("BMW");
        mycar.setName("IDK");
        mycar.setPrice(666);
        System.out.println(mycar.year);
        System.out.println(mycar.getBrand()+" "+mycar.getName()+" "+mycar.getPrice());
        Car mycar2=new Car(mycar);
        System.out.println(mycar2.getBrand()+" "+mycar2.getName());
    }
}
