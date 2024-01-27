package pkg2;

import pkg1.A;

public class Aa extends A {
    public static void main(String[] args) {
        System.out.println("same package");
        C c=new C();
        System.out.println(c.publicc);
        System.out.println(c.defaultt);
        System.out.println(c.protectedd);
        Aa aa=new Aa();
        System.out.println(aa.protectedA);
    }
}
