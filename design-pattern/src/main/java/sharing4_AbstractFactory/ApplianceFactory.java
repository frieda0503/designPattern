package sharing4_AbstractFactory;

/**
 * 家電館
 * 
 * @author frieda
 *
 */
public class ApplianceFactory extends AnniversaryFactory {

	@Override
	public int getDiscount(int total) {
		DepartmentDiscount dis = new DepartmentDiscount();
		return dis.getDiscount(total);
	}

	@Override
	public int getCoupon(int total) {
		DepartmentCoupon cou = new DepartmentCoupon();
		return cou.getCoupon(total);
	}

}
