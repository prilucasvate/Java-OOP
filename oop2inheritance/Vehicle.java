public class Vehicle {
    int speed;
    String color,brand;

    public Vehicle(){
        speed=1;
    }
    public Vehicle(int sp){
        this.speed=sp;
    }

    public Vehicle(String color, String brand) {
        this.color=color;
        this.brand=brand;
    }
    String tostring(){
        return this.color+" "+this.brand;
    }

    void go(){
        System.out.println("vehicle go go go (speed "+this.speed);
    }
    void stop(){
        System.out.println("vehicle Stoppp");
    }
    void sp(){
        System.out.println("this is super");
    }
}
