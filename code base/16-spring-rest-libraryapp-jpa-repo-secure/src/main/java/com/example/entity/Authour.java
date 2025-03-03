package com.example.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Authour {
	@Id
private int authourId;
private String name;
public Authour(int authourId, String name) {
	super();
	this.authourId = authourId;
	this.name = name;
}
public Authour(){
	
}

}
