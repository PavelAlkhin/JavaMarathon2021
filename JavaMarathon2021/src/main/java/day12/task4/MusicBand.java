package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>();
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void removeMember(String member) {
        int indx = members.indexOf(member);
        if (indx != -1){
            members.remove(indx);
        }
    }

    public static void transferMembers(MusicBand m1, MusicBand m2){
        List<String> list = m1.getMembers();
        for (String memberFIO: list) {
            m2.addMember(memberFIO);
        }
        m1.setMembers(new ArrayList<>());
    }

    public void printMembers(){
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
