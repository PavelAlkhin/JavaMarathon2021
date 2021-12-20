package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    private int healHimself;
    private int healTeammate;

    private final AttackService ATTACK;

    public Paladin() {
        super(50, 20, 15, 0);
        this.healHimself = 25;
        this.healTeammate = 10;
        this.ATTACK = new AttackService();
    }

    @Override
    public String toString() {
        return "Paladin{" + super.toString() + '}';
    }


    @Override
    public void healHimself() {
        super.setHealth(healHimself);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(healTeammate);
    }

    @Override
    public void physicalAttack(Hero hero) {
        ATTACK.physicalAttack(this, hero);
    }
}
