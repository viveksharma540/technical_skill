//given n array elemnets, count no. of eqilibrium index
//index is said to be eqilibrium index, if sum of elements on left side of ith index = sum of elements on right side of ith index.
//if i==0, leftsum=0
//if i==n-1, rightsum=0

import java.util.Scanner;

public class eqilibrium_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j=0;j<i;j++){
                leftSum += arr[j];
            }
            for(int k=i+1;k<n;k++){
                rightSum += arr[k];
            }
            if(leftSum == rightSum){
                count++;
            }
        }
        System.out.println("count of eqilbrum index: " + count);
        sc.close();
    }
}


