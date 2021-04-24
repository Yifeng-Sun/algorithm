package test;

import java.util.Scanner;
import java.math.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int intString = sc.nextInt();
        int[] a = new int[length];
        for(int i = 0; i < length; i++){
            a[i] = intString / (int)(Math.pow(10, (length - i - 1)));
            intString -= a[i] * Math.pow(10, (length - i - 1));
        }
        for(int j = 0; j < length; j++){
            for(int k = 0; k < j; k ++){
                if((a[j] + a[k]) == 10){
                    a[j] = Integer.MAX_VALUE;
                    a[k] = Integer.MAX_VALUE;
                }
            }
        }

        int cnt = 0;
        for(int h = 0; h < length; h++){
            if(a[h] != Integer.MAX_VALUE){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}