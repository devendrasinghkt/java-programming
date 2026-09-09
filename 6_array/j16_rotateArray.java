public class j16_rotateArray {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    int[] arr = {2,1,5,8,9,15};
    // int k = 5 ;
    //desiderd output {9,15,2,3,4,5,8}
    print(arr);
    int i =0;
    int j = arr.length-1;
    
    while (i<j) {              //reverse
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    print(arr);
    }
}
