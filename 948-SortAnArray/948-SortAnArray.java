// Last updated: 10/20/2025, 11:41:29 AM
class Solution {
    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    private void heapify(int[] nums, int n, int i) {
        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(nums, i, largest);
            heapify(nums, n, largest);
        }
    }

    private void heapSort(int[] nums) {
        int n = nums.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            swap(nums, 0, i);
            heapify(nums, i, 0);
        }
    }

    public int[] sortArray(int[] nums) {
        heapSort(nums);
        return nums;
    }
}