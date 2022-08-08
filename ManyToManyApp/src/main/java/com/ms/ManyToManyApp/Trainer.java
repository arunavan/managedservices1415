package com.ms.ManyToManyApp;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Trainer_tab")
public class Trainer {
	@Id
	private int trainerId;
	private String trainerName;
	
	@ManyToMany(cascade=CascadeType.ALL,targetEntity=Scholar.class)
	@JoinTable(name="trainer_scholar")
	Set<Scholar>scholars;
	
	
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public Set<Scholar> getScholars() {
		return scholars;
	}
	public void setScholars(Set<Scholar> scholars) {
		this.scholars = scholars;
	}
	
	
	

}
