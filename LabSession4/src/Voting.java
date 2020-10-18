import java.util.*;

public class Voting
{
    //mode 0 = single choice & mode 1 = multi choice
    private int mode;
    //choices with counts
    private HashMap<Vote, Integer> choices;
    private HashMap<Person, HashSet<Vote>> votes;
    private String question;
    
    public Voting(int mode, String question)
    {
        this.mode = mode;
        this.question = question;
        this.choices = new HashMap<>();
        this.votes = new HashMap<>();
    }
    
    public void createChoice(String choiceName)
    {
        //first name and last name
        String[] name = choiceName.split(" ");
        if (name.length != 2)
        {
            System.out.println("name incorrect");
            return;
        }
        Person person = new Person(name[0], name[1]);
        Vote vote = new Vote(person, new Date());
        choices.put(vote, 0);
    }
    
    public void vote(Person voter, ArrayList<Vote> votes)
    {
        if (mode == 0 && votes.size() > 1)
        {
            System.out.println("ERROR:: in single mode, votes cannot be multi choices");
            return;
        }
        HashSet<Vote> voteSet = new HashSet<>();
        voteSet.addAll(votes);
        //increase vote for the voted person
        Iterator it = voteSet.iterator();
        while (it.hasNext())
        {
            Object currentVote = it.next();
            for (Map.Entry<Vote, Integer> choice : choices.entrySet())
            {
                if (choice.getKey().equals(currentVote))
                    choice.setValue(choice.getValue() + 1);
            }
        }
        this.votes.put(voter, voteSet);
    }
    
    public void printResult()
    {
        System.out.println("***************");
        System.out.println("Question: " + question);
        for (Map.Entry<Vote, Integer> choice : choices.entrySet())
        {
            System.out.println("Candidate: " + choice.getKey().getVoter() + " - Votes: " + choice.getValue());
        }
        System.out.println("***************");
    }
    
    public void printVoting()
    {
        System.out.println("---------------");
        System.out.println("Question: " + question);
        System.out.println("Candidates: ");
        for (Map.Entry<Vote, Integer> candidate : choices.entrySet())
        {
            System.out.println(candidate.getKey().getVoter().toString());
        }
        System.out.println("---------------");
    }
    
}
