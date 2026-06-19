package janken;

import java.util.List;

public class Round {
  public void play(List<Player> players, int round) {

    // ゲームの処理内容
    System.out.println(round + "回戦!");

    // 1.全員が手を出す
    for (Player p : players) {
      p.selectHand();
    }

    // 2.手を表示する
    String[] handNames = { "ぐー", "ちょき", "ぱー" };
    for (Player p : players) {
      System.out.println(p.name + "さん ： " + handNames[p.hand]);
    }

    // 判定
    Judge judge = new Judge();
    if (judge.isAiko(players)) {
      System.out.println("あいこです。");
    } else {
      int winHand = judge.getWinHan(players);
      // 負けた人を削除
      for (int i = players.size() - 1; i >= 0; i--) {
        if (players.get(i).hand != winHand) {
          players.remove(i);
        }
      }
      // 勝利者を表示
      System.out.println("勝利者は、");
      for (Player p : players) {
        System.out.print(p.name + "さん ");
      }
      System.out.println();
    }
  }
}
