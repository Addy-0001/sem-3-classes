import java.util.Arrays;

public class ProductSum {
    static long minValue(int A[], int B[], int n) {
        // Sort A and B so that minimum and maximum
        // value can easily be fetched.
        Arrays.sort(A);
        Arrays.sort(B);

        // Multiplying minimum value of A
        // and maximum value of B
        long result = 0;
        for (int i = 0; i < n; i++)
            result += (A[i] * B[n - i - 1]);

        return result;
    }
}


// https://www.javatpoint.com/huffman-coding-java

// Huffman coding algorithm in java