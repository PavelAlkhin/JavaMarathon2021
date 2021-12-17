package day12.task5;

public class Task5 {
    public static void main(String[] args) {
        MusicBand m1 = new MusicBand("Band 1", 1982);
        m1.addMember(new MusicArtist("Polit Fartish", 1983));
        m1.addMember(new MusicArtist("Franklin Yozef",1990));
        m1.printMembers();
        MusicBand m2 = new MusicBand("Anothe group", 1983);
        MusicBand.transferMembers(m1, m2);
    }
}
