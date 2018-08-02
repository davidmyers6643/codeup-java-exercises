import java.util.*;


public class ServerNameGenerator {


    private static String[] adjectives = {"amazing", "awful", "awkward", "beautiful", "hollowed",
            "tangy", "rich", "gruesome", "dedicated", "happy"
    };
    private static String[] nouns = {"atom", "particle", "space", "home", "vehicle",
            "ship", "rock", "critter", "whale", "photon",
    };


    private static String getRandom(String[] strings) {
        return strings[getRandomNumberInRange(0, strings.length - 1)];
    }

    private static int getRandomNumberInRange ( int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args){


        System.out.printf(
                "Here is your server name: %n%s-%s ",
                getRandom(adjectives),
                getRandom(nouns));
        System.out.println();


    }


}




