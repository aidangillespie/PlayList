import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        songs=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
    public boolean addSong(String title, double duration){
        for(int i=0;i<songs.size();i++){
            if(songs.get(i).getTitle().equals(title))
                return false;
        }
        songs.add(new Song(title,duration));
        return true;
    }
}
