package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		int[] prices;
		prices = new int[5];
		String[] itemNames;
		itemNames = new String[5];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください:>");
			itemNames[i] = reader.readLine();
		}
		System.out.println("各商品の単価を順に入力してください:");

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の単価:>");
			String str = reader.readLine();
			prices[i] = Integer.parseInt(str);
		}
		System.out.println("商品登録一覧");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + ":" + prices[i] + "円");
		}
	}

}
