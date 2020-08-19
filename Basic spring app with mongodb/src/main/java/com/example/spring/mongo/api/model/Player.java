package com.example.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "NewDB")
public class Player {
	@Id
	public int id;
	
	public String playerName;
	public String iplTeam;
	public int getId() {
		return this.id;
	}
	public String getPname() {
		return this.playerName;
	}
	public String getTeam() {
		return this.iplTeam;
	}
}
