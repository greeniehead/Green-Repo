public class Calculator
{
    public Calculator()
    {
        
    }
    
    public double add(double add1, double add2)
    {
        return add1+add2;
    }
    
    public double subtract(double sub1, double sub2)
    {
        return sub1-sub2;
    }
    
    public double multiply(double mult1, double mult2)
    {
        return mult1*mult2;
    }
    
    public double divide(double div1, double div2)
    {
        return div1/div2;
    }
    
    public double exponent(double expNum, int power)
    {
        double expAns = 0;
        if(power == 0)
        {
            expAns = 1;
        }
        else if(expNum == 0)
        {
        }
        else
        {
            expAns = expNum;
            for(int i = 0; i < power - 1; i++)
            {
                expAns = expAns * expNum;
            }
        }
        return expAns;
    }
}