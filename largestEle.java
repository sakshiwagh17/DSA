//find the largest element in an array
public class largestEle {
    public static void main(String[] args){
        int[] arr={23,12,34,5,60};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
