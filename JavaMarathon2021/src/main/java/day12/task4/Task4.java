package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand m1 = new MusicBand("Band 1", 1982);
        m1.addMember("Polit Fartish");
        m1.addMember("Franklin Yozef");
        m1.printMembers();
        MusicBand m2 = new MusicBand("Anothe group", 1983);
        MusicBand.transferMembers(m1, m2);
    }
}
