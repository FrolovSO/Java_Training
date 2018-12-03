package tech.interfaces;

import tech.Tech;
import tech.TechName;

public class KitchenTech extends Tech<Integer,Integer> implements FixChecker,StateChecker{

    private TechName name;
    private boolean isBroken = false;

    public KitchenTech(TechName name, Integer  x, Integer y) {
        this(x,y);
        this.name = name;
    }

    public KitchenTech(Integer  x, Integer y) {
        this.setX(x);
        this.setY(y);
    }

    public TechName getName() {
        return name;
    }

    public void setName(TechName name) {
        this.name = name;
    }

    @Override
    public boolean isFix(int x, int y) {
        return x >= getX() && y >= getY();
    }

    @Override
    public boolean isValid() {
        return !isBroken;
    }


    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

}
