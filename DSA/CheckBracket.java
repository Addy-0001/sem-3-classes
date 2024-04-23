public class CheckBracket {
    String openBracket = "{([";
    String closeBracket = "})]";

    boolean isBalanced(String exp) {
        Stacks stk = new Stacks(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char bracket = exp.charAt(i);
            if (bracket == '{' || bracket == '{' || bracket == '[') {
                stk.push(bracket);
            } else { 
                int index = closeBracket.indexOf(bracket); 
                int correspondingBracket = openBracket.charAt(index);
                if (stk.isEmpty()){
                    return false;
                }
                if(correspondingBracket != stk.pop()) {
                    return false;
                }
            }
        }
        if (!stk.isEmpty()) {
            return false;
        }
        return true; 
    }

    public static void main(String[] args) {
        CheckBracket check = new CheckBracket(); 
        System.out.println(check.isBalanced("{}{{}})"));
    }
}
