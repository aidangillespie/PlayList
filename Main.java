public class Main {
    public static void main(String[] args){
        Ipod myIpod=new Ipod();
        Album myAlbum=new Album("Appetite for Destruction");
        myAlbum.addSong("Welcome to the Jungle",4.31);
        myAlbum.addSong(	"It's So Easy",3.21);
        myAlbum.addSong("Nightrain",4.26);
        myAlbum.addSong("Out ta Get Me",4.20);
        myAlbum.addSong(	"Mr. Brownstone",3.46);
        myAlbum.addSong("Paradise City",6.46);

        System.out.println(myAlbum.addSong("Welcome to the Jungle",4.31));
        System.out.println(myAlbum.addSong(	"It's So Easy",3.21));
        System.out.println(myAlbum.addSong("Nightrain",4.26));
        myIpod.AddAlbum(myAlbum);

        Album myAlbumtwo=new Album("Appetite for Destruction 2");
        myAlbumtwo.addSong(	"My Michelle",3.39);
        myAlbumtwo.addSong(		"Think About You",3.50);
        myAlbumtwo.addSong(		"Sweet Child o' Mine",5.55);
        myAlbumtwo.addSong(			"You're Crazy",3.16);
        myAlbumtwo.addSong("Anything Goes",3.25);
        myAlbumtwo.addSong("Rocket Queen",6.13);
        System.out.println("***********************");
        System.out.println(myIpod.addToPlayList("My Michelle"));
        System.out.println(myIpod.addToPlayList("Think About You"));
        System.out.println(myIpod.addToPlayList("Sweet Child o' Mine"));
        System.out.println(myIpod.addToPlayList("You're Crazy"));
        System.out.println(myIpod.addToPlayList("Anything Goes"));
        System.out.println(myIpod.addToPlayList("Rocket Queen"));
        System.out.println("***********************");

        myIpod.AddAlbum(myAlbumtwo);
        myIpod.addToPlayList("My Michelle");
        myIpod.addToPlayList("Think About You");
        myIpod.addToPlayList("Sweet Child o' Mine");
        myIpod.addToPlayList("You're Crazy");
        myIpod.addToPlayList("Anything Goes");
        myIpod.addToPlayList("Rocket Queen");








        //myIpod.resetPlaylist();
        myIpod.addToPlayList("Welcome to the Jungle");
        System.out.println(myIpod.addToPlayList("Welcome to the Jungle"));
        myIpod.addToPlayList("It's So Easy");
        myIpod.addToPlayList("Nightrain");
        myIpod.addToPlayList("Out ta Get Me");
        myIpod.addToPlayList("Mr. Brownstone");
        myIpod.resetPlaylist();
        myIpod.listSongs();
        System.out.println("*******************************");
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.playSongs(true);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.playSongs(true);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.playSongs(true);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.playSongs(true);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.playSongs(true);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.playSongs(true);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        System.out.println("Going Backwards*******************************");
        myIpod.playSongs(false);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.playSongs(false);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.playSongs(false);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.removeCurrentSong();
        //myIpod.playSongs(false);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        myIpod.removeCurrentSong();
        System.out.println("**********************");
        myIpod.listSongs();
        System.out.println("**********************");
        //myIpod.playSongs(false);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        //myIpod.playSongs(false);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());
        //myIpod.playSongs(false);
        System.out.println(myIpod.getCurrentSong().getTitle()+" Duration: "+myIpod.getCurrentSong().getDuration());


    }
}
