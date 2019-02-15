package sharing4_AbstractFactory;

/**
 * 家電館
 * 
 * @author frieda
 *
 */
public class ClothesFactory implements AnniversaryFactory {

	@Override
	public int getDiscount(int total) {
		CreditCardDiscount dis = new CreditCardDiscount();
		return dis.getDiscount(total);
	}

	@Override
	public int getCoupon(int total) {
		PromotionCoupon cou = new PromotionCoupon();
		return cou.getCoupon(total);
	}

}
