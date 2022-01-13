package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    private final AttackService ATTACK;

    public Warrior() {
        super(80, 0, 30, 0);
        this.ATTACK = new AttackService();
    }

    @Override
    public String toString() {
        return "Warrior{" + super.toString() + '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        ATTACK.physicalAttack(this, hero);
    }
}
