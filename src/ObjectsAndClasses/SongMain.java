package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SongMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split("_");

            String type = input[0];
            String name = input[1];
            String length = input[2];

            Song song = new Song();
            song.setTypeList(type);
            song.setSongName(name);
            song.setLength(length);

            songs.add(song);
        }
        String typeList = scanner.nextLine();
        List<Song> filterSong = songs.stream().filter(e -> e.getTypeList().equals(typeList)).collect(Collectors.toList());

        for (Song song : filterSong) {
            System.out.println(song.getSongName());
        }
    }
}
