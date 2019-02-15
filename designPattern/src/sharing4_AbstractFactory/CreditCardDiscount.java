package sharing4_AbstractFactory;

/**
 * 刷卡優惠
 * 
 * @author frieda
 *
 */
public class CreditCardDiscount extends Discount {

	// 刷卡滿5000送500
	@Override
	int getDiscount(int total) {
		int discount = 0;
		if (total >= 5000) {
			double base = Math.round(total / 5000.0);
			discount = (int) Math.round(base * 500);
		}
		return total - discount;
	}

}
