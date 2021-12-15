package day12.task5;

import day12.task4.MusicBand;

public class Task5 {
    public static void main(String[] args) {
        day12.task4.MusicBand m1 = new day12.task4.MusicBand("Band 1", 1982);
        m1.addMember("Polit Fartish");
        m1.addMember("Franklin Yozef");
        m1.printMembers();
        day12.task4.MusicBand m2 = new day12.task4.MusicBand("Anothe group", 1983);
        MusicBand.transferMembers(m1, m2);
    }
}
