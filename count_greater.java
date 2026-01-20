//given N array count number of elemnts having atleat one elemnt greater than itself?

//obersvation: for every max elemnt, there won't be any elemnt greater than itself

//pueso code: . iterate and find the max elemnt, 
//.iterate and get the number of elemnt that are not equals to max,
//.increment the count.

//code:

public class count_greater {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,1};
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                if (arr[i]<arr[j]){
                    count++;
                    break;
                }
            }    
        }
        System.out.println("max elemnt count than itself:"+count);                                                                                                                                                                                             
    }
    
}
