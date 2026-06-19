package janken;

import java.util.Random;

public class PCPlayer extends Player{

  // Playerのコンストラクタ引き継ぐ
  public PCPlayer (String name){
    super(name);
  }

  // じゃんけんの手
  @Override
  public void selectHand(){
    Random rand = new Random();
    this.hand = rand.nextInt(3);

//  デバッグ用
//  @Override
//  public void selectHand(){
//  this.hand=2; //ぱー固定

  }
}
