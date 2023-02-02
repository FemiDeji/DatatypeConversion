public class ImplicitDatatypeConversion {
    public static void main(String[] args)
    {
        int a = 100;
        System.out.println("int representation: "+a);
        long b = a;
        System.out.println("long representation: "+b);
        float c = b;
        System.out.println("float representation: "+c);

    }
}
