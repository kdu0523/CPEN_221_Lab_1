package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;


public class Main {


    public static void main(String[] args){

            List<Integer> intList = new ArrayList<>(Arrays.asList(0,1,1,2));
        int n = 2;
        System.out.println(intList.size());

        System.out.println(isClosed(intList, n));
    }


    public static boolean isClosed(List<Integer> intList, Integer n) {
        // TODO: Implement this method

        for (int i = 0; i < intList.size() - 1; i++){
            for (int j = i + 1; j < intList.size(); j++) {

                int result = (intList.get(i) + intList.get(j)) % n;

                if (result == 0) {
                    ;
                }
                else if (result < 0) {
                    result += n;
                }

                boolean found = false;
                for (int k : intList) {
                    if (result == (k % n + n) % n) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    return false;
                }

            }



        }


        /*for (int a = 0; a < temp.size() - 1; a++) {
            for (int b = 0; b < intList.size() - 1; b++) {

                System.out.println(temp.get(b));
                System.out.println(intList.get(a));

                if (temp.get(b) != intList.get(a)) {

                    return false;
                }
                else {
                    ;
                }
            }
        }*/
            return true; // change this
    }


}