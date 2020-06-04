// 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。

// 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

// 你可以假设 nums1 和 nums2 不会同时为空。

 

// 示例 1:

// nums1 = [1, 3]
// nums2 = [2]

// 则中位数是 2.0

// 示例 2:

// nums1 = [1, 2]
// nums2 = [3, 4]

// 则中位数是 (2 + 3)/2 = 2.5

// 来源：力扣（LeetCode）
// 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
// 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
	if(nums1.lenghth>nums2.length){
	    return findMedianSortedArrays(nums2,nums1);
	}
	int m = nums1.length;
	int n = nums2.length;
	int left=0,rigth=m,ansi=-1;
	// median1:前一部分的最大值
	// median2:后一部分的最小值
	int median1=0,median2=0;

	while(left<=right){
	    
	}
    }
}
