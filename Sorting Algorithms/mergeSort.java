import java.util.ArrayList;

public class mergeSort {
    
    public static void main(String[] args) {
        
        int nums[] = {34, 7, 23, 34, 5, 62, 12, 15, 78, 1};

        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        merge_sort(nums, 0, nums.length-1);

        System.out.println();
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

    public static void merge_sort(int[] nums, int low, int high){

        // Base case: if the subarray has one or no elements, it's already sorted
        if(low >= high)
            return;

        else{

            // Calculate the mid-point of the array
            int mid = (low + high) / 2;

            // Recursively sort the left half
            merge_sort(nums, low, mid);

            // Recursively sort the right half
            merge_sort(nums, mid + 1, high);

            // Merge the sorted halves
            merge(nums, low, mid, high);

        }
    }

    private static void merge(int[] nums, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        // if elements on the left half are still left

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        //  if elements on the right half are still left
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // transfering all elements from tem arraylist to nums
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }

    }

}


// Merge Sort Description and Steps:
// Divide and conquer approach: The array is divided into two halves until each subarray has only one element. Then, the subarrays are merged back together in sorted order.
// Recursively sorts subarrays: It recursively divides the array into smaller arrays, sorts them, and then merges them into a larger sorted array.
// Merging phase: After sorting both halves, it merges the subarrays back together in sorted order using a temporary array.
// Stable sort: Merge sort preserves the order of equal elements in the original array.


// Time and Space Complexity:
// Time Complexity: O(n log n), because the array is divided into two halves (log n) and then merged back together (n operations).
// Space Complexity: O(n), because it uses an additional temporary array to store the sorted elements.