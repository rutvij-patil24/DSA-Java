
public class bubbleSort {

    public static void main(String[] args) {
        
        int nums[] = {34, 7, 23, 32, 5, 62, 12, 15, 78, 1};


        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        int n = nums.length;
        int i,j,temp;

        for (i = 0; i < n; i++) {
            
            for(j = 0; j < n-1; j++){

                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }

        }

        System.out.println();
        System.out.println("After Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
    
}

// Steps:
// Start from the first element: Compare each element with the next one in the array.
// Swap if needed: If the current element is larger than the next one, swap them.
// Repeat for all elements: Continue this process for all elements, pushing the largest element to the end of the array.
// Repeat passes: Repeat the entire process for the remaining unsorted portion until the array is fully sorted.

// Time Complexity:
// Worst-case is O(n²) (because of the two nested loops).

// Space Complexity:
// O(1) (since sorting is done in place, requiring no extra space).