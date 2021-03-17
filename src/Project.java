
public class Project {
	private int id;
	private String manager;
	private String Customer;
	Project(int id, String manager, String Customer){
		setId(id);
		setManager(manager);
		setCustomer(Customer);
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", manager=" + manager + ", Customer=" + Customer + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getCustomer() {
		return Customer;
	}
	public void setCustomer(String customer) {
		Customer = customer;
	}

}
