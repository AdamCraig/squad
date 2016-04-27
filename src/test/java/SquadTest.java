import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SquadTest {

  @Test
  public void name_addsHeroToRosterAndGetsSuperHeroName_String() {
    Squad testSquad = new Squad("Squad 1");
    SuperHero testSuperHero = new SuperHero("ElectroMan", 35, "Lightning", "Water");
    testSquad.addHero(testSuperHero);
    assertEquals("ElectroMan", testSquad.heroName(0));
  }

  @Test
  public void name_getsRosterOfSquad_String() {
    Squad testSquad = new Squad("Squad 1");
    SuperHero testSuperHero = new SuperHero("ElectroMan", 35, "Lightning", "Water");
    SuperHero testSuperHero2 = new SuperHero("BobMan", 82, "Being Really Smelly", "Bathing");
    testSquad.addHero(testSuperHero);
    testSquad.addHero(testSuperHero2);
    String listOfHeroes = testSquad.heroName(0) + " " + testSquad.heroName(1);
    assertEquals("ElectroMan BobMan", listOfHeroes);
  }
}
