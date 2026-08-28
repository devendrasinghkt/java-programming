public class j13_swapingOfTwoNoFn {
    //     // Pass by value  ( Changing is not possible ) due to value concepts
    // public static void swap(int x,int y){
    //     int temp = x;
    //     x = y;
    //     y = temp;
        
    // }
    // public static void main(String[] args) {
    //     int a = 10;
    //     int b = 20;
    //     System.out.println(a+" "+b);
    //     swap(a,b);
    //     System.out.println(a+" "+b);
    // }


    // Pass by refrence  ( Changing is possible ) due to refrence concepts
    public static void swap(int[] x,int[] y){
        int temp = x[0];
        x[0] = y[0];
        y[0] = temp;
        
    }
    public static void main(String[] args) {
        int[] a = {10};
        int[] b = {20};
        System.out.println(a[0]+" "+b[0]);
        swap(a,b);
        System.out.println(a[0]+" "+b[0]);
    }
}
