package lab2.prob1;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private String projectId;
	private List<Release> release;
	private List<Feature> feature;
	
	public Project(String projectId) {
		this.projectId = projectId;
		release = new ArrayList<Release>();
		feature = new ArrayList<Feature>();
	}
	
	public String getProjectId() {
		return projectId;
	}

	public List<Release> getRelease() {
		return release;
	}

	public List<Feature> getFeature() {
		return feature;
	}

	public void addFeature(Feature f) {
		feature.add(f);
	}
	
	public void addFeature(Release r) {
		release.add(r);
	}
}
