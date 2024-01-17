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
    public static void pintStrInloop(String str){
        for (int i=0;i<str.length();i++){
        int j=i;
        while (str.length() > j){
            j++;
           String newString= str.substring(i,j);
            System.out.println(newString);
        }
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        pintStrInloop(str);
    }
}
