//given an integer a of size n, in one second you can increase the value of one elemnt by 1.
// find the minimum size in seconds to make all the element to the array equally.

//obersvation:-  to minimise the time, make all elemnt equal to the max element in the array.

// pusodo code:- 
//find the max element in the array
//for elemnt calculate how much it needs to be increased to make it equal to max element
//sum of all the differences. that sum equals to your time.

public class size_array_equal {
    public static void main(String[] args) {
        int[] arr={2,4,1,3};
        int sum=0;
        int max=arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            sum+= max-arr[i];
        }
        System.out.println(sum);

    }
    
}
