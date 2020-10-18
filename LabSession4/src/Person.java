public class Person
{
    //first name of person
    private String firstName;
    //last name of person
    private String lastName;
    
    /**
     * create person
     *
     * @param firstName first name of the person
     * @param lastName  last name of the person
     */
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof Person))
            return false;
        Person person = (Person) object;
        if (firstName.equals(person.firstName) && lastName.equals(person.lastName))
            return true;
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return 3 * firstName.hashCode() + lastName.hashCode();
    }
    
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
