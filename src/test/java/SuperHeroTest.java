import org.junit.*;
import static org.junit.Assert.*;

public class SuperHeroTest {

  @Test
  public void newSuperHero_instantiatesCorrectly() {
    SuperHero testHero = new SuperHero("ElectroMan", 35, "Lightning", "Water");
    assertEquals(true, testHero instanceof SuperHero);
  }

  @Test
  public void getName_getsSuperHeroName_String() {
    SuperHero testHero = new SuperHero("ElectroMan", 35, "Lightning", "Water");
    assertEquals("ElectroMan", testHero.getName());
  }

  @Test
  public void getAge_getsSuperHeroAge_int() {
    SuperHero testHero = new SuperHero("ElectroMan", 35, "Lightning", "Water");
    assertEquals(35, testHero.getAge());
  }

  @Test
  public void getPower_getsSuperHeroPower_String() {
    SuperHero testHero = new SuperHero("ElectroMan", 35, "Lightning", "Water");
    assertEquals("Lightning", testHero.getPower());
  }

  @Test
  public void getWeakness_getsSuperHeroWeakness_String() {
    SuperHero testHero = new SuperHero("ElectroMan", 35, "Lightning", "Water");
    assertEquals("Water", testHero.getWeakness());
  }

}
