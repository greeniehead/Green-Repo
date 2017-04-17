public class P3GArraySearch
{
    public static void main(String[] args)
    {
        int[] array = {-9, 2, 3, 4, 7, 9, 10, 23, 45, 67};
        int search = 7;
        int result = -1;
        
        for(int element : array)
        {
            System.out.println(element);
        }
        System.out.println("");
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == search)
            {
                result = i;
            }
        }
        if(result != -1)
        {
            System.out.println("The number you searched for is at index: " + result);
        }
        else
        {
            System.out.println(result);
        }
    }
}