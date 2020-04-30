public class Student {
    String firstName;
    String lastName;
    int expectedGradYear;
    double GPA;
    String declaredMajor;

    // constructor (non-static classes have instances and the constructor creates those)
    public Student (String firstName, String lastName,
                    int expectedGradYear, double GPA,
                    String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGradYear = expectedGradYear;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public void incrementGradYear(int by){
        this.expectedGradYear += by;
    }

}
