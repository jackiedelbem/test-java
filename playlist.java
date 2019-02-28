// 5. PlaylistJAVA  ALGORITHMIC THINKING  SEARCHING  PUBLIC  NEW
// A playlist is considered a repeating playlist if any of the songs contain a reference to a previous song in the playlist. Otherwise, the playlist will end with the last song which points to null.

// Implement a function isRepeatingPlaylist that, efficiently with respect to time used, returns true if a playlist is repeating or false if it is not.

// For example, the following code prints "true" as both songs point to each other.

import java.util.*;

public class Playlist {
    public static class Song {
        private String name;
        private Song nextSong;
 
        public Song(String name) {
            this.name = name;
        }
    
        public void setNextSong(Song nextSong) {
            this.nextSong = nextSong;
        }
    
        public boolean isRepeatingPlaylist() {
            List<String> songs = new ArrayList<String>();
            Song current_song = this;
            
            while(current_song.nextSong != null){
                if(songs.contains(current_song.name))
                    return true;
                songs.add(current_song.name);
                current_song = current_song.nextSong;
            }
            return false;
        }
    }
    
    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
    
        first.setNextSong(second);
        second.setNextSong(first);
    
        System.out.println(first.isRepeatingPlaylist());
    }
}