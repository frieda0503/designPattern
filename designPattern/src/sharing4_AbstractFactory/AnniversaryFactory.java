package sharing4_AbstractFactory;

/**
 * 週年慶
 * 
 * @author frieda
 *
 */
public abstract class AnniversaryFactory {
	abstract int getDiscount(int total);

	abstract int getCoupon(int total);
}
