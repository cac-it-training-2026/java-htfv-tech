package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装
		int amount = 0;
		int price = 100;
		System.out.println("鉛筆を購入しますか？\nはい:0、いいえ:1>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int buyFlag = Integer.parseInt(str);

		while (buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の本数を１つ増やしますか？\nはい:0、いいえ:1>");
			String str2 = reader.readLine();
			buyFlag = Integer.parseInt(str2);
		}
		System.out.println("購入した鉛筆の本数は" + amount + "本です。");
		System.out.println("購入した鉛筆の合計金額は" + amount * price + "円です。");
	}

}
