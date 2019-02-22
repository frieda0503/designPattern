package sharing2_SimpleFactory;

/**
 * SimpleFactory Pattern<br>
 * 使用Calculator Factory來產生對應的計算類別<br>
 * 優點是容易擴充與維護，因為毎個計算類別都是獨立的<br>
 * 缺點是程式碼被拆的很散，有新增時要回來修改程式碼
 * 
 * @author Frieda
 *
 */
public class CalculatorSimpleFactory {

	public static Calculator getCalculator(String operator) throws Exception {
		Calculator calculator = null;
		switch (operator) {
		case "+":
			calculator = new CalulatorAdd();
			break;
		case "-":
			calculator = new CalulatorMinus();
			break;
		case "*":
			calculator = new CalulatorMultiple();
			break;
		case "/":
			calculator = new CalulatorDivide();
			break;
		default:
			throw new Exception("輸入錯誤");
		}

		return calculator;
	}
}
