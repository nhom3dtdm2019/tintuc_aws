package com.tuankietnguyen.tintuconline.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="popular")
public class popular {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String tomtat;
	private String hinhanh;
	
	public popular() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTomtat() {
		return tomtat;
	}
	public void setTomtat(String tomtat) {
		this.tomtat = tomtat;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	
	
}
