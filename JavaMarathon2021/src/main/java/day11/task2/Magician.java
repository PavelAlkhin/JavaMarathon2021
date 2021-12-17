package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {

    private final AttackService ATTACK;

    public Magician() {
        super(0, 80, 5, 20);
        this.ATTACK = new AttackService();
    }

    @Override
    public String toString() {
        return "Magician{" + super.toString() + '}';
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
