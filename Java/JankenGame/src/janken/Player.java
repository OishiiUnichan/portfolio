package janken;

public abstract class Player {
  // フィールド
  String name;
  int hand;

  // コンストラクタ
  public Player (String name){
    this.name = name;
  }

  // 手の中身
  public abstract void selectHand();
}
