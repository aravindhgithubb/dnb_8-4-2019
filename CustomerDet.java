package com.dnb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "simple")
public class CustomerDet implements Serializable {

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
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

}
