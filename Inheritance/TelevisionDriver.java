public class TelevisionDriver
{
    public static void main(String[] args)
    {
        System.out.println("Normal televisions");
        
        Television tele1 = new Television();
        System.out.println(tele1);
        
        Television tele2 = new Television("LED Silver", 159.99);
        System.out.println(tele2 + "\n");
        
        System.out.println("LED televisions");
        
        LED led1 = new LED();
        System.out.println(led1);
        
        LED led2 = new LED("LED Bronze", 199.99);
        System.out.println(led2 + "\n");
        
        System.out.println("CRT televisions");
        
        CRT crt1 = new CRT();
        System.out.println(crt1);
        
        CRT crt2 = new CRT("CRT Gold", 299.99, 25);
        System.out.println(crt2);
    }
}