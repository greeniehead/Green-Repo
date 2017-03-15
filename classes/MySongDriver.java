public class MySongDriver
{
    public static void main( String[] args )
    {
        Song mySong = new Song();
        
        System.out.println(mySong);
        
        System.out.println();
        
        mySong.setLength(1234);
        System.out.println(mySong);
    }//end method main
}  // end class 
