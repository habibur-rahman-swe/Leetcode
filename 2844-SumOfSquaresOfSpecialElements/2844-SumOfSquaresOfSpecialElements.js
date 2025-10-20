// Last updated: 10/20/2025, 11:33:18 AM
/**
 * @param {number[]} nums
 * @return {number}
 */
var sumOfSquares = function(nums) {
    var sum = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums.length % (i + 1) == 0) sum += nums[i] * nums[i];
    }
    return sum;
};