
public class Find_Medium{
    // brute force solution
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int totalLength = n1 + n2;
        int medianIndex = totalLength / 2;

        boolean isEven = (totalLength % 2 == 0);

        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        int count = 0;
        int current = 0;
        int previous = 0;

        while (count <= medianIndex) {
            previous = current;

            if (i < n1 && (j >= n2 || nums1[i] <= nums2[j])) {
                current = nums1[i];
                i++;
            } else {
                current = nums2[j];
                j++;
            }

            count++;
        }

        if (isEven) {
            return (previous + current) / 2.0;
        } else {
            return current;
        }
    }

    // my approach
    public static double findMedianSortedArrays_my_approch(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null){
            return 1;
        }

        int n = nums1.length;
        int m = nums2.length;

        int arr[] = new int[n + m];

        int lp = 0;  // pointer for nums1
        int rp = 0;  // pointer for nums2
        int k = 0;   // pointer for arr

        // Merge both sorted arrays
        while(lp < n && rp < m){
            if(nums1[lp] < nums2[rp]){
                arr[k++] = nums1[lp++];
            }
            else{
                arr[k++] = nums2[rp++];
            }
        }

        // Remaining elements of nums1
        while(lp < n){
            arr[k++] = nums1[lp++];
        }

        // Remaining elements of nums2
        while(rp < m){
            arr[k++] = nums2[rp++];
        }

        // Find median
        int len = arr.length;

        if(len % 2 != 0){
            int mid = len / 2;
            return arr[mid];
        }
        else{
            int mid = len / 2;
            double n1 = arr[mid];
            double n2 = arr[mid - 1];

            return (n1 + n2) / 2;
        }
    }
    public static void main(String args[]){
        int num1[] = {1, 3, 5, 7};
        int num2[] = {11, 14};

        System.out.println("So the median of the two sorted arrays is : " + findMedianSortedArrays_my_approch(num1, num2));
    }
}