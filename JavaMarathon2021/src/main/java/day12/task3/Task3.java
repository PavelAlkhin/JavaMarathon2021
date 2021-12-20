package day12.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        for (int i = 1985; i <= 2021; i++) {
            StringBuilder name = new StringBuilder();
            name.append("Band_");
            name.append(i%100);
            bands.add(new MusicBand(name.toString(), i));
            i = i + 3;
        }
        Collections.shuffle(bands);
        System.out.println(bands);
        List<MusicBand> newBands = groupsAfter2000(bands);
        System.out.println(newBands);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        return bands.stream().filter(m->m.getYear()>2000).collect(Collectors.toList());
    }
}
