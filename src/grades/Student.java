//package grades;
//import java.util.*;
//
//
//public class Student {
//
//    private Scanner sc = new Scanner(System.in);
//
//    protected int id;
//    protected String name;
//    protected String year;
//    protected double grade;
//    protected String githubUserName;
//
//
//
//
//    public Student(int id, String name, String year, double grade, String githubUserName) {
//        this.grade = grade;
//        this.name = name;
//        this.id = id;
//        this.year = year;
//        this.githubUserName = githubUserName;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public double getGrade() {
//        return grade;
//    }
//
//    public String getgithubUserName() {
//        return githubUserName;
//    }
//
//    public String getString(String prompt){
//        System.out.println(prompt);
//        return this.sc.nextLine().toLowerCase().trim();
//    }
//
//    public boolean yesNo(){
//        String result = this.getString("Type yes or no (y/n)");
//        return (result.equals("y") || result.equals("yes"));
//    }
//
//
//}
package grades;
import java.util.*;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

}
