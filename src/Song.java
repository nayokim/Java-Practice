public class Song {
    private String title;
    private String artist;

    public void setTitle(String title){
        System.out.println(title);
    }

    public void setArtist(String artist){
        System.out.println(artist);
    }

    public void playSong(){
        System.out.println("Now Playing");
    }

    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("Politik");
        song1.setArtist("Coldplay");

        Song song2 = new Song();
        song2.setTitle ("Hey Jude");
        song2.setArtist("The Beatles");

        Song song3 = new Song();
        song3.setTitle("The Cave");
        song3.setArtist("Mumford and Sons");
        song3.playSong();


    }
}
