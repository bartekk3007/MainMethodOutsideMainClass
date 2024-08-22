public class Factory
{
    int size;

    public Factory(int size)
    {
        this.size = size;
    }

    public static String receiveString(Object o)
    {
        return o.toString();
    }

    public static void main(String[] args)
    {
        System.out.println("Function main outside Main class is possible");
    }
}
