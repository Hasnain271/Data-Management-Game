public class Player {
    String name;
    int hp;
    int dmg;
    
    public Player(String nameVal, int hpVal, int dmgVal) {
        name = nameVal;
        hp = hpVal;
        dmg = dmgVal;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setName(String nameVal) {
        name = nameVal;
    }

    public void setHp(int hpVal) {
        hp = hpVal;
    }

    public void setDmg(int dmgVal) {
        dmg = dmgVal;
    }


}
