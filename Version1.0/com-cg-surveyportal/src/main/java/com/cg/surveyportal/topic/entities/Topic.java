package com.cg.surveyportal.topic.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Topic {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(nullable = false, length = 50)
    private String name;
	@Column(nullable = false, length = 100)
    private String description;
//    @OneToMany(mappedBy="topic", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Survey> surveys;
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    private Surveyor surveyors;
	
	//Constructors
	public Topic() {
	}
	public Topic(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	//getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//toString 
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}
