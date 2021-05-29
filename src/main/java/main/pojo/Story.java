package main.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import main.enums.Status;

@Entity
@Table(name = "Stories")
public class Story {

	@Id
	@Column(name = "id")
	private Long storyid;
	@Column(name = "heading")
	private String heading;
	@Column(name = "description")
	private String description;
	@Column(name = "status")
	private Status status;
	@Column(name = "assignee")
	private String assignee;
	@Column(name = "reporter")
	private String reporter;
	@Column(name = "story_points")
	private int storyPoints;

	public String getHeading() {
		return heading;
	}

	public Long getStoryid() {
		return storyid;
	}

	public void setStoryid(Long storyid) {
		this.storyid = storyid;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public int getStoryPoints() {
		return storyPoints;
	}

	public void setStoryPoints(int storyPoints) {
		this.storyPoints = storyPoints;
	}

}
