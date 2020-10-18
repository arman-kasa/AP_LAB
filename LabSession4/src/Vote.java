import java.util.Date;

public class Vote
{
    //the person who is voted for
    private Person voter;
    //date of vote
    private Date date;
    
    /**
     * set vote
     *
     * @param voter the voter
     * @param date  the date of vote
     */
    public Vote(Person voter, Date date)
    {
        this.voter = voter;
        this.date = date;
    }
    
    @Override
    public boolean equals(Object vote)
    {
        if (!(vote instanceof Vote))
            return false;
        if (voter.equals(((Vote) vote).getVoter()))
            return true;
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return 27 * voter.hashCode() + date.hashCode();
    }
    
    public Person getVoter()
    {
        return voter;
    }
    
}
