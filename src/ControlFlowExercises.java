public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;
        boolean condition = true;


        while (condition) {
            if (i == 15){
                condition = false;
            }
            System.out.println(i);
            i++;

        }
    }
}
