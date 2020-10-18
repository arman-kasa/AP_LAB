import java.util.ArrayList;
public class Main
{
    //p1
    static ClockDisplay clock;
    static ArrayList<MusicCollection> musicCollection;
    //p2
    public static void main(String[] args)
    {
        //main1();
        main2();
    }

    static void main1()
    {
        //initialize clocks
        clock = new ClockDisplay();
        clock.setTime(23,59,58);
        print("Current time:");
        print(clock.getTime());
        for (int i = 0; i < 5; i++) {
            clock.timeTick();
            print(clock.getTime());
        }
    }

    static void main2()
    {
        //initialize collections
        String[] collectionNames = {"pop","jazz","rock","country"};
        musicCollection = new ArrayList<MusicCollection>();
        for (int i = 0; i < collectionNames.length - 1; i++)
        {
            MusicCollection collection = new MusicCollection(collectionNames[i]);
            musicCollection.add(collection);
        }
        //process on music collection
        for (MusicCollection mc : musicCollection)
        {
            //instructs
            System.out.println("-------------------------------------------");
            mc.addMusic("C:/Musics", "first music","Arman", 2019);
            mc.addMusic("C:/Musics", "second music","Ali", 2003);
            mc.addMusic("C:/Musics", "third music","Reza", 2010);
            if(mc.hasMusic("second music"))
                System.out.println("has second music");
            if(mc.hasMusic("not found music"))
                System.out.println("has not found music");
            mc.listMusic(0);
            mc.listAllMusics();
            mc.removeMusic(0);
            mc.listMusic(0);
            mc.listMusic(3);
            mc.addFavorite(1);
            mc.listAllFavorites();
            mc.addFavorite(0);
            mc.addFavorite(5);
            mc.listAllFavorites();
            System.out.println("-------------------------------------------");
        }
    }

    static void print(String output)
    {
        System.out.println(output);
    }
}
