//Program to find second largest ele in an array
public class secondlargestele {
    public static int secondlargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];

            }else if(arr[i]>second&&arr[i]!=largest){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,3};
        System.out.println(secondlargest(arr));
    }
}
