public class ProblemF
{
    public static void main(String[] args)
    {
        int[] list = new int[50];
        for(int index = 0; index < list.length; index++)
        {
            list[index] = (int)(Math.random() * 100);
        }
        
        for(int element : list)
        {
            System.out.print(element + " ");
        }
    }
}