package DSA.SlidingWindowTechnique;

public class MaxSubArraySum {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int windowSize = 3;
        int sum=0;
        int maxSum = 0;
        for(int i=0; i<windowSize; i++){
            sum = sum + arr[i];
        }
        maxSum = sum;
        for(int i=1; i<=arr.length-windowSize; i++){
            sum = sum - arr[i-1] + arr[i+windowSize-1];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
