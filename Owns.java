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
@Table(name = "Owns")
public class Owns implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "source")
	private String source;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	@JsonIgnore
	  @OneToMany(mappedBy="owns",targetEntity=CustomerDetails.class, fetch=FetchType.EAGER)
	    private List<CustomerDetails> custOwns;

	public List<CustomerDetails> getCustOwns() {
		return custOwns;
	}

	public void setCustOwns(List<CustomerDetails> custOwns) {
		this.custOwns = custOwns;
	}

}
