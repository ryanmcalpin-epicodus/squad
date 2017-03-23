import java.util.List;
import java.util.ArrayList;

public class Squad {
  private String mName;
  private List<Hero> mHeros;

  public Squad() {
    mHeros = new ArrayList<Hero>();
  }

  public String getName() {
    return mName;
  }

  public List<Hero> getHeros() {
    return mHeros;
  }

  public void addHero(Hero hero) {
    mHeros.add(hero);
  }

  public void setName(String name) {
    mName = name;
  }

  public Hero chooseHero(int heroNumber) {
    return mHeros.get(heroNumber - 1);
  }
}
