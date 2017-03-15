import java.util.Scanner;

public class SubstitutionCipher
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        while(1 == 1)
        {
            System.out.println("Please enter a message to be encypted:");
            String input = keyboard.nextLine();
        
            String input2 = input.replaceAll(" ","");
            String output = "";
            int in;
            int out;
            char temp;
            char temp2;
            int ran = 1 + (int)(Math.random() * 26);
            
            char[] stringToArray = input2.toCharArray();
            for(char element : stringToArray)
            {
                temp = element;
                in = (int)temp;
                out = in + ran;
                if((in < 123) && (in > 96))
                {
                    out = in + ran;
                    if(out > 122)
                    {
                        out = out - 26;
                    }  
                }
                else if((in < 91) && (in > 64))
                {
                    out = in + ran;
                    if(out > 90)
                    {
                        out = out - 26;
                    }
                }
                temp2 = (char)out;
                output = output + temp2;
            }
            System.out.println("Your encoded message is: " + output);
            System.out.println("It has no spaces and has been shifted by: " + ran + "\n");
        }
    }
}