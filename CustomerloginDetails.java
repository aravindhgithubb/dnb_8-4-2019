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
@Table(name = "custact")
public class CustomerloginDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	@Column(name = "logindate")
	private String logindate;
	@Column(name = "logindetails")
	private int logindetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	 /* @ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="id",referencedColumnName="id",insertable=false, updatable=false)*/
	@JsonIgnore
	  @OneToMany(mappedBy="custLoginDetails",targetEntity=CustomerDetails.class, fetch=FetchType.EAGER)
	    private List<CustomerDetails> custDetails;

	public List<CustomerDetails> getCustDetails() {
		return custDetails;
	}

	public void setCustDetails(List<CustomerDetails> custDetails) {
		this.custDetails = custDetails;
	}



}
/*
 * /*@Column(name="simple_id") private Integer simple_id;
 * 
 * @OneToOne(fetch= FetchType.LAZY)
 * 
 * @JoinColumn(name="simple_id", insertable=false,updatable=false) private
 * CustomerDetails customerDetails;
 * 
 * 
 * @Column(name="id")
 * 
 * @GeneratedValue private Integer id; //@OneToOne(fetch = FetchType.LAZY)
 * //@PrimaryKeyJoinColumn
 */
/*
 * @Id private Integer id; public Integer getId() { return id; } public void
 * setId(Integer id) { this.id = id; }
 * 
 * @Column(name="logindate") private String logindate;
 * 
 * public String getLogindate() { return logindate; } public void
 * setLogindate(String logindate) { this.logindate = logindate; }
 * 
 * @Column(name="logindetails") private Integer logindetails;
 * 
 * public Integer getLogindetails() { return logindetails; } public void
 * setLogindetails(Integer logindetails) { this.logindetails = logindetails; }
 * /*@OneToOne (mappedBy = "account") //CustomerDetails cust;
 * 
 * //public CustomerDetails getCust() { return cust; } public void
 * setCust(CustomerDetails cust) { this.cust = cust; }
 */
