package sharing4_AbstractFactory;

/**
 * 滿一萬送2張券
 * 
 * @author frieda
 *
 */
public class DepartmentCoupon extends Coupon {

	// 滿一萬送2張券
	@Override
	int getCoupon(int total) {
		int ticket = 0;
		if (total >= 10000) {
			int base = total / 10000;
			ticket = base * 2;

		}
		return ticket;
	}

}
