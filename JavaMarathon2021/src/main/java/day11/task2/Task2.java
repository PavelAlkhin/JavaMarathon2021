package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior1 = new Warrior();
        Paladin paladin1 = new Paladin();
        Magician magician1 = new Magician();
        Shaman shaman1 = new Shaman();

        warrior1.physicalAttack(paladin1);
        showHealth(paladin1);

        paladin1.physicalAttack(magician1);
        showHealth(magician1);

        shaman1.healTeammate(magician1);
        showHealth(magician1);

        magician1.magicalAttack(paladin1);
        showHealth(paladin1);

        shaman1.physicalAttack(warrior1);
        showHealth(warrior1);

        paladin1.healHimself();
        showHealth(paladin1);

        System.out.println();
        for (int i = 1; i < 6; i++) {
            warrior1.physicalAttack(magician1);
            showHealth(magician1);
        }
    }

    private static void showHealth(Hero hero) {
        System.out.println(hero);
    }
}
