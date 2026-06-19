import java.util.Scanner;

public class InputHelper {

  public static final int VALID = 0;
  public static final int INVALID_NUMBER = 1;
  public static final int INVALID_VALUE = 2;

  // モード選択
  public int inputMode() {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    int result = inputCheck(input, 0, 1);

    while (result != 0){
      //エラーのとき
      if (result == 1){
        System.out.println("残念!無効な番号です!");
      } else {
        System.out.println("残念!無効な値です!");
      }
      input = sc.nextLine();
      result = inputCheck(input, 0, 1);
    } 
    return Integer.parseInt(input);
  }

  // 手の入力
  public int inputHand() {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    int result = inputCheck(input, 0, 2);

    while (result != 0) {
      // エラーのとき
      if (result == 1) {
        System.out.println("残念!無効な番号です!");
      } else {
        System.out.println("残念!無効な値です!");
      }
      input = sc.nextLine();
      result = inputCheck(input, 0, 2);
    }
    return Integer.parseInt(input);
  }

  // 名前の入力
  public String inputName() {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    return name;
  }

  // PC番号の入力
  public int inputNumber() {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int result = inputCheck(input, 1, Integer.MAX_VALUE);
    while (result != 0) {
      if (result == 1) {
        System.out.println("残念!無効な番号です!");
      } else {
        System.out.println("残念!無効な値です!");
      }
      input = sc.nextLine();
      result = inputCheck(input, 1, Integer.MAX_VALUE);
    }
    return Integer.parseInt(input);
  }

  // 異常動作チェック
  public int inputCheck(String input,int min,int max) {
    try {
      // 数字じゃない
      int num = Integer.parseInt(input);
      if (num<min || num >max) {
        // 無効な番号
        return 1;
      }
      // 正常にゲームスタート
      return 0;
      // 無効な値
    } catch (NumberFormatException e) {
      return 2; 
    }
  }
}
