package day11.task2;

public class AttackService {
    /**
     * Значения защиты в процентах, а другие параметры в единицах,
     * т.е. атаковав воина типом Ф 10, он получит урон не 10, а 2 ед. урона (10 - 10*0.8 = 2)
     * 80 - (80 * (80 / 100) ) =
     */

    public void physicalAttack(Hero attacker, Hero defending) {
        int initaialAttackDamage = attacker.getPhysAtt();
        int heroDefence = defending.getPhysDef();
        putDamage(defending, initaialAttackDamage, heroDefence);
    }

    public void magicalAttack(Hero attacker, Hero defending) {
        int initaialAttackDamage = attacker.getMagicAtt();
        int heroDefence = defending.getMagicDef();
        putDamage(defending, initaialAttackDamage, heroDefence);
    }

    private void putDamage(Hero defending, int initaialAttackDamage, int heroDefence) {
        int curDamage = initaialAttackDamage - (initaialAttackDamage * heroDefence / 100);
        defending.setHealth(-curDamage);
    }
}
