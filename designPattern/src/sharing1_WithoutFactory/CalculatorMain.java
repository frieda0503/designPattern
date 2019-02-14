package sharing1_WithoutFactory;

public class CalculatorMain {
	public static void main(String[] args) {
		calculator();
	}

	/**
	 * 業物邏輯與UI拆開的簡易計算機測試
	 */
	public static void calculator() {
		System.out.println(">>>> Calculator without pattern 測試 <<<< ");

		// 輸入值
		int a = 10;
		int b = 20;
		String operator = "+";

		try {
			// 計算並輸出
			System.out.println("輸入: " + a + operator + b);
			CalculatorWithoutPattern calculator = new CalculatorWithoutPattern();
			int result = calculator.calculate(a, b, operator);
			System.out.println("計算結果： " + a + operator + b + " = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
