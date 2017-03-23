public class Game {
  private Squad mSquad1;
  private Squad mSquad2;
  private int mTurnIndex;

  public Game() {
    mSquad1 = new Squad();
    mSquad2 = new Squad();
    mTurnIndex = 1;
  }

  public Squad getSquad(int squadNumber) {
    if (squadNumber == 1) {
      return mSquad1;
    } else {
      return mSquad2;
    }
  }

  public Squad getCurrentSquad() {
    if (mTurnIndex == 1) {
      return mSquad1;
    } else {
      return mSquad2;
    }
  }

  public void changeTurn() {
    if (mTurnIndex == 1) {
      mTurnIndex = 2;
    } else {
      mTurnIndex = 1;
    }
  }
}
