package sharing4_AbstractFactory;

/**
 * 買2萬送1張券（無累積）
 * 
 * @author frieda
 *
 */
public class PromotionCoupon extends Coupon {

	// 買2萬送1張券
	@Override
	int getCoupon(int total) {
		int ticket = 0;
		if (total >= 20000) {
			ticket = 1;
		}
		return ticket;
	}

}
