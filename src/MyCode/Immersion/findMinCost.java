package MyCode.Immersion;


// Greedy Approach

/* all values equals in arr/al by performing operations
1. inc or dec by 3 at 1 coin
2. inc or de by 2 at free of cost
find min cost
 */

import java.util.ArrayList;

public class findMinCost {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(2);
        array.add(5);
        int even = 0, odd = 0;
        for (int i =0; i< array.size(); i++){
            if (array.get(i) % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        System.out.println(Math.min(even, odd));
    }
}

//
//    public static void main(String[] args) {
//        ArrayList<Integer> array = new ArrayList<>();
//        array.add(2);
//        array.add(2);
//        array.add(5);
//
//        System.out.println("Minimum cost to make all elements equal: " + findMinCost(array));
//    }
//
//    public static int findMinCost(ArrayList<Integer> array) {
//        int n = array.size();
//        if (n == 0) return 0; // If the array is empty, no cost is needed
//
//        // Find the minimum and maximum values in the array
//        int min = Collections.min(array);
//        int max = Collections.max(array);
//
//        int minCost = Integer.MAX_VALUE;
//
//        // Try making all elements equal to each value from min to max
//        for (int target = min; target <= max; target++) {
//            int currentCost = 0;
//
//            // Calculate the cost to convert each element to the target value
//            for (int value : array) {
//                int diff = Math.abs(value - target); // Difference between the current element and the target
//
//                // First, use the free operations
//                diff %= 2; // Remainder after using free operations
//
//                // Then, use the costly operations for any remaining difference
//                int cost = diff / 3 + (diff % 3 > 0 ? 1 : 0); // Number of operations that cost 1
//
//                currentCost += cost;
//            }
//
//            // Update the minimum cost encountered
//            minCost = Math.min(minCost, currentCost);
//        }
//
//        return minCost;
//    }
