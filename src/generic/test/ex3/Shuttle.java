package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle <T extends BioUnit> {
    private T unit;

    public void in(T t) {
        this.unit = t;
    }

    public T out() {
        return this.unit;
    }

    public void showInfo() {
        System.out.println("이름: " + this.unit.getName() + ", HP: " + this.unit.getHp());
    }
}
