package sharing2_SimpleFactory;

public class CalculatorMain {
	public static void main(String[] args) {
		calculatorFactory();
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
