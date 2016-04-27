import org.junit.*;
import static org.junit.Assert.*;

public class SuperHeroTest {

  @Test
  public void newSuperHero_instantiatesCorrectly() {
    SuperHero testHero = new SuperHero("ElectroMan", 35);
    assertEquals(true, testHero instanceof SuperHero);
  }

  @Test
  public void getName_getsSuperHeroName_String() {
    SuperHero testHero = new SuperHero("ElectroMan", 35);
    assertEquals("ElectroMan", testHero.getName());
  }

  @Test
  public void getAge_getsSuperHeroAge_int() {
    SuperHero testHero = new SuperHero("ElectroMan", 35);
    assertEquals(35, testHero.getAge());
  }
}
