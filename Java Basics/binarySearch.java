public class binarySearch {
    
    public static void main(String[] args) {
        
        int nums[] = {5,7,9,11,13,20,22,23,27};

        int target = 20;

        int result = binary_search(nums, target);

        if(result == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found at index " + result);

    }

    public static int binary_search(int nums[], int target){

        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int mid;

        while(start <= end){

            mid = (start + end) / 2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;

        }

        return -1;
    }

}
