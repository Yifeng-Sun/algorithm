package test;

import org.junit.Assert;
import org.junit.Test;
public class Test1 {

    @Test
    public void test1() {
        Calc c = new Calc();
        Assert.assertEquals(9,c.add(3, 6));//第一个参数是期望值，第二个参数，实际值
    }
    @Test
    public void test2() {
        Calc c = new Calc();
        Assert.assertEquals(3,c.div(10, 3),0.4);//第一个参数是期望值，第二个参数，实际值，第三个参数浮动值
    }
    @Test
    public void testFindMedianSortedArray(){
        Solution solution = new Solution();
        Assert.assertEquals(2,solution.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }),0);
    }

}
class Calc {
    public int add(int a,int b) {
        return a+b;
    }
    public double div(double a,double b) {
        return a/b;
    }

}



class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int isEven = (totalLength + 1) / 2;
        if(isEven == 0){
            int firstMid = totalLength / 2 - 1;
            int i = 0;
            int j = 0;
            int mid1 = 0;
            int mid2 = 0;
            while((i + j) < firstMid){
                if(nums1[i] < nums2[j]){
                    i++;
                }else{
                    j++;
                }
            }
            if(nums1[i] < nums2[j]){
                mid1 = nums1[i];
                i++;
            }else{
                mid1 = nums2[j];
                j++;
            }
            if(nums1[i] < nums2[j]){
                mid2 = nums1[i];
                i++;
            }else{
                mid2 = nums2[j];
                j++;
            }
            float mid = (mid1 + mid2) / 2;
            return mid;
        }else{
            int midIndex = totalLength / 2;
            int i = 0;
            int j = 0;
            int mid1 = 0;
            while((i + j) < midIndex){
                if(nums1[i] < nums2[j]){
                    i++;
                }else{
                    j++;
                }
            }
            if(nums1[i] < nums2[j]){
                mid1 = nums1[i];
                i++;
            }
            return mid1;
        }


    }
}
