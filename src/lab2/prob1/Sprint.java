package lab2.prob1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprint {
	private LocalDate dueDate;
	private List<Feature> feature;
	
	public Sprint(LocalDate duetDate, Feature f) {
		this.dueDate = duetDate;
		feature = new ArrayList<Feature>();
		addFeature(f);
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public List<Feature> getFeature() {
		return feature;
	}
	
	public void addFeature(Feature f) {
		feature.add(f);
	}
}
