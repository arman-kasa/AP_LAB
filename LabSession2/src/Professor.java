public class Professor
{
    //name of the professor
    private String name;
    private int age;
    //professor id in the faculty
    private int pid;
    
    public Professor(String name, int age, int pid)
    {
        this.name = name;
        this.age = age;
        this.pid = pid;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getPid()
    {
        return pid;
    }
    
    public void print()
    {
        System.out.println("Name: " + name + "\tAge: " + age + "\tProfessor ID: " + pid);
    }
}
