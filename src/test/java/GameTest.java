import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void game_instantiatesCorrectyl_true() {
    Game testGame = new Game();
    assertTrue(testGame instanceof Game);
  }

  @Test
  public void getSquad_returnsCorrectSquad_true() {
    Game testGame = new Game();
    Squad s1 = testGame.getSquad(1);
    Squad s2 = testGame.getSquad(2);
    assertEquals(true, s1 instanceof Squad);
    assertEquals(true, s2 instanceof Squad);
  }

  @Test
  public void addHero_addsHerosToSquad_true() {
    Game testGame = new Game();
    Squad s1 = testGame.getSquad(1);
    Hero testHero = new Hero("Bob the Barbarian", 10, 8);
    s1.addHero(testHero);
    assertEquals(true, s1.getHeros().contains(testHero));
  }

  @Test
  public void getCurrentSquad_returnsSquadWhoseTurnItIs_Squad() {
    Game testGame = new Game();
    assertEquals(testGame.getCurrentSquad(), testGame.getSquad(1));
  }

  @Test
  public void changeTurn_changesTurn_Squad() {
    Game testGame = new Game();
    testGame.changeTurn();
    assertEquals(testGame.getCurrentSquad(), testGame.getSquad(2));
  }

}
