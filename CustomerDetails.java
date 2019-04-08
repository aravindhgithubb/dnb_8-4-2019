package com.dnb.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "simple")
public class CustomerDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "creationdate")
	private String creationdate;
	@Column(name = "phone")
	private String phone;
	
	@ManyToOne(optional=false)
	    @JoinColumn(name="id",referencedColumnName="id" ,insertable=false, updatable=false)
	    private CustomerloginDetails custLoginDetails;
	
	    @ManyToOne(optional=false)
	    @JoinColumn(name="id",referencedColumnName="id",insertable=false, updatable=false)
	    private custinterest custInterest;
	    
	    @ManyToOne(optional=false)
	    @JoinColumn(name="id",referencedColumnName="id",insertable=false, updatable=false)
	    private Accomodation accom;
	    
	    @ManyToOne(optional=false)
	    @JoinColumn(name="id",referencedColumnName="id",insertable=false, updatable=false)
	    private Coners cow;
	    
	    @ManyToOne(optional=false)
	    @JoinColumn(name="id",referencedColumnName="id",insertable=false, updatable=false)
	    private Owns owns; 
	    
	    @ManyToOne(optional=false)
	    @JoinColumn(name="id",referencedColumnName="id",insertable=false, updatable=false)
	    private Persons persons; 
	    
	    @ManyToOne(optional=false)
	    @JoinColumn(name="id",referencedColumnName="id",insertable=false, updatable=false)
	    private Visits visits;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", phone=" + phone + "," + ", firstName=" + name + ", Address=" + address
				+ ", Creationdate=" + creationdate + "]";
	}

	public CustomerloginDetails getCustLoginDetails() {
		return custLoginDetails;
	}

	public void setCustLoginDetails(CustomerloginDetails custLoginDetails) {
		this.custLoginDetails = custLoginDetails;
	}

	public custinterest getCustInterest() {
		return custInterest;
	}

	public void setCustInterest(custinterest custInterest) {
		this.custInterest = custInterest;
	}

	public Accomodation getAccom() {
		return accom;
	}

	public void setAccom(Accomodation accom) {
		this.accom = accom;
	}


	public Owns getOwns() {
		return owns;
	}

	public void setOwns(Owns owns) {
		this.owns = owns;
	}


	public Visits getVisits() {
		return visits;
	}

	public void setVisits(Visits visits) {
		this.visits = visits;
	}

	public Coners getCow() {
		return cow;
	}

	public void setCow(Coners cow) {
		this.cow = cow;
	}

	public Persons getPersons() {
		return persons;
	}

	public void setPersons(Persons persons) {
		this.persons = persons;
	}
}
