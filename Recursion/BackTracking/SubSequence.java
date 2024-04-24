package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    static List<String> getAll(String str){
        // base case 
        if(str.length()==0){
            // prepare a list
            List<String> l1=new ArrayList<>();
            l1.add("");
            return l1;
        }
        List<String> newList=new ArrayList<>();
       List<String>oldList= getAll(str.substring(1));
       for(int i=0;i<oldList.size();i++){
        newList.add(oldList.get(i)); // not include
        newList.add(str.charAt(0) +oldList.get(i));
       }
       return newList;
    }
    public static void main(String[] args) {
        List <String> ans=getAll("amit");
        System.out.println(ans);
    }
}
