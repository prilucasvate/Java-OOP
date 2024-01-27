public class Car {
    private String brand;
    private String name;
    private int price;
    public int year;
    Car(String brand,String name,int price,int year){//use set to do
        this.setBrand(brand);
        this.setName(name);
        this.setPrice(price);
        this.year=year;
    }

    public Car(Car mycar) {
        this.copy(mycar);
    }

    public void copy(Car mycar) {
        this.setName(mycar.getName());
        this.setBrand(mycar.getBrand());
        this.setPrice(mycar.getPrice());
        this.year= mycar.year;
    }

    public String getBrand(){
        return brand;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
