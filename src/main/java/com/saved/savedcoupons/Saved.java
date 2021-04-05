package com.saved.savedcoupons;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "savedcoupons")
public class Saved {
    @Id
    private int id;

    private String name;
   
    
    private String code;
    
    private String date;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return this.date;
    }

    public void setDate(String date){
        this.date = date;
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public Saved(String name, int id, String code, String date)
    {
    this.name=name;
    this.id=id;
    this.code=code;
    this.date=date;
    }
    public Saved(){}


}
