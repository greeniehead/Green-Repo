public class P2EBlackjackDriver
{
    public static void main(String[] args)
    {
        Card[] myHand = new Card[3];
        Card card1 = new Card(10, "Hearts");
        myHand[0] = card1;
        Card card2 = new Card();
        myHand[1] = card2;
        Card card3 = new Card(10, "Clubs");
        myHand[2] = card3;
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println(myHand[i]);
        }
    }
}