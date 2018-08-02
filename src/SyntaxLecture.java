public class SyntaxLecture {
    public static void main(String[] args) {
        byte rating = 5;
        short aTTarena = 32755;

        System.out.println(rating);

//        implicit
        double morePrecise = aTTarena;
        System.out.println("aTTarena = " + aTTarena);
        System.out.println("morePrecise = " + morePrecise);


//        explicit
        final double pi = 3.14159;
        int almostPi = (int) pi;

        float populationThatLikeVanilla = 80.34f;
        byte chartVanilla = (byte) populationThatLikeVanilla;

        System.out.println(pi);
        System.out.println(almostPi);
    }



}
