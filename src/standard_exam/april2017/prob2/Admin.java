package standard_exam.april2017.prob2;

public class Admin {
	// implement
	private Department[] departments;
	 
	
	public Admin(Department[] departments) {
		this.departments = departments;
	}

	public String hourlyCompanyMessage() {
		String message = "";
		if (departments == null)
			return null;
		for (Department dept : departments) {
			message += format(dept.getName(), dept.nextMessage());
		}		
		return message;
	}

	public String format(String name, String msg) {
		return String.format("%s: %s%n", name, msg);
	}

}
