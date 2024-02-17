package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonArrayfactor {
    public static void main(String[] args) {

        int arr1[] = {2,6};
        int arr[] = {24,48};
        Arrays.sort(arr);
//6,12
        List<Integer> integerList = IntStream.range(2, arr[0]+1)
                .filter(e -> {
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % e != 0) {
                            return false;
                        }
                    }
                    return true;
                }).boxed().collect(Collectors.toList());
        System.out.println(integerList);
        integerList.stream().filter(e -> {
            for (int i = 0; i < arr1.length; i++) {
                if (e % arr1[i] != 0) {
                    return false;
                }
            }
            return true;
        }).forEach(System.out::println);
    }

}
