public class Heaps {
    int deleteMaxHeap(int a[], int n) {
        int data = a[0];

        a[0] = a[n];
        n--;
        int i = 0;

        while (i <= n) {
            int largest = i; 
            int left = 2*i + 1; 
            int right = 2*i+2; 
            if (left <= n && a[left]>a[largest]){
                largest = left;
            } else if (right <=n && a[right] >a[largest]){
                largest = right; 
            } 
            if (largest != i){
                swap(a, largest, i); 
            } else {
                return 0; 
            }
        }

        return data;
    }

    void heapify(int a[], int n, int i){
        int largest = i; 
        int leftChild = 2*i + 1; 
        int rightChild = 2*i + 2; 
        if (leftChild<=n && a[leftChild] > largest){
            largest = leftChild; 
        } else if (rightChild<=n && a[rightChild] > largest){
            largest = rightChild;
        } 
        if (largest != i){
            swap(a, largest, i); 
            heapify(a, n, rightChild);
        } else {
            return; 
        }
    }

    void buildHeap(int a[], int n){
        for(int i = n/2; i>=0; i--){
            heapify(a, n, i);
        }
    }

    void heapSort(int a[], int n){
        for(int i = 0; i>=0; i--){
            swap(a, i, 0); 
            heapify(a, i, 0);
        }
    }
}
