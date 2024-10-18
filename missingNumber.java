//find the missing number
public class missingNumber {
    public static int findnum(int arr[]){
        int n=arr.length;
        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=arr[i];
        }
        return sum-sum2;
    }
    public static void main(String[] args){
        int[] arr={4,0,3,1};
        System.out.println(findnum(arr));
    }
}
