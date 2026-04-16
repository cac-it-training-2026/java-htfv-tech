package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		int sum = 0;
		double discount = 0.9;
		double tax = 1.1;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			String str = reader.readLine();
			amounts[i] = Integer.parseInt(str);
			sum += (int) (amounts[i] * prices[i] * tax);
		}
		System.out.println("購入内容一覧");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(
					itemNames[i] + ":単価" + prices[i] + "円(税込" + (int) (prices[i] * tax) + "円)×" + amounts[i] + "個＝"
							+ (int) (amounts[i] * prices[i] * tax) + "円");
		}
		System.out.println("合計(税込)：" + sum + "円");
		sum *= discount;
		System.out.println("割引適用後合計（税込）:" + sum + "円");
	}
}