import java.util.*;
public class Toggle
{

    public static void main(String[] args)
    {
        System.out.println("Enter in a sentence:"); 
        Scanner input = new Scanner(System.in); 
        String sentence = input.nextLine();
        System.out.println("Converted String:" + toggleString(sentence)); 
        input.close(); 
     }

    public static String toggleString(String sentence)
    {
       String toggled = ""; 
       for(int i=0; i<sentence.length(); i++)
       {


           char letter = sentence.charAt(i); 

           if(Character.isUpperCase(sentence.charAt(i)))
           {
                letter = Character.toLowerCase(letter); 
                toggled = toggled + letter; 

           }
           else if(Character.isLowerCase(sentence.charAt(i)))
           {
               letter = Character.toUpperCase(letter);
               toggled = toggled + letter; 
           }

       }
       return toggled; 

   }
}