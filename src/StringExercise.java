public class StringExercise {
    public static void main(String[] args) {


//        .equals(String anotherString)

        String one = "2";
        String two = "2";
        System.out.println(one.equals(two));


//        .equalsIgnoreCase(String anotherString)

        String greeting = "howdy";
        System.out.println(greeting.equalsIgnoreCase("HoWDy"));


//        .startsWith(String prefix)

        String title = "Dr. Doctor";
        boolean isADoctor = title.toLowerCase().startsWith("dr");
        System.out.println(isADoctor);


//        .endsWith(String suffix)

        String travisParkAddress = "311 E Travis St, San Antonio, TX 78205 ";
        String codeUpZip = "78205";
        boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);

        System.out.println(sameZipAsCodeup);


////        .charAt(int index)
////        consider that this method returns a char type and not a String type
//
//        boolean firstLetterCapitalized = false;
//        String word = "Test";
//
//        char firstLetter = word.charAt(0);
//
//        if (firstLetter == Character.toUpperCase(firstLetter)) {
//            firstLetterCapitalized = true;
//        }
//
//        System.out.println(firstLetterCapitalized);
//
//
//
////       .indexOf(String subString)
//
//        String cat = "cat";
//        System.out.println(cat.indexOf("at"));
//
//
////        .lastIndexOf(String subString)
//
//        String good = "Good";
//        System.out.println(good.lastIndexOf("o"));
//
//
////        .length()
//
//        String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(longestWord.length());
//
//
////        .replace(char oldChar, char newChar)
//
//        String search = "tiny cats looking cute";
//        String parsedSearch = search.replace(' ', '+');
//        System.out.println(parsedSearch);
//
//
////        .substring(int beginIndex[, int endIndex])
//
//        String name = "Justin Bob Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//        String lastName = name.substring(name.indexOf(" ") + 1);
//        System.out.println(firstName);
//        System.out.println(lastName);
//
//
////        .toLowerCase()
////        .toUpperCase()
//
//        String hello = "hELlo";
//        System.out.println(hello.toUpperCase());
//        System.out.println(hello.toLowerCase());
//        System.out.println(hello);
//
//
////        .trim()
//
//        String input = "   bob      smith \n\n  ";
//        String trimmedInput = input.trim();
//        System.out.print("|" + input + "|");
//
//
////         convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)
//
//    String word1 = "Test";
//    String pigLatinWord = word1.trim()
//            .toLowerCase().substring(1)
//            .concat(word1.substring(0, 1).toLowerCase()).concat("ay");
//    System.out.println(pigLatinWord);









        boolean firstLetterCapitalized = false;
        String word = "Test";
        char firstLetter = word.charAt(0);
        if (firstLetter == Character.toUpperCase(firstLetter));
        firstLetterCapitalized = true;
        System.out.println(firstLetterCapitalized);





    String cat = "cat";
        System.out.println(cat.indexOf("at"));



        String search = "tiny cat looking cute";
        String parsedSearch = search.replace(' ',   '+');
        System.out.print(parsedSearch);



        String name = " David Myers";
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1);
        System.out.println(firstName);
        System.out.println(lastName);

 String hello = "hELlo";
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());
        System.out.println(hello);


        String input = "     bob     smith \n\n   ";
        String trimmedInput = input.trim();
        System.out.print("|" + input + "|");


        String word1 = "Test";
        String pigLatinWord = word1.trim()
                .toLowerCase().substring(1)
                .concat(word1.substring(0, 1).toLowerCase() + "ay").concat("ay");
        System.out.println(pigLatinWord);


        String message = "We don't need no education\nWe don't need no thought control";
        System.out.println(message);

        String message1 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message1);

        String message2 = "In windows, the main drive is usually C:\\";
        System.out.println(message2);

        String message3 = "I can do backslashes \\, double backslashes \\\\," + "\nand the amazing triple backslash \\\\\\!";
        System.out.println(message3);











    }
}