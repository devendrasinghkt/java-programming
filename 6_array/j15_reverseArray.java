
public class j15_reverseArray {
    public static void print(int[] array ) {
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
    }
    // second fn ma array or first fn ma array dono array apna fn ka liya alag kam kar raha hai;
    // without swap code is clean visible but not for good long programming;
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
    int[] arr =  {1,32,23,42,64,4,7};
    print(arr);
    int i=0;
    int j = arr.length-1;
    while(i<j){
        swap(arr,i,j);
        i++;
        j--;
    }
     print(arr);
    }
}
