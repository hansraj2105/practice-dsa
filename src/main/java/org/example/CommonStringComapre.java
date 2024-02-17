package org.example;

public class CommonStringComapre {
    public static String compareTo(String s1,String s2){
        while (s1.length()!=0){
            if(s1.equals(s2)){
                return s2;
            }
            else if(s1.startsWith(s2)){
                s1= s1.substring(s2.length());
            }
            else {
                return "";
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s2="ABCABC";
        String s1="ABC";
        if(s1.contains(s2) || s2.contains(s1)){
            if(s1.length()>s2.length()){
                System.out.println(compareTo(s1,s2));
            }else {
                System.out.println(compareTo(s2,s1));
            }
        }
    }
}
