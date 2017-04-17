public class letterToNumber
{
    private int num;
    public int letterToNumber(String let)
    {
        if(let == "A")
        {
            num = 0;
        }
        else if(let == "B")
        {
            num = 1;
        }
        else if(let == "C")
        {
            num = 2;
        }
        else if(let == "D")
        {
            num = 3;
        }
        else if(let == "E")
        {
            num = 4;
        }
        else if(let == "F")
        {
            num = 5;
        }
        else if(let == "G")
        {
            num = 6;
        }
        else if(let == "H")
        {
            num = 7;
        }
        return num;
    }
}