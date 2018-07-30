public class Student {

        public String name;
        public String cohort;
        public Student(String studentName) {
            name = studentName;
            cohort = "Unassigned";
        }
        public Student(String studentName, String assignedCohort) {
            name = studentName;
            cohort = assignedCohort;
        }


}
