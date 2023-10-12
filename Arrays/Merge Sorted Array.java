// brute-force Approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[]=new int[m+n];
        int len1=0,len2=0,pos=0;
        while(len1<m && len2<n){
            if(nums1[len1]>nums2[len2]) ans[pos++]=nums2[len2++];
            else ans[pos++]=nums1[len1++];
        }
        while(len1<m){
            ans[pos++]=nums1[len1++];
        }
        while(len2<n){
            ans[pos++]=nums2[len2++];
        }
        for(int i=0;i<m+n;i++){
            nums1[i]=ans[i];
        }
    }
}

// Best solution
