package janken;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // ゲーム文表示
    System.out.println("*** じゃんけんゲーム ***");
    System.out.println("種目の番号を選んでください。");
    System.out.println("0: お一人用");
    System.out.println("1: 多人数用");

    // モード選択
    InputHelper helper = new InputHelper();
    int mode = helper.inputMode();

    // 分岐：一人用
    if (mode == 0) {
      // ゲームスタート文
      System.out.println("じゃんけんゲ〜ム、はっじっめっるよ〜!");
      System.out.println("ＰＣと勝負です!!");
      System.out.println("1番目のユーザーの名前を入力してください");

      // 名前を入力
      String name = helper.inputName();

      // プレイヤーを作る
      HumanPlayer human = new HumanPlayer(name);
      PCPlayer pc = new PCPlayer("PC1号");

      // プレイヤーリストを作る
      List<Player> players = new ArrayList<>();
      players.add(human);
      players.add(pc);
      GameManager gm = new GameManager();
      gm.start(players);

    } else if (mode == 1) {
      System.out.println("じゃんけんゲ〜ム、はっじっめっるよ〜!");
      System.out.println("みんなで勝負です!!");
      System.out.println("参加ユーザーの人数を入力してください。");
      int userCount = helper.inputNumber();
      System.out.println("参加ＰＣの台数を入力してください。");
      int pcCount = helper.inputNumber();

      // プレイヤーリストを作る
      List<Player> players = new ArrayList<>();
      for (int i = 1; i <= userCount; i++) {
        System.out.println(i + "番目のユーザーの名前を入力してください。");
        String name = helper.inputName();
        players.add(new HumanPlayer(name));
      }
      for (int i = 1; i <= pcCount; i++) {
        players.add(new PCPlayer("PC" + i + "号"));
      }
      GameManager gm = new GameManager();
      gm.start(players);
    }
  }
}