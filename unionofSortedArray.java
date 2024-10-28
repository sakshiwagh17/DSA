//Union of Two Sorted Arrays with Duplicate Elements
import java.util.ArrayList;

public class unionofSortedArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer>union=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                if(union.size()==0||union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            }else
            {
                if(union.size()==0||union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(union.get(union.size()-1)!=a[i]){
                union.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(union.get(union.size()-1)!=b[j]){
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }
}
