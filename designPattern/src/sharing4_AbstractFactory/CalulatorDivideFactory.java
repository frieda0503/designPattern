package sharing4_AbstractFactory;

/**
 * 加法計算
 * 
 * @author Frieda
 *
 */
public class CalulatorDivideFactory implements CalculatorFactory {
	@Override
	public int getResult(int a, int b) {
		return a / b;
	}
}
