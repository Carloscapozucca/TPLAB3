package entity;

public abstract class Ninja implements Actions{

    private int lifeHp;

    public int getLifeHp() {
        return lifeHp;
    }

    public void setLifeHp(int lifeHp) {
        this.lifeHp = lifeHp;
    }
}
