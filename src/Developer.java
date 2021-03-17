import java.util.Date;

public class Developer extends Employee {
	private Date submitedon;
	private BUGSTATUS status;
	private int bugid;

	Developer(int id, String name, String emailid, int mobile, String role, int bugid, Date submitedon) {
		super(id, name, emailid, mobile, role);
		this.bugid = bugid;
		this.submitedon=submitedon;

	}

	void bugstatusinfo() {
		System.out.println(getStatus());
	}

	public Date getSubmitedon() {
		return submitedon;
	}

	public void setSubmitedon(Date submitedon) {
		this.submitedon = submitedon;
	}

	public BUGSTATUS getStatus() {
		return status;
	}

	public void setStatus(BUGSTATUS status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Developer [submitedon=" + submitedon + ", status=" + status + ", bugid=" + bugid + "]";
	}

}
