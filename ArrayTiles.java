// INPUT : arr=[1,5,10]  n=27; 
// OUTPUT : [1, 1, 5, 10, 10]

import java.util.*;
class ArrayTiles{
    public static int[] arrayTiles(int[] arr,int n){
        ArrayList<Integer> set=new ArrayList<>();
        while(n>0){
            if(n>=10){
                n=n-10;
                set.add(arr[2]);
            }else if(n>=5&&n<10){
                n=n-5;
                set.add(arr[1]);
            }else{
                n=n-1;
                set.add(arr[0]);
            }
        }
        int[] result=new int[set.size()];
        for(int i=0;i<set.size();i++){
            result[i]=set.get(i);
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args){
        int[] arr={1,5,10};
        int n=27;
        System.out.print(Arrays.toString(arrayTiles(arr,n)));
    }
}
