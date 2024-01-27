package pkg1;

import pkg2.C;

public class A {
    protected String protectedA="this is protected";
    public static void main(String[] args) {
        C c=new C();
        System.out.println("different package");
        System.out.println(c.publicc);//different package only public
    }
}
