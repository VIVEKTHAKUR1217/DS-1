import java.util.HashSet;
import java.util.Scanner; 
  
public class SubSequence { 
      

    static HashSet<String> st = new HashSet<>(); 
  
    
    static void subsequence(String str) 
    { 
    
        for (int i = 0; i < str.length(); i++) { 
              
         
            for (int j = str.length(); j > i; j--) { 
                String sub_str = str.substring(i, j); 
              
                if (!st.contains(sub_str)) 
                    st.add(sub_str); 
  
        
                for (int k = 1; k < sub_str.length() - 1; k++) { 
                    StringBuffer sb = new StringBuffer(sub_str); 
  
             
                    sb.deleteCharAt(k); 
                    if (!st.contains(sb)) 
                        ; 
                    subsequence(sb.toString()); 
                } 
            } 
        } 
    } 
  
  
    public static void main(String[] args) 
    { 
        System.out.println("Enter the String:"); 
        Scanner input = new Scanner(System.in); 
        String s= input.nextLine();
        
        subsequence(s); 
        System.out.println(st); 
    } 
}