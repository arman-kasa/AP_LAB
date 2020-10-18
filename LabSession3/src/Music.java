public class Music
{
    private String filePath;
    private String musicName;
    private String author;
    private int releaseYear;

    public Music(String filePath, String musicName, String author, int releaseYear)
    {
        this.author = author;
        this.filePath = filePath;
        this.musicName = musicName;
        this.releaseYear = releaseYear;
    }

    public String getFilePath()
    {
        return filePath;
    }

    public String getMusicName()
    {
        return musicName;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

}
