public class PrintReverse
{
    public static void main(String[] args)
    {
        Integer[] myList = {10, 17, 32, 47, 5};
        for(int i = myList.length - 1; i >= 0; i--)
        {
            System.out.println(myList[i]);
        }
    }
}