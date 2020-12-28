package vjudge.part_two;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TotalExpenses {
	private static final int DISCOUNT_QUANTITY = 1000;
	private static final int DISCOUNT = 10;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = 0;
		if (scanner.hasNextInt()) {
			t = scanner.nextInt();
		}
		if (t >= 1 && t <= 1000) {
			int[] quantity = new int[t];
			int[] price = new int[t];

			for (int i = 0; i < t; i++) {
				quantity[i] = scanner.nextInt();
				price[i] = scanner.nextInt();
			}
			for (int i = 0; i < t; i++) {
				if ((quantity[i] >= 1 && quantity[i] <= 100000) && (price[i] >= 1 && price[i] <= 100000)) {
					calculateTotalExpenses(quantity[i], price[i]);
				}
			}

		}
		scanner.close();
	}

	private static void calculateTotalExpenses(int quantity, int price) {
		double totalExpense = 0d;
		if (quantity > DISCOUNT_QUANTITY) {
			int totalPrice = quantity * price;
			totalExpense = totalPrice - ((totalPrice / 100) * DISCOUNT);
		} else {
			totalExpense = quantity * price;
		}
		DecimalFormat decimalFormat = new DecimalFormat("#.000000");

		String format = decimalFormat.format(totalExpense);
		System.out.println(format);
	}
}
