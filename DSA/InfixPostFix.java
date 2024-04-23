public class InfixPostFix{
    static int precedence(char ch){
        if (ch== '+' || ch=='-'){
            return 1;
        }
        else if (ch == '*' || ch =='/'){
            return 2;
        }
        else if (ch == '^'){
            return 3; 
        }
        return -1; 
    }

    static void convertInfixtoPostfix(String exp){
        String postFixExp = "";
        Stacks stk = new Stacks(exp.length()); 
        for (int i = 0; i<exp.length(); i++){
            char ch = exp.charAt(i); 
            if(precedence(ch)> 0){
                while (!stk.isEmpty() && precedence(ch) <= precedence(stk.peek())){
                    postFixExp = postFixExp +stk.pop(); 

                }
                stk.push(ch);
            } else if (ch == '('){
                stk.push(ch);
            } else if (ch == ')'){
                while (stk.peek() != '('){
                    postFixExp += stk.pop(); 
                }
            } else {
                postFixExp += ch; 
            }
            while (!stk.isEmpty()){
                postFixExp += stk.pop(); 
            }
        }
        System.out.println(postFixExp);
    }

    public static void main(String[] args) {
        convertInfixtoPostfix("5+3*(8/2)");
    }
}