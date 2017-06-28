package lab2.prob1;

import java.util.ArrayList;
import java.util.List;

public class Release {
	List<Sprint> sprint;
	
	public Release(Sprint s) {
		sprint = new ArrayList<Sprint>();
		addSprint(s);
	}
	
	public List<Sprint> getSprint() {
		return sprint;
	}

	public void addSprint(Sprint s) {
		sprint.add(s);
	}
}
