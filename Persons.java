package com.dnb.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Persons")
public class Persons implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "agent")
	private String agent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@JsonIgnore
	 @OneToMany(mappedBy="persons",targetEntity=CustomerDetails.class, fetch=FetchType.EAGER)
	    private List<CustomerDetails> custPerson;

	public List<CustomerDetails> getCustPerson() {
		return custPerson;
	}

	public void setCustPerson(List<CustomerDetails> custPerson) {
		this.custPerson = custPerson;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}
}
