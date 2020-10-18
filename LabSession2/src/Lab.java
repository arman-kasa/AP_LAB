//TODO:: add professor
public class Lab
{
    //enrolled students
    private Student[] students;

    //average grade of the students
    private double avg;

    //Lab start day
    private String day;

    //lab capacity
    private int capacity;

    //number of enrolled students
    private int currentSize;

    private Professor professor;

    public Lab(int cap, String d, Professor p)
    {
        currentSize = 0;
        capacity = cap;
        professor = p;
        day = d;
        students = new Student[capacity];
    }

    /**
     * enrolls a new student to the class
     * @param std the student to enroll
     */
    public void enrollStudent(Student std)
    {
        if (currentSize < capacity)
        {
            students[currentSize] = std;
            currentSize++;
        }
        else
        {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * prints Student info and average grade of the class
     */
    public void print()
    {
        //print students info
        for (int i = 0; i < currentSize; i++)
        {
            System.out.println("first name: " + students[i].getFirstName()
                    + " id:" + students[i].getId()
                    + " grade:"+ students[i].getGrade());
        }

        //calculate and print average
        calculateAvg();
        System.out.println("Lab AVG: " + getAvg());
    }

    /**
     * @return lab enrolled students
     */
    public Student[] getStudents()
    {
        return students;
    }

    /**
     * initialize students
     * @param students the student list to add
     */
    public void setStudents(Student[] students)
    {
        for (Student std : students)
        {
            if (currentSize < capacity)
            {
                this.students[currentSize] = std;
                currentSize++;
            }
            else
            {
                System.out.println("Lab is full!!!");
                break;
            }
        }
        //this.students = students;
    }

    /**
     * @return average of class
     */
    public double getAvg()
    {
        return avg;
    }

    /**
     * calculate the average of the class
     */
    public void calculateAvg()
    {
        int sum = 0;
        for (int i = 0; i < currentSize; i++)
        {
            sum += students[i].getGrade();
        }
        avg = (double)sum / students.length;
    }

    /**
     * @return field day
     */
    public String getDay()
    {
        return day;
    }

    /**
     * set day of the lab
     * @param day the day to set
     */
    public void setDay(String day)
    {
        this.day = day;
    }

    /**
     * @return capacity day
     */
    public int getCapacity()
    {
        return capacity;
    }

    /**
     * set capacity of the lab
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
}