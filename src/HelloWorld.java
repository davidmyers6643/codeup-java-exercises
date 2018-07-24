public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello,You!");




//
//      1  Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//
//        int myFavoriteNumber;
//        myFavoriteNumber + 7;
//        System.out.println(myFavoriteNumber);

//      2  Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//
//          String myString = "David";
//          System.out.println(myString);

//      3  Change your code to assign a character value to myString. What do you notice?
//
//        myString = "not David";
//        System.out.println(myString);

//      4  Change your code to assign the value 3.14159 to myString. What happens?
//
//      5  Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//
//        long myNumber;
//        System.out.println(myNumber);

//      6  Change your code to assign the value 3.14 to myNumber. What do you notice?
//
//        myNumber = 3.14;
//        System.out.println(myNumber);

//      7  Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//
//        myNumber = 123L;
//        System.out.println(myNumber);

//      8  Change your code to assign the value 123 to myNumber.
//
//      9  Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
//     10  Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//
//        float myNumber1 = (float) 3.14;

//     11  Copy and paste the following code blocks one at a time and execute them
//
//
//          int x = 5;
//          System.out.println(x++);
//          System.out.println(x);
//
////        int x = 5;
////        System.out.println(++x);
////        System.out.println(x);

//      12  What is the difference between the above code blocks? Explain why the code outputs what it does.
//
//      13  Try to create a variable named class. What happens?
//
//      14  Rewrite the following expressions using the relevant shorthand assignment operators:





//        int myFavoriteNumber;
//        myFavoriteNumber + 7;
//        System.out.println(myFavoriteNumber);

        String myString = "David";
        System.out.println(myString);

        myString = "not David";
        System.out.println(myString);

        long myNumber;

//        myNumber = 3.14;
//        System.out.println(myNumber);

        myNumber = 30000000000L;
        System.out.println(myNumber);


        float myNumber1 = (float) 3.14;

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        int x = 4;
        x = x + 5;

        int x = 3;
        int y = 4;
        y *= x;

        int x = 10;
        int y = 2;
        x = x / y;
        x/= y;
        y = y - x;
        y -= x;

        System.out.println(y);
        System.out.println(x);

    }
}