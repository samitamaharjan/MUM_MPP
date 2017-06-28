package lab2.prob1;

import java.util.ArrayList;
import java.util.List;

public class Developer {
	private int developerId;
	private List<Feature> feature;
	
	public Developer(int developerId, Feature f) {
		this.developerId = developerId;
		feature = new ArrayList<Feature>();
		addFeature(f);
	}

	public int getDeveloperId() {
		return developerId;
	}

	public List<Feature> getFeature() {
		return feature;
	}
	
	public void addFeature(Feature f) {
		feature.add(f);
	}
}
