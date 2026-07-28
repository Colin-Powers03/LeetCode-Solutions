class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r) {
            int mid = l + ((r - l) / 2);
            if(nums[mid] > nums[r]) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }
        
        int pivot = l;
        int ans = binarySearch(nums, target, 0, pivot - 1);
        if(ans != -1) {
            return ans;
        }
        return binarySearch(nums, target, pivot, nums.length - 1);

    }

    public int binarySearch(int[] nums, int target, int l, int r) {
        while(l <= r) {
            int mid = l + ((r - l) / 2);
            if(nums[mid] < target) {
                l = mid + 1;
            }
            else if(nums[mid] > target) {
                r = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
