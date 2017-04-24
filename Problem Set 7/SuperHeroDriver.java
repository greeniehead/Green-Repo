import java.util.ArrayList;

public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        
        AsteroidMan ast1 = new AsteroidMan();
        FriedEggMan egg1 = new FriedEggMan();
        MyChoice my1 = new MyChoice();
        AsteroidMan ast2 = new AsteroidMan();
        FriedEggMan egg2 = new FriedEggMan();
        MyChoice my2 = new MyChoice();
        AsteroidMan ast3 = new AsteroidMan();
        FriedEggMan egg3 = new FriedEggMan();
        MyChoice my3 = new MyChoice();
        
        heroes.add(ast1);
        heroes.add(egg1);
        heroes.add(my1);
        heroes.add(ast2);
        heroes.add(egg2);
        heroes.add(my2);
        heroes.add(ast3);
        heroes.add(egg3);
        heroes.add(my3);
        
        for(SuperHero hero : heroes)
        {
            System.out.println(hero + "\n");
        }
        
        int index = 0;
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                if((heroes[index]).isCaped() == true)
                {
                    capedHeroes[row][col] = heroes[index];
                    heroes[index] = null;
                }
                index++;
            }
        }
    }
}