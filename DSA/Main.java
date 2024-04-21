package DSA;

import DSA.Stacks;

public class Main {
    public static void main(String[] args) {
        Stacks stk = new Stacks(5);
        stk.push(10);
        stk.push(20);

        System.out.println(stk.pop());
    }

}
