import java.util.ArrayList;
import java.util.Date;

public class VotingSystem
{
    private ArrayList<Voting> votingList;
    
    public VotingSystem()
    {
        votingList = new ArrayList<>();
    }
    
    public void createVoting(String question, int mode)
    {
        Voting voting = new Voting(mode, question);
        votingList.add(voting);
    }
    
    public Voting getVoting(int index)
    {
        if (indexIsValid(index))
            return votingList.get(index);
        return null;
    }
    
    public void printListOfVotings()
    {
        for (Voting voting : votingList)
        {
            voting.printVoting();
        }
    }
    
    public void printVoting(int index)
    {
        if (!indexIsValid(index))
            return;
        Voting voting = votingList.get(index);
        voting.printVoting();
    }
    
    public void vote(int index, Person voter, ArrayList<String> votes)
    {
        if (!indexIsValid(index))
            return;
        ArrayList<Vote> allVotes = new ArrayList<>();
        for (String str : votes)
        {
            String[] strSplit = str.split(" ");
            if (strSplit.length != 2)
            {
                System.out.println("incorrect name");
                return;
            }
            Person candidate = new Person(strSplit[0], strSplit[1]);
            Vote vote = new Vote(candidate, new Date());
            allVotes.add(vote);
        }
        votingList.get(index).vote(voter, allVotes);
    }
    
    public void printResult(int index)
    {
        if (indexIsValid(index))
            votingList.get(index).printResult();
    }
    
    private boolean indexIsValid(int index)
    {
        if (index > votingList.size() - 1)
        {
            System.out.println("index is incorrect");
            return false;
        }
        return true;
    }
    
}