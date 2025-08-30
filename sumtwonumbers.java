import java.util.Scanner;

public class sumtwonumbers {
    public static void main(String[] args) {
        // 1.Scannerの準備
        Scanner scanner = new Scanner(System.in);
        // 2.入力を受け取る
        System.out.print("1つ目の数字を入力してください：");
        int num1 = scanner.nextInt();
        System.out.print("2つ目の数字を入力してください：");
        int num2 = scanner.nextInt();
        // 3.和を計算
        int sum = num1 + num2;
        // 4.出力
        System.out.println("2つの数字の和は:" + sum);
        // 5.Scannerを閉じる
        scanner.close();
    }

}
