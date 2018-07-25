public class ControlFlowExercises {
    public static void main(String[] args) {

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
