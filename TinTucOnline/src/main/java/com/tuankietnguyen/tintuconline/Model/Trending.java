package com.tuankietnguyen.tintuconline.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="trending")
public class Trending {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idtrend;
	private String trendname;
	private String hinhanh;
	private String tomtat;
	
	public Trending() {
		
	}

	public Trending(String trendname, String hinhanh, String tomtat) {
		super();
		this.trendname = trendname;
		this.hinhanh = hinhanh;
		this.tomtat = tomtat;
	}

	public Trending(int idtrend, String trendname, String hinhanh, String tomtat) {
		super();
		this.idtrend = idtrend;
		this.trendname = trendname;
		this.hinhanh = hinhanh;
		this.tomtat = tomtat;
	}

	public int getIdtrend() {
		return idtrend;
	}

	public void setIdtrend(int idtrend) {
		this.idtrend = idtrend;
	}

	public String getTrendname() {
		return trendname;
	}

	public void setTrendname(String trendname) {
		this.trendname = trendname;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getTomtat() {
		return tomtat;
	}

	public void setTomtat(String tomtat) {
		this.tomtat = tomtat;
	}
	
	
}
