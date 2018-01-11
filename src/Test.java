import java.util.Scanner;

public class Test
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        String first;
        String last;
        String input = "";
        int score;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Student's first name: ");
        first = scan.next();

        System.out.println("Enter a Student's last name: ");
        last = scan.next();

        APStudent currStudent = new APStudent(first, last);
        while(!input.equals("end"))
        {
            System.out.println("Enter a Student's AP Subject or \"end\" to quit: ");
            scan.nextLine();
            input = scan.nextLine();
            if(input.equals("end"))
                break;

            System.out.println("Enter a Student's AP Score: ");
            score = scan.nextInt();
            APExam currExam = new APExam(input, score);
            currStudent.addExam(currExam);

        }
        System.out.println("Average exam score: "+ currStudent.computeExamAverage());
        System.out.println("Highest exam score: " + currStudent.findHighestExamScore());
        System.out.println("Number of 5's: " + currStudent.numberOfFives());
    }
}
