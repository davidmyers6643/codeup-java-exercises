//package grades;
//
//import java.util.*;
//
//public class GradesApplication {
//
//
//    public static void main(String[] args) {
//
//        Student student1 = new Student(101, "Zach", "2018", 100, "zgulde");
//        Student student2 = new Student(102, "David", "2018", 80, "davidmyers6643");
//        Student student3 = new Student(103, "Justin", "2017", 100, "jreich5");
//        Student student4 = new Student(104, "Fer", "2014", 85, "fmendozaro");
//
//
//        HashMap<Integer, Student> students = new HashMap<>();
//
//
//        students.putIfAbsent(student1.getId(), student1);
//        students.putIfAbsent(student2.getId(), student2);
//        students.putIfAbsent(student3.getId(), student3);
//        students.putIfAbsent(student4.getId(), student4);
//
//
//        System.out.println("Welcome!\n \nHere are the Github usernames of our students: \n");
//
//        for (Student githubName : students.values()) {
//            System.out.print("|" + githubName.getgithubUserName() + "| ");
//        }
//
//        System.out.println("\n");
//        double sum = 0;
//
//        for (Student student : students.values()) {
//
//
//            sum += student.getGrade();
//
//            System.out.println(student.getName() + " You Passed with a " + student.getGrade());
//        }
//
//        System.out.println(sum / students.size());
//        System.out.println(Student.yesNo());
//
//    }
//
//
//
//}

package grades;

    import util.Input;

import java.util.*;


    public class GradesApplication {

        public static Input input;

        public static void main(String[] args) {
            initApp();
        }

        public static void initApp() {

            HashMap<String, Student> students = populateData();
            System.out.println(returnWelcomeMessage(students));
            input = new Input();
            boolean willContinue;

            do {

                while(true){

                    String choice = input.getString("What student would you like to see more information on?");

                    if(!students.containsKey(choice)){
                        System.out.println("Sorry, no student found with the gihub username of " + choice);
                        System.out.println("Would you like to see another student?");

                        if(!input.yesNo()){
                            break;
                        }

                    } else {
//                    If the user key exists
                        System.out.printf("Name: %s - Gihub Username: %s\n" +
                                "Current Average: %f \n", students.get(choice).getName(), choice, students.get(choice).getGradeAverage());
                    }
                }

                System.out.println("Will you continue?");
                willContinue = input.yesNo();
                if(!willContinue){
                    System.out.println("Goodbye, and have a wonderful day!");
                }
            } while(willContinue);


        }

    public static String returnWelcomeMessage(HashMap<String, Student> students) {
        String output = "";
        output += "Welcome!\n\n";
        output += "Here are the Github usernames of our students:\n\n";
        for (String key : students.keySet()) {
            output += "|" + key + "| ";
        }
        return output.trim();
    }

    public static HashMap<String, Student> populateData() {
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Zack");
        s1.addGrade(80);
        s1.addGrade(70);
        s1.addGrade(80);
        s1.addGrade(50);

        Student s2 = new Student("David");
        s2.addGrade(80);
        s2.addGrade(40);
        s2.addGrade(80);
        s2.addGrade(30);

        Student s3 = new Student("Justin");
        s3.addGrade(80);
        s3.addGrade(20);
        s3.addGrade(80);
        s3.addGrade(100);

        Student s4 = new Student("Fer");
        s4.addGrade(80);
        s4.addGrade(100);
        s4.addGrade(80);
        s4.addGrade(100);

        students.put("zgulde", s1);
        students.put("davidmyers6643", s2);
        students.put("jreich5", s3);
        students.put("fmendozaro", s4);

        return students;
    }

}







