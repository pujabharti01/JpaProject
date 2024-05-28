package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DemoDto {
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
	public Long getHeight() {
		return height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}
	private String name = "Puja";
    private int age = 25;
    private Long height = 6L;
    
//    public String getName() {00
//        return name;
//    }
//
//    // Setter for field1
//    public void setName(String name) {
//        this.name = name;
//    }

}
