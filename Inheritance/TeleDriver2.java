import java.util.ArrayList;

public class TeleDriver2
{
    public static void main(String[] args)
    {
        Television someTele = new Television();
        LED led = new LED("LED Platinum", 399.99);
        LCD lcd = new LCD("LCD Gold", 199.99);
        DLP dlp = new DLP("DLP Silver", 99.99);
        Plasma plas = new Plasma("Plasma Sapphire", 499.99);
        
        ArrayList<Television> inventory = new ArrayList<Television>();
        inventory.add(dlp);
        inventory.add(lcd);
        inventory.add(led);
        inventory.add(plas);
        
        System.out.println("TV's in the store...");
        
        for(Television tv : inventory)
        {
            System.out.println(tv);
        }
    }
}