import java.util.*;
class Solution{
	
	public static void main(String[] argh)
	{
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
		String input = sc.next();
		System.out.println(checkBalanced(input));
       }
	}
    public static String checkBalanced(String s){
        Stack<Character> stack = new Stack();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()) {
                    return "false";
                }
                else{
                    char pop_val = stack.pop();
                    if(s.charAt(i)=='('  &&  pop_val!=')'){
                        return "false";
                    }else if(s.charAt(i)=='{'  &&  pop_val!='}'){
                        return "false";
                    }else if(s.charAt(i)=='['  &&  pop_val!=']'){
                        return "false";
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return "true";
        }
        else{
            return "false";
        }

    }
}



