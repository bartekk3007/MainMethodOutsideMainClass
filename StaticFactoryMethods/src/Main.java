public class Main
{
    public static void main(String[] args)
    {
        Factory f1 = new Factory(1000);
        System.out.println(Factory.receiveString(1));
        System.out.println(f1.receiveString(2));
    }
}