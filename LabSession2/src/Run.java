public class Run
{
    public static void main(String[] args)
    {
        main2();
        if(1 == 1)
            return;
        //student driver
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        
        
        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        //lab driver
        Lab lab1 = new Lab(15,"1398/7/1", new Professor("pname", 40, 31));
        Student[] firstList = new Student[2];
        firstList[0] = std1;
        firstList[1] = std2;
        lab1.setStudents(firstList);
        lab1.enrollStudent(std3);
        lab1.print();

        //object call-by-reference or value?
        RefOrVal rov = new RefOrVal();
        int before, after;
        System.out.println("before calling method:");
        before = rov.zero;
        rov.print();
        //call
        TestRefOrVal(rov);
        System.out.println("after calling method:");
        after = rov.zero;
        rov.print();
        if(before == after)
            System.out.println("The numbers are the same. So the object pass is call-by-value");
        else
            System.out.println("The numbers are different. So the object pass is call-by-reference");

        //daneshkade driver
        //TODO:: daneshkade -> Lab -> Professor
    }
    
    public static void TestRefOrVal(RefOrVal rov)
    {
        rov.zero = 1;
    }
    
    
    private static void main2()
    {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Student std4 = new Student("Ali", "Rezayi", "9732054");
    
        Professor p1 = new Professor("Dr.Edalat", 35, 3106);
        Professor p2 = new Professor("Dr.Bakhshi", 45, 3107);
        
        Lab lab1 = new Lab(5, "July 1st 2018", p1);
        Lab lab2 = new Lab(8, "August 2nd 2018", p2);
        
        Faculty ce = new Faculty("Computer Engineering");
    
        ce.addProfessor(p1);
        ce.addProfessor(p2);
    
        ce.addStudent(std1);
        ce.addStudent(std2);
        ce.addStudent(std3);
        ce.addStudent(std4);
        
        ce.addLab(lab1);
        ce.addLab(lab2);
    
        ce.getLab(0).enrollStudent(std1);
        ce.getLab(0).enrollStudent(std2);
        ce.getLab(1).enrollStudent(std3);
        ce.getLab(1).enrollStudent(std4);
        
        System.out.println("Faculty name: " + ce.getName());
        ce.printProfessors();
        ce.printLabs();
        ce.printStudents();
        
        
    }
    
}