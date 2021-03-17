import java.util.Date;

public class BTS {
	public static void main(String[] args) {
		//Creating Project
		Project project = new Project(10012, "Robert", "IRCTC");
		
		//Creating Bug for above Project
		BugInfo bug = new BugInfo(112234, "Defects", "Urgent", "IRCTC", "Website Search Engine", "Functional Defect",
				BUGSTATUS.ASSIGNED, project.getId());
		bug.addBug();
		System.out.println(bug);
		
		//Tester assigned for above bug
		Tester tester = new Tester(22, "Ram", "ram@ibm.com", 999999999, "Tester", bug.getBugid(), SEVERITY.MINOR,
				"This bug include UI changes", BUGSTATUS.OPEN);
		tester.setBuildversion("0.2");
		tester.addBug();
		tester.bugSeverity();
		System.out.println(tester);
		
		//Developer assigned for above bug
		Developer developer = new Developer(32, "Shyam", "Shyam@ibm.com", 888888888, "Developer", bug.getBugid(),new Date());
		System.out.println(developer);
		developer.setStatus(BUGSTATUS.FIXED);
		developer.bugstatusinfo();
		
		//Manager verifying final status
		Manager manager = new Manager(54, "Robert", "robert@ibm.com", 777777777, "Manager", project.getId(), bug.getBugid(), tester.getBugstatus(), developer.getStatus());
		System.out.println(manager);
		manager.verifyBugStatus();
		manager.finalStatus();
		

	}
}
