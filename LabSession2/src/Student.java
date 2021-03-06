public class Student
{
    // the student’s first name
    private String firstName;

    // the student’s last name
    private String lastName;

    // the student ID
    private String id;

    //the grade
    private int grade;

    /**
     * Create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lname last name of student
     * @param sID student ID
     */
    public Student(String fName, String lname, String sID)
    {
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }

    /**
     *get the first name of student
     * @return firstName field
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param fName set first name of a student
     */ public void setFirstName(String fName)
    {
        firstName = fName;
    }

    /**
     *get the last name of student
     * @return lastName field
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lName set first name of a student
     */ public void setLastName(String lName)
    {
        lastName = lName;
    }

    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade()
    {
        return grade;
    }

    /**
     * @param grade set the grade of a student
     */
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    /**
     * set student id
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return student id
     */
    public String getId()
    {
        return id;
    }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }
}
