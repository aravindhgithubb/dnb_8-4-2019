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
@Table(name = "Accomodation")
public class Accomodation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "post")
	private String post;
   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@JsonIgnore
	 @OneToMany(mappedBy="accom",targetEntity=CustomerDetails.class, fetch=FetchType.EAGER)
	    private List<CustomerDetails> custAcco;

	public List<CustomerDetails> getCustAcco() {
		return custAcco;
	}

	public void setCustAcco(List<CustomerDetails> custAcco) {
		this.custAcco = custAcco;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}
