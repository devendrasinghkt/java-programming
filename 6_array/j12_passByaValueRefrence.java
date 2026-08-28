public class j12_passByaValueRefrence {
    // // Pass by value  ( Changing is not possible ) due to value concepts
    // public static void change(int y) {
    //     y = 23;
    // }
    // public static void main(String[] args) {
    // int x = 10;
    // System.out.println(x);
    // change(x);
    // System.out.println(x); 
    // }

    // Pass by Refrence  ( Changing is possible ) due to refrence concepts

    public static void change(int[] y) {
        y[0] = 23;
    }
    public static void main(String[] args) {
    int x[] = {10};
    System.out.println(x[0]);
    change(x);
    System.out.println(x[0]); 
    }

}
