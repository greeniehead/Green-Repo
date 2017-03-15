public class ArrayReverse
{
    public static void main(String[] args)
    {
        int[] myList1 = {1, 4, 7, 3, 26};
        int[] myList2 = new int[myList1.length];
        int list2Index = myList1.length - 1;
        
        System.out.print("Array 1: ");
        for(int element: myList1)
        {
            System.out.print(element + "  ");
            myList2[list2Index--] = element;
        }
        
        System.out.print("\nArray 2: ");
        for(int element: myList2)
        {
            System.out.print(element + "  ");
        }
        System.out.println("");
    }
}