// Playlist tutorial by codeCademy, shows how to swap strings in array

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    desertIslandPlaylist.add("One More Time");
    desertIslandPlaylist.add("Too Long");
    desertIslandPlaylist.add("Around The World");
    desertIslandPlaylist.add("Get Lucky");
    desertIslandPlaylist.add("Harder Better Faster Stronger");
    desertIslandPlaylist.add("Gorgio");

    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("Gorgio");
    System.out.println(desertIslandPlaylist.size());

    int indexA = desertIslandPlaylist.indexOf("Too Long");
    int indexB = desertIslandPlaylist.indexOf("Get Lucky");
    
    //System.out.println(swapSongOne);
    //System.out.println(swapSongTwo);

    String tempA = "Too Long";
    desertIslandPlaylist.set(indexA , "Get Lucky");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);

  }
  
}