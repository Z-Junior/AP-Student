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
          
    }

    /**
     * Other Constructor for objects of class APStudent
     */
    public APStudent(String f, String l)
    {
           
    }

    /**
     *  returns first name
     */
    public String getFirstName()
    {
              
    }

    /**
     *  returns last name
     */
    public String getLastName()
    {

        
    }

    /**
     *  returns AP Exams
     */
    public ArrayList<APExam> getmyExams()
    {
                
    }

    /**
     *  sets first name
     */
    public void setFirstName(String fName)
    {
              
    }

    /**
     *  sets last name
     */
    public void setLastName(String lName)
    {      
               
    }

    /**
     *  add an exam to myExams
     */
    public void addExam(APExam e)
    {      
            
    }

    /**
     *  returns the student's average score on all exams
     */
    public double computeExamAverage()
    {      
             
    } 

    /**
     *  returns the highest exam score that the student has earned
     *  
     */
    public int findHighestExamScore()
    {       
       
    } 

    /**
     *  returns the number of scores that were a 5
     *  
     */
    public int numberOfFives()
    {       
           
    } 

    public String toString()
    {
        return (myFirstName + " " + myLastName + " " + myExams);
    } 
}
