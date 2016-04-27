import java.util.ArrayList;

public class Squad {
  private String mName;
  private ArrayList<SuperHero> mRoster = new ArrayList<SuperHero>();
  private final int MAX_SIZE = 4;

  public Squad(String name) {
    mName = name;
  }

  public String getSquadName() {
    return mName;
  }

  public ArrayList<SuperHero> getRoster() {
    return mRoster;
  }

  public void addHero(SuperHero hero) {
    mRoster.add(hero);
  }

  public String heroName(int heroId) {
    String name = mRoster.get(heroId).getName();
    return name;
  }


}
