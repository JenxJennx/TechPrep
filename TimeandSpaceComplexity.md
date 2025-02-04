## Time Complexity
Big O notation analyzes the runtime and space usage growth as an input increases in an algorithm. When analyzing this, we want to be the most efficient and choose algorithms that are most efficient.
Time complexity: how the number of operations in an algortithm grows with the input size ***n***.

### Common Big O notations

| Notation  | Name | Description  | Example |
| ------------- | ------------- | ------------- | ------------- |
| O(1)  | Constant time  | Runs in the same time, no matter the input  | Accessing an array element (arr[1])  |
| O(log N)  | Logarithmic time  | Cuts the problem size in half each step  | Binary search  |
| O(N)  | Linear time  | Grows at the same rate as input size  | Traversing an array  |
| O(N log N)  | Linearithmic time  | Often seen in very efficient sorting algos  | Merge sort & Quick sort  |
| O(N^2)  | Quadratic time  | Nested loops; Performance degrades quickly  | Bubble sort & insertion sort  |
| O(2^n)  | Exponential Time  |Extremely slow, used in brute force recursive solutions  | Fibonacci (Naive recussion)  |
| O(N!)  | Factorial time  | Grows extremely fast, used in brute force permutations  | Solving the N-queens problem  |

 -     **Ex: O(1): Finding an array element**
        public static nameFactory {
           public String getFirstName(String[] arr){
              return arr[1];
                          }
                      }
    
 -     **Ex: O(N log N): Searching in sorted array**
        public class BinarySearch {
          public int search(int[] num, int target) {
           while (left <= right){
             int mid = left + (right - left) / 2;
             if(nums[mid] == target) return mid;
             if(nums[mid] < target) left = mid + 1;
             else right = mid - 1;
               }
        return -1;
       }
       }
   
-     **Ex: O(N): Linear time**
        public static LinearTimeExample  {
            public void returnTheWord( int[] arr) {
              for(int num : arr) {
                System.out.println(num)
              }
          }
      }
  
-     **Ex: O(N log N) - linearithmic time**
        import java.util.Arrays;

      public class MergeSort {
          public void mergeSort(int[] arr, int left, int right) {
              if (left < right) {
                  int mid = left + (right - left) / 2;
                  mergeSort(arr, left, mid);
                  mergeSort(arr, mid + 1, right);
                  merge(arr, left, mid, right);
              }
          }
          private void merge(int[] arr, int left, int mid, int right) {
                int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
                int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);
                
                int i = 0, j = 0, k = left;
                while (i < leftArr.length && j < rightArr.length) {
                    arr[k++] = (leftArr[i] <= rightArr[j]) ? leftArr[i++] : rightArr[j++];
                }
                while (i < leftArr.length) arr[k++] = leftArr[i++];
                while (j < rightArr.length) arr[k++] = rightArr[j++];
            }
        }
-     O(N^2) : Brute force checking all pairs
        public class QuadraticTimeExample {
        public void printPairs(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[i] + "," + arr[j]); // Runs N² times
                }
            }
        }
      }

-      O(2^n) - Exponential Time
        public class Fibonacci {
           public int fib(int n) {
             if(n<= 1) return n;
             return fib(n-1) + fib(n-2);
           }
         }

## Space Complexity
-     O(1) - Constant Space
        public void swap(int a, int b) {
          int temp = a;
          a = b;
          b = temp;
      }
  
-     O(n) Linear space / Storing intermediate results
      public int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length]; // Uses extra O(N) space
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
      }

-     Quadratic space : Dynamic programming tables, adjacency matrices.
      public static void main(String[] args){
            int[][] matrix = new int[n][n];
          }
        }


- Always choose the most efficient approach—avoid nested loops when possible.
- Binary Search (O(log N)) is faster than Linear Search (O(N)).
- Sorting in O(N log N) is better than O(N²).
- Recursive solutions may have O(N) space complexity due to the call stack.
- Use HashMaps for O(1) average lookup instead of O(N) linear scans.
