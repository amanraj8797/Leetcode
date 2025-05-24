import java.util.*;

class Solution {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]); // Add current element to the queue

            // If it's a zero, enqueue an extra zero
            if (arr[i] == 0) {
                queue.offer(0);
            }

            // Dequeue and replace the current index with the correct element
            arr[i] = queue.poll();
        }
    }
}
