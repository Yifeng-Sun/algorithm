package com.company.NEU;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] t = {1,2,1,4};
        System.out.println(solution(t));
    }

    private static List solution(int[] listGiven) {
        ArrayList<Integer> reg = new ArrayList<>();
        ArrayList<Integer> dup = new ArrayList<>();
        for(int i:listGiven){
            boolean findInReg = false;
            for(int j: reg){
                if(j == i){
                    findInReg = true;
                }
            }
            if(!findInReg){
                reg.add((Integer) i);
            }else dup.add((Integer) i);
        }
        return (List)dup;
    }
}
