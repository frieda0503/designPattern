package sharing1_SimpleFactory;

public class CalculatorMain {
	public static void main(String[] args) {
		calculatorA();
		System.out.println("=======================================");
		calculatorFactory();
	}

	/**
	 * 業物邏輯與UI拆開的簡易計算機測試
	 */
	public static void calculatorA() {
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

	/**
	 * 使用簡單工廠模式(SimpleFactory Pattern)實現簡易計算機
	 */
	public static void calculatorFactory() {
		System.out.println(">>>> CalculatorFactory 測試 <<<< ");

		// 輸入值
		int a = 10;
		int b = 20;
		String operator = "+";

		try {
			System.out.println("輸入: " + a + operator + b);
			Calculator calculator = CalculatorFactory.getCalculator(operator);
			int result = calculator.getResult(a, b);
			System.out.println("計算結果： " + a + operator + b + " = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
