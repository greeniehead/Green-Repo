public class P3FUniversities
{
    public static void main(String[] args)
    {
        String school1 = new String("Stanford");
        String school2 = new String("San Luis Obisbo");
        String school3 = new String("UCLA");
        
        System.out.println( school1.compareTo(school2) );
        System.out.println( school1.compareTo(school3) );
        System.out.println( school2.compareTo(school3) );
        
    }
}
//a.
    //When it is negative, it is telling us that the school#.compareTo comes before
    //the school it is being compared to when sorted alphabetically
    //When it is positive, it is telling us that the school#.compareTo comes after
    //the school it is being compared to when sorted alphabetically
    //If it returns 0 then the 2 schools are exactly equal

//b.
    //it does the same thing but then sorts by the second letter with the same
    //rules

