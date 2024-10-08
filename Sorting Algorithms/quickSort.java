public class quickSort {
    
    public static void main(String[] args) {
        
        int nums[] = {34, 7, 23, 34, 5, 62, 12, 15, 78, 1};


        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        quick_sort(nums, 0, nums.length - 1);

        System.out.println();
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

    public static void quick_sort(int[] nums, int low, int high) {

        if(low < high){

            // Partition the array and get the pivot index
            int pi = partition(nums, low, high);

            // Sort elements before and after partition
            quick_sort(nums, low, pi - 1);
            quick_sort(nums, pi + 1, high);
        }
        
    }

    // Partition function: places the pivot element in its correct position
    private static int partition(int[] nums, int low, int high) {
        
        int pivot = nums[low]; // Choose the first element as pivot
        int i = low;
        int j = high;

        // Continue until the two pointers meet
        while(i < j){

            // Move 'i' to the right until an element greater than pivot is found
            while(nums[i] <= pivot && i <= high - 1)
                i++;

            // Move 'j' to the left until an element smaller than pivot is found
            while(nums[j] > pivot && j >= low + 1)
                j--;

            // If 'i' is still less than 'j', swap their elements
            if(i < j){ 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

        }

        // Place the pivot in the correct position by swapping with 'j'
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }
}


// Quick Sort Description and Steps:
// Divide and Conquer: Quick sort uses the divide-and-conquer approach by selecting a pivot element and partitioning the array into two halves.
// Partitioning: Elements smaller than the pivot are moved to the left, and larger elements are moved to the right.
// Recursive Sorting: The quick sort function recursively sorts the left and right halves after partitioning.

// Efficiency: Quick sort has an average time complexity of O(n log n) and worst-case O(n^2). The space complexity is O(log n) due to recursive function calls.
