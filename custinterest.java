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
@Table(name = "custinterest")
public class custinterest implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;


	@Column(name = "status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*@ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="id",referencedColumnName="id",insertable=false, updatable=false)*/
	@JsonIgnore
    @OneToMany(mappedBy="custInterest",targetEntity=CustomerDetails.class, fetch=FetchType.EAGER)
    private List<CustomerDetails> custInt;

	public List<CustomerDetails> getCustInt() {
		return custInt;
	}

	public void setCustInt(List<CustomerDetails> custInt) {
		this.custInt = custInt;
	}
 
}
