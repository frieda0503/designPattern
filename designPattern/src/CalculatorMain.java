import sharing1_WithoutFactory.CalculatorWithoutPattern;
import sharing2_SimpleFactory.Calculator;
import sharing2_SimpleFactory.CalculatorSimpleFactory;
import sharing3_Factory.CalculatorAddFactory;

public class CalculatorMain {
	// 輸入值
	static int a = 1000;
	static int b = 2000;
	static String operator = "+";

	public static void main(String[] args) {
		calculator();
		calculatorSimpleFactory();
		calculatorFactory();
	}

	/**
	 * 業物邏輯與UI拆開的簡易計算機測試
	 */
	public static void calculator() {
		System.out.println(">>>> Calculator without pattern 測試 <<<< ");

		try {
			// 計算並輸出
			System.out.println("輸入: " + a + operator + b);
			CalculatorWithoutPattern calculator = new CalculatorWithoutPattern();
			int result = calculator.calculate(a, b, operator);
			System.out.println("計算結果： " + a + operator + b + " = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("======================================");
	}

	/**
	 * 使用簡單工廠模式(SimpleFactory Pattern)實現簡易計算機
	 */
	public static void calculatorSimpleFactory() {
		System.out.println(">>>> Simple Calculator Factory 測試 <<<< ");

		try {
			System.out.println("輸入: " + a + operator + b);
			Calculator calculator = CalculatorSimpleFactory.getCalculator(operator);
			int result = calculator.getResult(a, b);
			System.out.println("計算結果： " + a + operator + b + " = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("======================================");
	}

	/**
	 * 使用工廠模式(Factory Pattern)實現計算機
	 */
	public static void calculatorFactory() {
		System.out.println(">>>> Calculator Factory 測試 <<<< ");

		try {
			System.out.println("輸入: " + a + " + " + b);
			CalculatorAddFactory calculator = new CalculatorAddFactory();
			int result = calculator.getResult(a, b);
			System.out.println("計算結果： " + a + " + " + b + " = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("======================================");
	}
}
