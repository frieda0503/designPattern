package sharing1_SimpleFactory;

/**
 * 加法計算
 * 
 * @author Frieda
 *
 */
public class CalulatorAdd implements Calculator {
	@Override
	public int getResult(int a, int b) {
		return a + b;
	}
}
