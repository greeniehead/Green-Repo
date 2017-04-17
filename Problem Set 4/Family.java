import java.util.ArrayList;

public class Family
{
    public static void main(String[] args)
    {
        ArrayList<String>famList = new ArrayList<String>();
        famList.add("Dane");
        famList.add("Kira");
        famList.add("Kari");
        famList.add("John");
        
        System.out.println(famList.size());
        for(int i = 0; i < famList.size(); i++)
        {
            System.out.println(famList.get(i));
        }
        
        for(String element : famList)
        {
            System.out.println(element);
        }
    }
}