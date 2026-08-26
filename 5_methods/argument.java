public class argument {
    ////String Argument
//     public static void main(String[] args) {
//         System.out.println(greeting("Raghav"));
//     }
//     public static String greeting(String name ){
//         return "Good morning "+name;
// }

    ////Integer Argument
    // public static void main(String[] args) {
    //     System.out.println(sum(4,5));
    // }
    // public static int sum (int a, int b){
    //     return a+b;
    // }


    //// Passing both argument without return statement
    public static void main(String[] args) {
        greeting("Raghav",25);
    }
    public static void greeting ( String name , int age){
        System.out.println("Good morning "+name + " my age is "+ age);
    }

}