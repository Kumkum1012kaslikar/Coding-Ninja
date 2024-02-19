package Queue;

import java.util.Queue;
import java.util.Stack;

public class Solution {
   public static void reverseQueue(Queue<Integer> input) {
      if (input.size() <= 1) {
         return;
      }
      int front = input.poll();
      reverseQueue(input);
      input.add(front);
   }

   public static Queue<Integer> reverseKElement(Queue<Integer> input, int k) {
      if (input.isEmpty() || k > input.size()) {
         return input;
      }
      if (k <= 0) {
         return input;
      }
      Stack<Integer> stack = new Stack<>();
      for (int i = 0; i < k; i++) {
         stack.push(input.poll());
      }
      while (!stack.isEmpty()) {
         input.add((stack.pop()));
      }
      for (int i = 0; i < input.size() - k; i++) {
         input.add(input.poll());
      }
      return input;
   }

   public static void main(String[] args) {

   }
}
