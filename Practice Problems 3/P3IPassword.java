import java.util.Scanner;

public class P3IPassword
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String password;
        boolean tf = true;
        
        while(tf)
        {
            System.out.println("Please enter a password at least 6 characters long"+
                               " and containing at least 1 non-alphanumeric character:");
            password = keyboard.nextLine();
            if(password.length() > 5)
            {
                for(int i = 0; i < password.length(); i++)
                {
                    if(password.substring(i, i+1).equals("+"))
                    {
                        tf = false;
                    }
                    else if(password.substring(i, i+1).equals("-"))
                    {
                        tf = false;
                    }
                    else if(password.substring(i, i+1).equals("*"))
                    {
                        tf = false;
                    }
                    else if(password.substring(i, i+1).equals("/"))
                    {
                        tf = false;
                    }
                    else if(password.substring(i, i+1).equals("@"))
                    {
                        tf = false;
                    }
                    else
                    {
                        if((i==password.length()-1)&&tf)
                        {
                            System.out.println("Password did not contain the required special character, try again.");
                        }
                    }
                }
            }
            else
            {
                System.out.println("Password is too short, try again.");
            }
        }
    }
}