package janken;

import java.util.List;

public class GameManager {
  public void start(List<Player> players) {

    int round = 1;
    Round r = new Round();
    while (players.size() > 1){
      r.play(players,round);
      round++;
    }
    System.out.println("ゲーム終了です。優勝者は" + players.get(0).name + "さんです!");
  }
}
