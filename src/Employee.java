
public class Employee {
	private String name;
	private int id;
	protected String emailid;
	private long mobile;
	private String role;

	public Employee( int id,String name, String emailid, long mobile, String role) {
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.mobile = mobile;
		this.role=role;

	}

	void Status() {
		System.out.println("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
