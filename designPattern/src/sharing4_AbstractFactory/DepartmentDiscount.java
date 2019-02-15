package sharing4_AbstractFactory;

/**
 * 全館優惠
 * 
 * @author frieda
 *
 */
public class DepartmentDiscount extends Discount {

	// 全館打八折
	@Override
	int getDiscount(int total) {
		return (int) (Math.round(total * 0.8));
	}

}
