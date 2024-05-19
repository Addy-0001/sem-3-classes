public class Permutation {
    int count = 0; 
    void printPermutation(String str, String perm) {
        if (str.length() == 0) {
            count+=1; 
            System.out.println(perm);
            System.out.println(count);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                String newString = str.substring(0, i)  + str.substring(i + 1);
                printPermutation(newString, perm + currentChar);
            }
            
        }
    }

    public static void main(String[] args) {
        Permutation p = new Permutation();
        String str = "ABCDEFGHIJKLMNOP";
        p.printPermutation(str, "");
    }
}
