public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
//        boolean condition = true;
        while (i <= 15) {
            System.out.print(i);
            System.out.print(" ");
            i += 1;
        }
        int f = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 100);


        int g = 100;
        do {
            System.out.println(g);
            g -= 5;
        } while (g >= -10);


        long e = 2;

        do{
            System.out.println(e);
            e *= e;
        } while (e <=65536);

        for () {}
    }
}
