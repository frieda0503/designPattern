package sharing1_SimpleFactory;

/**
 * 只留下業務邏輯的部分<br>
 * 優點是開發迅速<br>
 * 缺點是如果要新增計算方法就要進來修改計算邏輯的程式，不符合開放-關閉的開發模式<br>
 * 
 * @author Frieda
 *
 */
public class CalculatorWithoutPattern {
	private static int result;

	/**
	 * 計算方法，輸入數字a,b，運算方法operator，進行相對應的計算
	 * 
	 * @param a
	 * @param b
	 * @param operate
	 * @return
	 * @throws Exception
	 */
	public int calculate(int a, int b, String operator) throws Exception {
		switch (operator) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		default:
			throw new Exception("輸入錯誤");
		}
		return result;
	}
}
