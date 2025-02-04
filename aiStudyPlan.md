## *Study Plan*

1. Introduction
Understand Time and Space Complexity: Learn Big O notation (O(1), O(log N), O(N), O(N²), etc.).
Practice Basic Sorting Algorithms: Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort.
Java Essentials for DSA: ArrayList, HashMap, Stack, Queue, PriorityQueue, LinkedList.
2. Arrays and Strings
Concepts
Arrays: Fixed size, indexed access (int[] arr = new int[5];).
Strings: Immutable in Java (String str = "hello";).
Two-pointer technique, sliding window.
Common Problems
Reverse an array in place.
Two Sum (using HashMap for O(N) time).
Longest Substring Without Repeating Characters (Sliding Window).
Palindrome Check (Two-pointer approach).
Example: Two Sum
java
Copy
Edit
import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
3. Hashing
Concepts
HashMap (O(1) average time complexity for insert/search).
HashSet (unique elements, fast lookup).
Common Problems
Find duplicates in an array.
First non-repeating character in a string.
Two Sum using HashMap.
4. Linked Lists
Concepts
Singly Linked List (Node with next pointer).
Doubly Linked List (each Node has prev and next).
Fast and slow pointer technique (Floyd’s Cycle Detection).
Common Problems
Reverse a linked list.
Detect a cycle in a linked list.
Merge two sorted linked lists.
Example: Reverse a Linked List
java
Copy
Edit
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
5. Stacks and Queues
Concepts
Stack: LIFO (Last-In-First-Out) (Stack<Integer> stack = new Stack<>();).
Queue: FIFO (First-In-First-Out) (Queue<Integer> queue = new LinkedList<>();).
Deque (Double-ended queue): Can be used as both stack and queue.
Common Problems
Valid Parentheses (use Stack).
Implement Queue using Stack.
Implement Min Stack.
6. Trees and Graphs
Concepts
Binary Tree (Node with left/right children).
Binary Search Tree (BST) (left < root < right).
DFS & BFS Traversals.
Graph Representation (Adjacency List, Matrix).
Common Problems
Inorder, Preorder, Postorder traversal.
Level order traversal (BFS).
Detect cycle in an undirected graph.
Example: Inorder Traversal (DFS)
java
Copy
Edit
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class InorderTraversal {
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
7. Heaps
Concepts
PriorityQueue in Java (Min Heap by default).
Max Heap (PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());).
Heap Sort.
Common Problems
Find Kth largest element.
Merge K sorted linked lists.
Median in a data stream.
8. Greedy Algorithms
Concepts
Greedy Choice Property & Optimal Substructure.
Activity Selection, Huffman Encoding.
Common Problems
Minimum number of platforms.
Fractional Knapsack Problem.
Job Scheduling.
9. Binary Search
Concepts
Binary Search (Divide and Conquer, O(log N)).
Search in Rotated Sorted Array.
Find First and Last Position of an Element.
Example: Binary Search
java
Copy
Edit
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
10. Backtracking
Concepts
Recursive exploration with pruning.
Used in permutations, combinations, Sudoku solver.
Common Problems
N-Queens problem.
Subsets, permutations, and combinations.
Word search in a matrix.
11. Dynamic Programming
Concepts
Memoization (Top-down) vs Tabulation (Bottom-up).
Common Patterns: Fibonacci, Knapsack, Longest Common Subsequence.
Example: Fibonacci (Memoization)
java
Copy
Edit
import java.util.*;

public class Fibonacci {
    Map<Integer, Integer> memo = new HashMap<>();
    public int fib(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }
}
12. Interview Tools & Bonus
Tips
Practice mock interviews on LeetCode or Pramp.
Understand problem constraints before coding.
Write clean and optimized code.
Use Java’s built-in data structures effectively.
Final Advice
Focus on problems from each category and implement them in Java.
Practice time complexity analysis.
Mock interviews with a timer.
Stay calm and explain your thought process during the interview.
