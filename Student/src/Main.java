
public class Main {
    public static void main(String[] args) {
        Student johnny = new Student("Johnathan","James",2024,3.97,"Math");
        System.out.println(johnny.expectedGradYear);
        System.out.println(johnny.GPA);
        johnny.incrementGradYear(1);
        System.out.println(johnny.expectedGradYear);
    }

}