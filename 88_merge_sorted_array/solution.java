class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;

        int r = m + n - 1;
        m--; n--;

        while (m >= 0 && n >= 0) 
            nums1[r--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];

        while (n >= 0)
            nums1[r--] = nums2[n--];
    }
}