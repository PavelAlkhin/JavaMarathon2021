package day11.task2;

public abstract class Hero {
    private int health;
    private final int physDef;
    private final int magicDef;
    private final int physAtt;
    private final int magicAtt;

    public Hero(int physDef, int magicDefm, int physAtt, int magicAtt) {
        this.health = 100;
        this.physDef = physDef;
        this.magicDef = magicDefm;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
    }

    public void setHealth(int health) {
        this.health += health;
        if (this.health > 100) {
            this.health = 100;
        }
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public int getHealth() {
        return health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    @Override
    public String toString() {
        return "health=" + health;
    }
}
