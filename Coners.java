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
@Table(name = "Coners")
public class Coners implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "cowner")
	private String cowner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@JsonIgnore
	 @OneToMany(mappedBy="cow",targetEntity=CustomerDetails.class, fetch=FetchType.EAGER)
	    private List<CustomerDetails> custOwn;

	public List<CustomerDetails> getCustOwn() {
		return custOwn;
	}

	public void setCustOwn(List<CustomerDetails> custOwn) {
		this.custOwn = custOwn;
	}

	public String getCowner() {
		return cowner;
	}

	public void setCowner(String cowner) {
		this.cowner = cowner;
	}
}
