package lv.accenture.bootcamp.webdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lv.accenture.bootcamp.webdemo.model.Cat;
 
@Repository
public interface CatRepository extends CrudRepository<Cat,Long>{
	 
	//SELECT * FROM Cat WHERE Cat.nickname like %nickname%
	
	//@Query("SELECT c FROM Cat c WHERE c.nickname LIKE %:nickname%")
	//List<Cat> findByNickname(String nickname);
	          
	List<Cat> findByNicknameContainingIgnoreCase(String nickname);
} 