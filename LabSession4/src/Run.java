import java.util.ArrayList;

public class Run
{
    public static void main(String[] args)
    {
        //create a voting system
        VotingSystem votingSystem = new VotingSystem();
        
        //create person
        Person ali = new Person("Ali", "Razeghi");
        Person mohammad = new Person("Mohammad", "Honarjoo");
        Person gholi = new Person("Gholi", "Rezayi");
        Person hamed = new Person("Hamed", "Ahmadi");
        Person reza = new Person("Reza", "Ahmadi");
        Person mahdi = new Person("Mahdi", "Mohammadi");
        
        //single vote mode (index 0)
        votingSystem.createVoting("who do you vote for faculty head?", 0);
        //multiple vote mode (index 1)
        votingSystem.createVoting("who do you vote for Shoraye Senfi?", 1);
        
        //create voting choices
        votingSystem.getVoting(0).createChoice("Mahdi Razeghi");
        votingSystem.getVoting(0).createChoice("Mohammad Honarjoo");
        
        votingSystem.getVoting(1).createChoice("Ali Razeghi");
        votingSystem.getVoting(1).createChoice("Gholi Rezayi");
        votingSystem.getVoting(1).createChoice("Hamed Ahmadi");
        
        //vote for candidates
        //voting 0:
        String[] p1Votes = new String[]{"Mahdi Razeghi"};
        votingSystem.vote(0, ali, toList(p1Votes));
        
        String[] p2Votes = new String[]{"Mohammad Honarjoo"};
        votingSystem.vote(0, mohammad, toList(p2Votes));
        
        String[] p3Votes = new String[]{"Mohammad Honarjoo"};
        votingSystem.vote(0, gholi, toList(p3Votes));
        
        String[] p4Votes = new String[]{"Mahdi Razeghi"};
        votingSystem.vote(0, hamed, toList(p4Votes));
        
        String[] p5Votes = new String[]{"Mahdi Razeghi"};
        votingSystem.vote(0, reza, toList(p5Votes));
        
        String[] p6Votes = new String[]{"Mahdi Razeghi"};
        votingSystem.vote(0, mahdi, toList(p6Votes));
        
        //voting 1:
        
        String[] p1Votes2 = new String[]{"Ali Razeghi", "Gholi Rezayi", "Hamed Ahmadi"};
        votingSystem.vote(1, ali, toList(p1Votes2));
        
        String[] p2Votes2 = new String[]{"Ali Razeghi", "Gholi Rezayi"};
        votingSystem.vote(1, mohammad, toList(p2Votes2));
        
        String[] p3Votes2 = new String[]{"Ali Razeghi", "Hamed Ahmadi"};
        votingSystem.vote(1, gholi, toList(p3Votes2));
        
        String[] p4Votes2 = new String[]{"Gholi Rezayi", "Hamed Ahmadi"};
        votingSystem.vote(1, hamed, toList(p4Votes2));
        
        String[] p5Votes2 = new String[]{"Hamed Ahmadi"};
        votingSystem.vote(1, reza, toList(p5Votes2));
        
        String[] p6Votes2 = new String[]{"Ali Razeghi"};
        votingSystem.vote(0, mahdi, toList(p6Votes2));
        
        votingSystem.printListOfVotings();
        //votingSystem.printVoting(0);
        //votingSystem.printVoting(1);
        votingSystem.printResult(0);
        votingSystem.printResult(1);
    }
    
    private static ArrayList<String> toList(String[] input)
    {
        ArrayList<String> list = new ArrayList<>();
        for (String s : input)
        {
            list.add(s);
        }
        return list;
    }
}
