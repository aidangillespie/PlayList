import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ipod {
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;
    private Song currentSong;

    public Ipod() {
        this.albums = new ArrayList<>();
        this.playlist = new LinkedList<>();
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public boolean AddAlbum(Album album){
        for(int i=0;i<albums.size();i++){
            if(albums.get(i).getName().equals(album.toString()))
                return false;
        }
        if(album.getSongs().size()==0)
            return false;
        albums.add(album);
        return true;

    }
    public boolean addToPlayList(String title){
        for(int i=0;i<albums.size();i++){
            Album album=albums.get(i);
            ArrayList<Song> songs=album.getSongs();
            for (int j=0;j<songs.size();j++){
                Song newSong=songs.get(j);
                if(newSong.getTitle().equals(title)){
                    Iterator<Song> it=playlist.iterator();
                    while(it.hasNext()){
                        Song song=it.next();
                        if(song.getTitle().equals(title))
                            return false;
                    }
                    playlist.add(newSong);
                    return true;
                }
            }

        }
        return false;
    }
    public void listSongs(){
        ListIterator<Song> listIterator=playlist.listIterator();
        System.out.println("The songs in the list are");
        while(listIterator.hasNext()){
            Song song=listIterator.next();
            System.out.println("Song title is: "+song.getTitle()+
                    " Duration is: "+song.getDuration());
        }
    }
    public Song playSongs(boolean direction){
        if(currentSong==null){
            currentSong=playlist.get(0);
        }
        else{
            if(direction){
                ListIterator<Song> listIterator=playlist.listIterator();
                while(listIterator.hasNext()){
                    Song song=listIterator.next();
                    if(currentSong.getTitle().equals(song.getTitle())) {
                        if (listIterator.hasNext()){
                            currentSong = listIterator.next();
                        return currentSong;}

                    else{
                            System.out.println("Reached end of the list");
                            return currentSong;
                        }
                    }
                }
            }
            else{
                ListIterator<Song> listIterator=playlist.listIterator();
                Song firstSong=listIterator.next();
                if(currentSong.getTitle().equals(firstSong.getTitle())){
                    System.out.println("Reached beginning of the list");
                }
                else{
                    while(listIterator.hasNext()){
                        Song song=listIterator.next();
                        if(currentSong==song){
                                listIterator.previous();
                                currentSong=listIterator.previous();
                                return currentSong;
                        }

                    }

                }
            }


        }
        return currentSong;
    }
    public void resetPlaylist(){
        currentSong=playlist.get(0);
    }
    public boolean removeCurrentSong(){
        ListIterator<Song> listIterator=playlist.listIterator();
        while(listIterator.hasNext()){
            Song song=listIterator.next();
            if(currentSong.getTitle().equals(song.getTitle())){
                listIterator.previous();
                listIterator.remove();
                if(listIterator.hasNext()){
                    currentSong=listIterator.next();
                }
                else{
                    currentSong=listIterator.previous();
                }
                    return true;
            }
        }
        return false;
    }

}
