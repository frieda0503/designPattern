package sharing6_ChainOfResponsibility;

/**
 * 管理者物件
 * 
 * @author Frieda
 *
 */
public abstract class Manager {
	protected String name;

	// 上一級管理者
	protected Manager superior;

	public Manager(String name) {
		this.name = name;
	}

	// 設定上一級的管理者
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}

	/**
	 * 提出申請
	 * 
	 * @param request
	 */
	abstract public void apply(Requisition request);
}
