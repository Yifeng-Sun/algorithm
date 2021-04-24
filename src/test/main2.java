package test;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.valueOf(sc.nextLine());
        String line  = sc.nextLine();
        int[] a = new int[length];
        for(int i = 0; i < length; i++){
            a[i] = line.charAt(i) - 48;
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