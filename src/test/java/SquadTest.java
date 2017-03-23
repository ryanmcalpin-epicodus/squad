import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @Test
  public void Squad_instantiatesCorrectly_true() {
    Squad testSquad = new Squad();
    assertEquals(true, testSquad instanceof Squad);
  }

  @Test
  public void setName_setsNameOfSquad_String() {
    Squad testSquad = new Squad();
    testSquad.setName("Nice Guys");
    assertEquals("Nice Guys", testSquad.getName());
  }

  @Test
  public void Squad_returnsName_String() {
    Squad testSquad = new Squad();
    testSquad.setName("Nice Guys");
    assertEquals("Nice Guys", testSquad.getName());
  }

  @Test
  public void getHeros_initiallyReturnsEmptyList_true() {
    Squad testSquad = new Squad();
    assertEquals(0, testSquad.getHeros().size());
  }

  @Test
  public void addHero_addsHerosToSquad_true() {
    Squad testSquad = new Squad();
    Hero testHero = new Hero("Bob the Barbarian", 10, 8);
    Hero testHero2 = new Hero("Large Marge", 10, 8);
    testSquad.addHero(testHero);
    testSquad.addHero(testHero2);
    assertEquals(true, testSquad.getHeros().contains(testHero));
    assertEquals(true, testSquad.getHeros().contains(testHero2));
  }

  @Test
  public void chooseHero_getsSpecificHero_Hero() {
    Game testGame = new Game();
    Squad s1 = testGame.getSquad(1);
    Hero testHero = new Hero("Bob the Barbarian", 10, 8);
    Hero testHero2 = new Hero("Large Marge", 10, 8);
    Hero testHero3 = new Hero("Rygn", 10, 8);
    s1.addHero(testHero);
    s1.addHero(testHero2);
    s1.addHero(testHero3);
    assertEquals(testHero2, s1.chooseHero(2));
  }
}
