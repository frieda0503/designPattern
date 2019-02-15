package sharing4_AbstractFactory;

/**
 * 週年慶
 * 
 * @author frieda
 *
 */
public interface AnniversaryFactory {
	int getDiscount(int total);

	int getCoupon(int total);
}
