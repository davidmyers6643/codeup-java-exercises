import java.util.Scanner;
public class MethodsExercises {

//    static String name = "David";


    public static void main(String[] args) {
        System.out.println(myAddMult(5, 5));
    }

//
//
//
//
//        eatCereal();
        Scanner sc = new Scanner(System.in);
//        System.out.println(name + "'s CLI app");
//        count();
//        count(6);
//        boolean res = isOne(1);
//        System.out.println(res);
//
//        System.out.println(isOne( 1));
//        System.out.println(isOne( -1));
//        System.out.println(isOne( 5));

//        count(5);
//        count(4);
//        count(3);
//        count(2);
//        count(1);
//
//    }
//
//    public static boolean isOne(int number) {
//        return number == 1;
//    }
//
//    public static boolean isOne(String numberAsString) {
//        return numberAsString.equals("1");
//    }
//    public static void eatCereal(){
//    System.out.println("get bowl, spoon, milk and cereal.");
//    System.out.println("pour cereal and milk in bowl");
//    System.out.println("Eat Yo Cereal!");
//    }
//
//
//
//
//    public static void count() {
//         for (int i = 5; i > 0; i--) {
//             System.out.println(i);
//         }
//     }
//
//
//
//
//    public static void count(int n) {
//             if(n <= 0){
//                 System.out.println("Done");
//                 return;
//             }
//             System.out.println(n);
//             count(n-1);
//
//        ---------------------First Exercise-----------------

//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(3, 4));
//        System.out.println(multiplication(5, 6));
//        System.out.println(division(7, 8));
//        System.out.println(modulus(10, 3));



//        for (int i = 0; i <= 10; i++) {
//            System.out.println("i = " + (i+1);
//
//
//            }


    public static int myAddMult(int n1, int n2){
        int total = 0;
        while (n2 > 0){
            total += n1;
            n2 -= 1;
            }
        return total;
    }
//        count(50);

//
//            System.out.print("Enter value of A -> ");
//            Scanner s=new Scanner(System.in);
//            double j=s.nextInt();
//            System.out.print("Enter value of B -> ");
//            Scanner p=new Scanner(System.in);
//            double k=p.nextInt();
//            double m=(1/k);
//            double l=(j/m);
//            System.out.print("Multiplication of A & B=> "+l);
//

    }

////    addition
//        public static int addition ( int var1, int var2){
//            return var1 + var2;
//        }
////        subtraction
//        public static int subtraction ( int var1, int var2){
//            return var1 - var2;
//        }
////    multiplication
//        public static int multiplication ( int var1, int var2){
//            return var1 * var2;
//        }
////    division
//        public static int division ( int var1, int var2){
//            return var1 / var2;
//        }
////    modulus
//        public static int modulus ( int var1, int var2){
//            return var1 % var2;
//        }

//        public static int altMultiplication (int var1,int var2) { return var1 / var2; }

        // polymorphism = same method name, different params
//        public static float altMultiplication (float var1,float var2) { return var1 / var2; }


//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 5);
//    }









