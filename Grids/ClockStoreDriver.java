public class ClockStoreDriver
{
    public static void main(String[] args)
    {
        ClockStore store1 = new ClockStore();
        System.out.println(store1);
        System.out.println("The index of the clock with the most seconds: " + store1.mostSeconds());
    }
}