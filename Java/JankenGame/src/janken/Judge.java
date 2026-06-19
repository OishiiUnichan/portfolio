package janken;

import java.util.List;

public class Judge {

  // あいこ判定
  public boolean isAiko(List<Player> players) {
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
    int handTypeCount = (hasGu ? 1 : 0) + (hasChoki ? 1 : 0) + (hasPa ? 1 : 0);
    return handTypeCount == 1 || handTypeCount == 3;
  }

  // 勝ち手を返す
  public int getWinHan(List<Player> players) {
    boolean hasGu = false;
    boolean hasChoki = false;
    boolean hasPa = false;

    int winHand = -1;

    for (Player p : players) {
      if (p.hand == 0)
        hasGu = true;
      if (p.hand == 1)
        hasChoki = true;
      if (p.hand == 2)
        hasPa = true;
    }

    if (hasGu && hasChoki)
      winHand = 0;
    else if (hasChoki && hasPa)
      winHand = 1;
    else
      winHand = 2;
    return winHand;
  }
}
