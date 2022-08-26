package com.infosys.infytel.dto;

import java.util.ArrayList;
import java.util.List;

import com.infosys.infytel.entity.Customer;
import com.infosys.infytel.entity.FriendFamily;

public class CustomerDTO {

	long phoneNo;
	String name;
	int age;
	char gender;
	List<Long> friendAndFamily;
	String password;
	String address;
	PlanDTO currentPlan;



	public PlanDTO getCurrentPlan() {
		return currentPlan;
	}

	public void setCurrentPlan(PlanDTO currentPlan) {
		this.currentPlan = currentPlan;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Long> getFriendAndFamily() {
		return friendAndFamily;
	}

	public void setFriendAndFamily(List<Long> friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "CustomerDTO [phoneNo=" + phoneNo + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", friendAndFamily=" + friendAndFamily + ", password=" + password + ", address=" + address + "]";
	}

	// Converts Entity into DTO
	public static CustomerDTO valueOf(Customer cust) {
		CustomerDTO custDTO = new CustomerDTO();
		custDTO.setAge(cust.getAge());
		custDTO.setGender(cust.getGender());
		custDTO.setName(cust.getName());
		custDTO.setPhoneNo(cust.getPhoneNo());
		custDTO.setAddress(cust.getAddress());
		PlanDTO planDTO = PlanDTO.valueOf(cust.getPlan());
		custDTO.setCurrentPlan(planDTO);
		
		List<FriendFamily> friends = cust.getFriends();
		List<Long> friendList = new ArrayList<>();
		for (FriendFamily friend : friends) {
			friendList.add(friend.getFriendAndFamily());
		}
		custDTO.setFriendAndFamily(friendList);
		
		return custDTO;
	}

	// Converts DTO into Entity
	public Customer createEntity() {
		Customer cust = new Customer();
		cust.setAge(this.getAge());
		cust.setGender(this.getGender());
		cust.setName(this.getName());
		cust.setPhoneNo(this.getPhoneNo());
		cust.setAddress(this.getAddress());
		cust.setPassword(this.getPassword());
		
		return cust;
	}

}
