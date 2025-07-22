public class GradeManager {
    public static String[] reverseStudentNames(String[] names){
        String[] reversed = new String[names.length];

        for(int i = 0; i < names.length; i++){
            StringBuilder sb =  new StringBuilder(names[i]);
            reversed[i] = sb.reverse().toString();
        }
        return reversed;
    }
    public static char getLetterGrade(int score){
        if(score >= 90 && score <= 100){
            return 'A';
        } else if (score >= 80 && score <=89) {
            return 'B';

        } else if (score >= 70 && score <=79) {
            return 'C';

        } else if (score >= 60 && score <= 69) {
            return 'D';

        }else {
            return 'F';
        }
    }

    public static String[] findFailingStudents(String[] names, int[] scores) {

        int count = 0;
        for (int score : scores) {
            if (score < 60) count++;

        }
        String[] failingStudents = new String[count];
        int index = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failingStudents[index] = names[i];
                index++;
            }
        }
        return failingStudents;
    }

    public static void main(String[] args) {
        String[] students = {"Asma", "mohammed", "saif", "abdullah", "ali", "Fatma"};
        int[] scores = {95, 67, 45, 78};


        System.out.println("Reversed Students Names:");
        String[] reverseNames = reverseStudentNames(students);
        for (String name : reverseNames) {
            System.out.println(name );
        }
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < students.length; i++) {
            char grade = getLetterGrade(scores[i]);
            System.out.printf("%s: %d -> %c%n", students[i], scores[i], grade);
        }
        System.out.println("\nFailing Students:");
        String[] failing = findFailingStudents(students, scores);
        if (failing.length == 0){
            System.out.println("No one Failed");
        }else {
            for (String name : failing) {
                System.out.println(name);
        }
        }
    }
}
