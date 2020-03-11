package lv.accenture.bootcamp.webdemo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;



@Entity
public class Cat implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	
	@Size(min = 2, max = 256, message ="Please be carefull")
	private String nickname;
		
	@PositiveOrZero(message ="The age can not be less than zero. Please enter something appropriate")
	private Integer age;
	
	private String photo;

	public Cat() {

	}

	public Cat(Long id, String nickname, Integer age, String photo) {
		this.id = id;
		this.nickname = nickname;
		this.age = age;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
