import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> musics;
    private ArrayList<Integer> favorites;
    private String collectionName;
    // A player for the music files.
    private MusicPlayer player;
    //playing file
    private int playingIndex;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection(String collectionName)
    {
        musics = new ArrayList<Music>();
        favorites = new ArrayList<Integer>();
        this.collectionName = collectionName;
        playingIndex = -1;
    }
    
    /**
     * Add a file to the collection.
     * @param filePath The file path to be added.
     */
    public void addMusic(String filePath, String musicName, String author, int releaseYear)
    {
        Music m = new Music(filePath, musicName, author, releaseYear);
        musics.add(m);
    }

    public void addFavorite(int index)
    {
        if(!validIndex(index))
            return;
        favorites.add(index);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return musics.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listMusic(int index)
    {
        if(!validIndex(index))
            return;
        Music m = musics.get(index);
        System.out.println(m.getMusicName() + "-" +
                m.getAuthor() + "-" +
                m.getReleaseYear() + "-" +
                m.getFilePath()
        );
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllMusics()
    {
        if(musics.size() == 0)
        {
            System.out.println("Empty Musics in " + collectionName);
            return;
        }
        System.out.println(collectionName + ":");
        for (Music m : musics)
        {
            System.out.println(m.getMusicName() + "-" +
                    m.getAuthor() + "-" +
                    m.getReleaseYear() + "-" +
                    m.getFilePath()
                    );
        }
        System.out.println("***********\n");
    }

    public void listAllFavorites()
    {
        if(favorites.size() == 0)
        {
            System.out.println("Empty Favorites in " + collectionName);
            return;
        }
        System.out.println(collectionName + " Favorites:");
        for (int i : favorites)
        {
            Music m = musics.get(i);
            listMusic(i);
        }
        System.out.println("***********\n");
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeMusic(int index)
    {
        if(!validIndex(index))
            return;
        musics.remove(index);
    }

    public void removeFavorite(int index)
    {
        if(!validIndex(index))
            return;
        boolean favHasIndex = false;
        for (int i = 0; i < favorites.size() - 1; i++)
        {
            if(favorites.indexOf(i) == index)
                favHasIndex = true;
        }
        if(!favHasIndex)
            System.out.println("index" + index + " is not in favorites of" + collectionName);
        else
            favorites.add(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(!validIndex(index))
            return;
        Music m = musics.get(index);
        player.startPlaying(m.getMusicName());
        playingIndex = index;
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        if(playingIndex == -1)
        {
            System.out.println("no music is playing!");
            return;
        }
        Music m = musics.get(playingIndex);
        player.stop(m.getMusicName());
        playingIndex = -1;
    }

    public boolean hasMusic(String musicName)
    {
        for (int i = 0; i < musics.size() - 1; i++)
        {
            Music m = musics.get(i);
            if(m.getMusicName().equals(musicName))
                return true;
        }
        return false;
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        if(index >= 0 && index < getNumberOfFiles())
            return true;
        System.out.println("Index is not valid!");
       return false;
    }
}