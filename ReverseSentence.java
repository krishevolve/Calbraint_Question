// INPUT : A man in the boat has 123 in the sky
// OUTPUT : y kse ht ni3 21sa hta obe ht nin amA

import java.util.*;
class ReverseSentence{
    public static String Sentence(String s){
        int i=0;
        int j=s.length()-1;
        char[] array=s.toCharArray();
        while(i<=j){
            if(array[i]==' '){
                i++;
                continue;
            }
            if(array[j]==' '){
                j--;
                continue;
            }
            char temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return new String(array);

    }

    public static void main(String[] args){
        String s="A man in the boat has 123 in the sky";
        System.out.print(Sentence(s));
    }
}
