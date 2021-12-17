package day11.task2;

public class Shaman extends Hero implements MagicAttack, PhysAttack, Healer {

    private int healHimself;
    private int healTeammate;

    private final AttackService ATTACK;

    public Shaman() {
        super(20, 20, 10, 15);
        this.healHimself = 50;
        this.healTeammate = 30;
        this.ATTACK = new AttackService();
    }

    @Override
    public String toString() {
        return "Shaman{" + super.toString() + '}';
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
    public void magicalAttack(Hero hero) {
        ATTACK.magicalAttack(this, hero);
    }

    @Override
    public void physicalAttack(Hero hero) {
        ATTACK.physicalAttack(this, hero);
    }
}
