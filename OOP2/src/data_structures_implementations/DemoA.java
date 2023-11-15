package data_structures_implementations;
public  class DemoA{
    public static void main(String[] args) {
       int nums[] = {5,7,9,11,13};

       int target = 11;

       int result1 = linearSearch(nums, target);
       //int result2 = binarySearch(nums, target);

       if (result1 != -1)
        System.out.println("Element found at index: " + result1);
    else
        System.out.println("Element not found");
    }
    //linear search
    private static int linearSearch(int[] nums, int target){
        int steps = 0;
        for(int i = 0; i < nums.length; i++){
            steps++;
            if(nums[i] == target)
                System.out.println("Steps taken by linear: " + steps);
                return i;
        }
        System.out.println("Steps taken by linear: " + steps);
        return -1;
    }

    //binary search
    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int steps = 0;

        while(left <= right){
        steps++;
            int mid = (left + right)/2;
            if(nums[mid] == target){
                System.out.println("Binary search took " + steps + "steps");
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        System.out.println("Binary search took " + steps + "steps");
        return -1;
    }
}