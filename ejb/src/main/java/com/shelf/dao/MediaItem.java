package com.shelf.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="media_item", schema="db_shelf")
public class MediaItem extends BaseDAO {

	private static final long serialVersionUID = 1225961010904882993L;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="CREATOR")
	private String creator;
	
	@Column(name="PUBLISHER")
	private String publisher;

	@Column(name="YEAR")
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}