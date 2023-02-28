import java.util.*;
  
public class Task01 {
  
    static boolean isCorrectParentheses(String parentheses){
        Deque<Character> stack
            = new ArrayDeque<Character>();
  
        for (int i = 0; i < parentheses.length(); i++) {
            char x = parentheses.charAt(i);
            if (x == '(' || x == '[' || x == '{' || x == '<') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.removeFirst();
                if (check == '{' || check == '[' || check == '<')
                    return false;
                break;
            case '}':
                check = stack.removeFirst();
                if (check == '(' || check == '[' || check == '<')
                    return false;
                break;
            case ']':
                check = stack.removeFirst();
                if (check == '(' || check == '{' || check == '<')
                    return false;
                break;
            case '>':
                check = stack.removeFirst();
                if (check == '(' || check == '{' || check == '[')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());
    }
  
    public static void main(String[] args){
        String str = "({aSFD}GFHHG[]xcfg<dy u>)";
  
        if (isCorrectParentheses(str))
            System.out.println(str + " -> True");
        else
            System.out.println(str + " -> False");
    }
}