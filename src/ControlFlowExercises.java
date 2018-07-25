public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
////        boolean condition = true;
//        while (i <= 15) {
//            System.out.print(i);
//            System.out.print(" ");
//            i += 1;
//        }
//
//
//        int f = 0;
//        do {
//            System.out.println(f);
//            f += 2;
//        } while (f <= 100);
//
//
//
//
//        int g = 100;
//        do {
//            System.out.println(g);
//            g -= 5;
//        } while (g >= -10);
//
//
//

        long e = 2;

        do{
            System.out.println(e);
            e *= e;
        } while (e <=65536);

        for (int d = 0; d <= 100; d+=1) {
            if (d % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (d % 5 == 0){
                System.out.println("Buzz");
            } else if (d % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(d);
            }
        }
    }
}
