public class Hero {
  private String mName;
  private int mHP;
  private int mAP;

  public Hero(String name, int hP, int aP) {
    mName = name;
    mHP = hP;
    mAP = aP;
  }

  public String getName() {
    return mName;
  }

  public int getHP() {
    return mHP;
  }

  public int getAP() {
    return mAP;
  }

  public void setHP(int attackPoints) {
    mHP -= attackPoints;
  }

  public void setAP(int attackCost) {
    mAP -= attackCost;
  }
}
