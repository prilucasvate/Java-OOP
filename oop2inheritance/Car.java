public class Car extends Vehicle{
    int wheels=4;
    String motor;
    Car(){

    }
    Car(String color,String brand,String motor){
        super(color,brand);
        this.motor=motor;
    }
    String tostring(){
        super.sp();
        return super.tostring()+" "+this.motor;
    }
    void closedoor(){
        System.out.println("door closing");
    }

}
