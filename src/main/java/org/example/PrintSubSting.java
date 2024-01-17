package org.example;

public class PrintSubSting {
    public static void pintStr(String str){
        if(str.length()<1){
            return;
        }
        int j=0;
        while (str.length() > j){
            j++;
           String newString= str.substring(0,j);
            System.out.println(newString);
        }
        pintStr(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "abcd";
        pintStr(str);
    }
}
