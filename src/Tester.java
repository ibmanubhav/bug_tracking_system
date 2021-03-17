
public class Tester extends Employee {

	private String buildversion;
	private String synopsis;
	private SEVERITY severity;
	private int bugid;
	private BUGSTATUS bugstatus;

	Tester(int id, String name, String emailid, int mobile, String role, int bugid, SEVERITY severity, String synopsis,
			BUGSTATUS bugstatus) {
		super(id, name, emailid, mobile, role);
		this.bugid = bugid;
		this.severity = severity;
		this.synopsis = synopsis;
		this.bugstatus = bugstatus;

	}

	@Override
	public String toString() {
		return "Tester [buildversion=" + buildversion + ", synopsis=" + synopsis + ", severity=" + severity + ", bugid="
				+ bugid + ", bugstatus=" + bugstatus + "]";
	}

	public int getBugid() {
		return bugid;
	}

	public void setBugid(int bugid) {
		this.bugid = bugid;
	}

	public BUGSTATUS getBugstatus() {
		return bugstatus;
	}

	public void setBugstatus(BUGSTATUS bugstatus) {
		this.bugstatus = bugstatus;
	}

	void addBug() {
		System.out.println("Bug is Assigned to Developer");
	}

	void bugSeverity() {
		System.out.println("Severity of Bug is " + getSeverity());
	}

	public String getBuildversion() {
		return buildversion;
	}

	public void setBuildversion(String buildversion) {
		this.buildversion = buildversion;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		synopsis = synopsis;
	}

	public SEVERITY getSeverity() {
		return severity;
	}

	public void setSeverity(SEVERITY severity) {
		this.severity = severity;
	}

}
