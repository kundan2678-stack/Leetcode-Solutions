class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0;
        int n = nums1.length, m = nums2.length;

        int temp[] = new int[Math.min(n,m)];
        int k =0;

        while(i < n && j <m){
            if(nums1[i] <nums2[j]){
                i++;
            }
            else if( nums1[i] > nums2[j]) {
                j++;
            }
            else {
                if( k == 0|| temp[k-1] != nums1[i]) {
                    temp[k++] = nums1[i];
                }
                i++;
                j++;
            }
        }
        return Arrays.copyOf(temp, k);
        
    }
}