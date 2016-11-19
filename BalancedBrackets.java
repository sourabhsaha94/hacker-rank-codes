import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.LinkedList;
public class Solution {
    
    public static boolean isBalanced(String expression) {
       LinkedList<Character> bStack = new LinkedList<Character>();
        char[] tempArray = expression.toCharArray();
        char sTop;
        
        if(tempArray[0]=='}'||tempArray[0]==')'||tempArray[0]==']'){
            return false;
        }
        
        for(int i=0;i<tempArray.length;i++){
            if(tempArray[i]=='{'||tempArray[i]=='('||tempArray[i]=='['){
                bStack.push(tempArray[i]);
            }
            else{
                if(bStack.isEmpty())
                    return false;
                else{
                    sTop = bStack.pop();
                    switch(sTop){
                    case '{':
                    if(tempArray[i]!='}') return false;
                    break;
                    case '(':
                    if(tempArray[i]!=')') return false;
                    break;
                    case '[':
                    if(tempArray[i]!=']') return false;
                    break;
                }    
                }
                
            }    
            
        }
        
        if(!bStack.isEmpty()) return false;
        
        return true;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
