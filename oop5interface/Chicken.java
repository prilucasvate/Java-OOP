public class Chicken implements Run,Fly{
    @Override
    public void flying() {
        System.out.println("chicken is flying");
    }

    @Override
    public void running() {
        System.out.println("chicken is running");
    }
}
