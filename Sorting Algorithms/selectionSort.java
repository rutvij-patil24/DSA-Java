
public class selectionSort {

    public static void main(String[] args) {
        
        int nums[] = {34, 7, 23, 34, 5, 62, 12, 15, 78, 1};


        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < nums.length-1; i++) {

            int minIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;      

        }

        System.out.println();
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
    
}

// Steps:
// Find the minimum element: For each pass, find the smallest element from the unsorted part of the array.
// Swap with the current position: Swap the smallest element found with the first unsorted element.
// Move to the next position: Repeat the process for the next unsorted element.
// Continue till sorted: Repeat until the entire array is sorted.

// Time Complexity:
// Worst-case is O(n²) (because of the two nested loops).

// Space Complexity:
// O(1) (since sorting is done in place, requiring no extra space).
