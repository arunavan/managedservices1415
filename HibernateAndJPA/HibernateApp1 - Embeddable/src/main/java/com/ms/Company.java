package com.ms;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Company {
   @Id
    @GeneratedValue
    private Integer id;
   private String name;
  private String address;
   @Embedded
    private ContactPerson contactPerson;
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



	public ContactPerson getContactPerson() {
		return contactPerson;
	}



	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}

   
}
