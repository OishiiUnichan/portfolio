package janken;

public class HumanPlayer extends Player {

  // Playerのコンストラクタ引き継ぐ
  public HumanPlayer(String name) {
    super(name);
  }

  // じゃんけんの手
  @Override
  public void selectHand() {
    System.out.println(this.name + "さんの手を選んで下さい。");
    System.out.println("0:ぐー　1:ちょき　2.ぱー");
    InputHelper helper = new InputHelper();
    this.hand = helper.inputHand();
  }
}
