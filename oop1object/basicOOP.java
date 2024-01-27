public class basicOOP {
    public static void main(String[] args) {
        System.out.println("start OOP");
        basicOOP tt=new basicOOP();
        tt.calll(55);
        System.out.println("====================1");
        Carr myCar=new Carr();
        System.out.println(myCar.brand+" "+myCar.model+" "+myCar.price);
        myCar.forward();
        Carr myCar2=new Carr("TOYOTA","YARIS",10,19);
        System.out.println("car1 "+myCar.brand);
        System.out.println("car2 "+myCar2.brand);
        System.out.println("=====================2");
        Carr myCar3=new Carr("overloaddd");
        System.out.println("=====================3");
        myCar2.backward();
        System.out.println("=====================4");
        Carr garage[]=new Carr[3];
        Carr car1 =new Carr();
        garage[0]=car1;
        garage[1]=new Carr("honda","pai",1,2);
        garage[2]=new Carr("nessan");
        garage[0].stop();
        garage[1].backward();
        garage[2].forward();
        System.out.println("=====================5");
        Park parkk=new Park();//object if not->use static->Park.parking
        parkk.parking(garage[1]);//static is owned by "CLASS"
        System.out.println("=====================6");
        Park.shift(garage[2]);//static use CLASS name
        Carr.nums();//static int &static func
        System.out.println("=====================7");

    }

    public void calll(int i) {
        System.out.println(i);
    }
}
