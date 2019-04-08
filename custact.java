package com.dnb.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "custact")
public class custact implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "logindate")
	private String logindate;
	@Column(name = "logindetails")
	private int logindetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogindate() {
		return logindate;
	}

	public void setLogindate(String logindate) {
		this.logindate = logindate;
	}

	public int getLogindetails() {
		return logindetails;
	}

	public void setLogindetails(int logindetails) {
		this.logindetails = logindetails;
	}

	@OneToMany
	@JoinTable(name = "custact", inverseJoinColumns = { @JoinColumn(name = "id") }
	// joinColumns = {@JoinColumn(name="id")}
	)
	private List<custinterest> custIn;

	public List<custinterest> getCustIn() {
		return custIn;
	}

	public void setCustIn(List<custinterest> custIn) {
		this.custIn = custIn;
	}
}
