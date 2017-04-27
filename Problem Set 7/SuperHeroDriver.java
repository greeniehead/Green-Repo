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
        
        heroes.add(0, ast1);
        heroes.add(1, egg1);
        heroes.add(2, my1);
        heroes.add(3, ast2);
        heroes.add(4, egg2);
        heroes.add(5, my2);
        heroes.add(6, ast3);
        heroes.add(7, egg3);
        heroes.add(8, my3);
        
        for(SuperHero hero : heroes)
        {
            System.out.println(hero + "\n");
        }
        
        int index = 0;
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        System.out.println("---------------------------------");
        System.out.println("Caped Heroes:\n");
        String temp = "";
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                for(int i = 0; i < heroes.size(); i++)
                {
                    final SuperHero h = heroes.get(i);
                    if(h.isCaped())
                    {
                        capedHeroes[row][col] = h;
                        heroes.remove(h);
                    }
                    else
                    {
                        capedHeroes[row][col] = null;
                    }
                }
            }
        }
        
        for(SuperHero[] row : capedHeroes)
        {
            for(SuperHero s : row)
            {
                if(s == null)
                {
                    System.out.print(null + "\t");
                }
                else
                {
                    System.out.print(s.getName() + "\t");
                }
            }
            System.out.println("");
        }
    }
}