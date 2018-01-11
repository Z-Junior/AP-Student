import java.util.ArrayList;

public class APStudent
{  
    private String myFirstName;
    private String myLastName;
    private ArrayList<APExam> myExams;

    /**
     * Default Constructor for objects of class APStudent
     */
    public APStudent()
    {
        this.myFirstName = "";
        this.myLastName = "";
        this.myExams = new ArrayList<>();
    }

    /**
     * Other Constructor for objects of class APStudent
     */
    public APStudent(String f, String l)
    {
        this.myFirstName = f;
        this.myLastName = l;
        this.myExams = new ArrayList<>();
    }

    /**
     *  returns first name
     */
    public String getFirstName()
    {
        return myFirstName;
    }

    /**
     *  returns last name
     */
    public String getLastName()
    {
        return myLastName;
    }

    /**
     *  returns AP Exams
     */
    public ArrayList<APExam> getmyExams()
    {
        return myExams;
    }

    /**
     *  sets first name
     */
    public void setFirstName(String fName)
    {
        this.myFirstName = fName;
    }

    /**
     *  sets last name
     */
    public void setLastName(String lName)
    {      
        this.myLastName = lName;
    }

    /**
     *  add an exam to myExams
     */
    public void addExam(APExam e)
    {      
        this.myExams.add(e);
    }

    /**
     *  returns the student's average score on all exams
     */
    public double computeExamAverage()
    {      
        double fSum = 0.0;

        for (APExam exam : myExams)
            fSum += exam.getScore();

        return fSum / myExams.size();
    } 

    /**
     *  returns the highest exam score that the student has earned
     *  
     */
    public int findHighestExamScore()
    {
        int iHigh = 0;

        for (APExam exam : myExams)
            if (exam.getScore() > iHigh)
                iHigh = exam.getScore();
        return iHigh;
    } 

    /**
     *  returns the number of scores that were a 5
     *  
     */
    public int numberOfFives()
    {       
        int iCount = 0;

        for (APExam exam : myExams)
            if (exam.getScore() == 5)
                iCount++;
        return iCount;
    } 

    public String toString()
    {
        return (myFirstName + " " + myLastName + " " + myExams);
    } 
}
