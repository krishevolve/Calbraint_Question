// INPUT : abcdkighcba
// OUPUT : dkigh

import java.util.*;
class returnString{
    public static String substring(String str){
        int i=0;
        int j=str.length()-1;
        StringBuilder s=new StringBuilder();
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                for(int k=i;k<=j;k++){
                    s.append(str.charAt(k));
                }
                break;
            }
            i++;
            j--;
        }
        return s.toString();
    }
    
    public static void main(String[] args){
        String str="abcdkighcba";
        System.out.print(substring(str));
       
    }
}
