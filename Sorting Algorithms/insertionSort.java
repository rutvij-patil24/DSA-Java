
public class insertionSort {

    public static void main(String[] args) {
        
        int nums[] = {34, 7, 23, 32, 5, 62, 12, 15, 78, 1};


        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }



        System.out.println();
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
    
}

// Steps:
// Start with the second element: Compare the current element with the previous ones and find its correct position in the sorted part of the array.
// Shift elements if needed: If the current element is smaller than any of the sorted elements, shift the larger elements one position to the right.
// Insert in the correct position: Place the current element in its correct position.
// Repeat: Continue this process for all elements until the array is sorted.

// Time Complexity:
// Worst-case is O(n²) (because of the two nested loops).

// Space Complexity:
// O(1) (since sorting is done in place, requiring no extra space).