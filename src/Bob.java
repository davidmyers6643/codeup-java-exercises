import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        System.out.print("Please say something to Bob.");
        Scanner input = new Scanner(System.in);

        String msg = input.nextLine();
        String uppercaseVer = msg.toUpperCase();
        boolean answer = true;
        if (msg.endsWith("?")) {
            System.out.println("Sure");
        } else if (msg.endsWith("!") || (uppercaseVer.equals(msg) && !msg.isEmpty())){
            System.out.println("Whoa, chill out");
        }else if (msg.isEmpty() || msg.equals("BOB")){
            System.out.println("Fine. Be that way!");
            }else {
            System.out.println("Whatever");
        }
        System.out.print("Would you like to ask Bob another question? (y/n)");
        String msg1 = input.next();
        if (!msg1.equalsIgnoreCase( "y")) {
            answer = false;

        }while (answer);



//        Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//        He answers 'Whatever.' to anything else.


//        boolean "Sure" = true;
//        boolean "Whoa,chill out!" = true;
//        boolean "Fine, Be that way!" = true;
//        boolean "Whatever" = true;

//        do {
//            System.out.print("Please say something to Bob.");
//            String search = "?";
//            String search = "!";
//            String search = "Bob";
//            String statement = sc.next();
//
//
//            if () {
//                System.out.println();
//            } else if () {
//                System.out.println("B");
//            }
//        }
    }
}