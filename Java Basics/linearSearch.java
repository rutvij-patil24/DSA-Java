public class linearSearch {

    public static void main(String[] args) {
        
        int nums[] = {5,7,9,11,13};

        int target = 11;

        int result = linear_search(nums, target);

        if(result == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found at index " + result);

    }

    public static int linear_search(int nums[], int target){

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}

// Time Complexity: O(n)
