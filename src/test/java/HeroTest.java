import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Hero_instatiatesCorrectly_true() {
    Hero testHero = new Hero("Bob the Barbarian", 10, 8);
    assertEquals(true, testHero instanceof Hero);
  }

  @Test
  public void getters_returnsVariables_vars() {
    Hero testHero = new Hero("Bob the Barbarian", 10, 8);
    assertEquals("Bob the Barbarian", testHero.getName());
    assertEquals(10, testHero.getHP());
    assertEquals(8, testHero.getAP());
  }

  @Test
  public void setters_returnsChangedVariables_vars() {
    Hero testHero = new Hero("Bob the Barbarian", 10, 8);
    testHero.setHP(3);
    testHero.setAP(4);
    assertEquals(7, testHero.getHP());
    assertEquals(4, testHero.getAP());
  }

}
