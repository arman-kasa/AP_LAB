import java.util.ArrayList;
import java.util.Iterator;

public class Faculty
{
    private String name;
    //members
    private ArrayList<Professor> professors;
    private ArrayList<Lab> labs;
    private ArrayList<Student> students;
    
    
    public Faculty(String name)
    {
        this.name = name;
        professors = new ArrayList<>();
        labs = new ArrayList<>();
        students = new ArrayList<>();
    }
    
    public Faculty(String name, ArrayList<Professor> professors, ArrayList<Lab> labs, ArrayList<Student> students)
    {
//        this.professors = new ArrayList<>();
//        this.labs = new ArrayList<>();
//        this.students = new ArrayList<>();
        
        this.professors = professors;
        this.students = students;
        this.labs = labs;
        this.name = name;
    }
    
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    
    public void setStudents(ArrayList<Student> students)
    {
        this.students = students;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void addProfessor(Professor professor)
    {
        this.professors.add(professor);
    }
    
    public void removeProfessor(int pid)
    {
        Iterator<Professor> it = professors.iterator();
        while (it.hasNext())
        {
            Professor p = it.next();
            if (p.getPid() == pid)
                it.remove();
        }
    }
    
    public void addStudent(Student std)
    {
        students.add(std);
    }
    
    public void removeStudent(String sid)
    {
        Iterator<Student> it = students.iterator();
        while (it.hasNext())
        {
            Student std = it.next();
            if (std.getId().equals(sid))
                it.remove();
        }
    }
    
    public Professor getProfessor(int index)
    {
        if(index > professors.size())
        {
            System.out.println("index wrong!");
            return null;
        }
        return professors.get(index);
    }
    
    public Lab getLab(int index)
    {
        if(index > labs.size())
        {
            System.out.println("index wrong!");
            return null;
        }
        return labs.get(index);
    }
    
    public void printProfessors()
    {
        System.out.println("Professors:");
        for (Professor professor : professors)
        {
            professor.print();
        }
        System.out.println("**************");
    }
    
    public void printLabs()
    {
        System.out.println("Labs:");
        for (Lab lab : labs) 
        {
            lab.print();
        }
        System.out.println("**************");
    }
    
    public void addLab(Lab lab)
    {
        labs.add(lab);
    }
    
    public void printStudents()
    {
        System.out.println("Students:");
        for (Student std : students)
        {
            std.print();
        }
        System.out.println("**************");
    }
}
