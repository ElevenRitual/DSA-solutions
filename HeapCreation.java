// Time Complexity for this code is O(n)
public class heap {
    public static void buildHeap(int arr[], int n) {
        int startInd = (n / 2) - 1;
        for (int i = startInd; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        // assume element at ith index is the largest one
        int largest = i;
        int left = 2 * i + 1, right = 2 * i + 2;
        // construction of heap
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            // recursion to place the element to its correct postion
            heapify(arr, n, largest);

        }
    }

    // function definition of displayHeap
    public static void displayHeap(int[] arr, int n) {
        System.out.println("Array construction of maxheap : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
        int n = arr.length;
        buildHeap(arr, n);
        displayHeap(arr, n);
    }

}
