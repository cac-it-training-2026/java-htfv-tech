package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
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
			sum += amounts[i] * prices[i];
		}
		boolean discount_flag = false;
		if (sum >= 5000) {
			discount_flag = true;
		}

		if (discount_flag) {
			System.out.println("割引前合計：" + sum + "円");
			sum *= discount;
			System.out.println("割引適用（10％OFF）:" + sum + "円");
			sum *= tax;

		}
		sum *= tax;
		System.out.println("税込合計:" + sum + "円");
	}

}
