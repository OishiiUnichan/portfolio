import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingleGame {
  public void start() {
    // 一人用の処理
    Scanner sc = new Scanner(System.in);

    // ゲームスタート文
    System.out.println("じゃんけんゲ〜ム、はっじっめっるよ〜！");
    System.out.println("PCと勝負です！！");
    System.out.println("1番目のユーザーの名前を入力してください");

    // プレイヤー名を受け取る
    String name = sc.nextLine();

    // プレイヤーを作る
    HumanPlayer human = new HumanPlayer(name);

    // PCプレイヤーを作る
    PCPlayer pc = new PCPlayer("PC1号");

    // プレイヤーリストを作る
    List<Player> players = new ArrayList<>();
    players.add(human);
    players.add(pc);

    // ゲーム開始の数
    int round = 1;

    // ゲームの処理内容
    while (players.size() > 1) {
      System.out.println(round + "回戦！");

      // 1.全員が手を出す
      for (Player p : players) {
        p.selectHand();
      }

      // 2.手を表示する
      String[] handNames = { "ぐー", "ちょき", "ぱー" };
      for (Player p : players) {
        System.out.println(p.name + "さん ： " + handNames[p.hand]);
      }

      // 3.勝者判定
      boolean hasGu = false;
      boolean hasChoki = false;
      boolean hasPa = false;

      for (Player p : players) {
        if (p.hand == 0)
          hasGu = true;
        if (p.hand == 1)
          hasChoki = true;
        if (p.hand == 2)
          hasPa = true;
      }

      // あいこの場合
      int handTypeCount = (hasGu ? 1 : 0) + (hasChoki ? 1 : 0) + (hasPa ? 1 : 0);
      int winHand = -1;
      if (handTypeCount == 1 || handTypeCount == 3) {
        System.out.println("あいこです。");
      } else {
        if (hasGu && hasChoki)
          winHand = 0;
        else if (hasChoki && hasPa)
          winHand = 1;
        else
          winHand = 2;
      }

      // あいこじゃない時だけ削除
      if (winHand != -1) {
        for (int i = players.size() - 1; i >= 0; i--) {
          if (players.get(i).hand != winHand) {
            players.remove(i);
          }
        }

        // 勝負判定
        System.out.println("勝利者は、");
        for (Player p : players) {
          System.out.print(p.name + "さん ");
        }
        System.out.println();
      }
      round++;
    }
    // ゲーム終了
    System.out.println("ゲーム終了です。優勝者は" + players.get(0).name + "さんです！");
  }
}
