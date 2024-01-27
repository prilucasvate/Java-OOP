public class Carr {
    String brand,model;
    int price,wheel;
    double width;
    static int carnum=0;
    public Carr(){       //constructor
        brand="tesla";
        model="model x";
        price=1000;
        wheel=4;
        width=10.5;
        carnum++;
    }
    public Carr(String brand) {//overload
        this.brand=brand;
        carnum++;
        System.out.println("this is overload");
    }
    public Carr(String brand,String model,int price,double width){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.width=width;
        carnum++;
    }
    public void forward(){
        System.out.println(this.brand+" forward");
    }
    public void backward(){
        System.out.println(this.brand+" backward");
    }
    public void stop(){
        System.out.println(this.brand+" stop");
    }
    public static void nums(){
        System.out.println("I have "+carnum+" cars");
    }
}
