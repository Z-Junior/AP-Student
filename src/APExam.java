/**
 * Write a description of class APExam here.
 */
public class APExam
{
    // instance variables   
    private String mySubject;   //subject
    private int myScore;        //an integer between 1 and 5

    /**
     * Default Constructor for objects of class APExam
     */
    public APExam()
    {
        this.mySubject = "";
        this.myScore = 1;
    }

    /**
     * Other Constructor for objects of class APExam
     */
    public APExam(String subject, int score)
    {
        this.mySubject = subject;
        this.myScore = score;
    }

    /**
     * sets an AP test subject
     */
    public void setSubject(String newSub)
    {
        this.mySubject = newSub;
    }

    /**
     * sets an AP test score
     */
    public void setScore(int newScore)
    {
        this.myScore = newScore;
    }

    /**
     * returns the AP test subject
     */
    public String getSubject()
    {
        return this.mySubject;
    }

    /**
     * returns the AP test score
     */
    public int getScore()
    {
        return this.myScore;
    }

    /**
     * compares two APExams
     */
    public int compareTo(APExam a)
    {
        return this.getScore() - a.getScore();
    }

    /**
     * tests for equality two APExams
     */
    public boolean equals(APExam a)
    {
        return this.mySubject.equalsIgnoreCase(a.getSubject()) && this.myScore == a.getScore();
    }

    /**
     * Prints APExam Data
     */
    public String toString()
    {
        return String.format("%s: %d", this.mySubject, this.myScore);
    }
}

