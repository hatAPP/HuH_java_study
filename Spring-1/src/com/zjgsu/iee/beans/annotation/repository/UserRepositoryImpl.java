package com.zjgsu.iee.beans.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zjgsu.iee.beans.annotation.TestObject;

//@Repository("userRepository")
@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired(required=false)
	private TestObject testObject;
	
	@Override
	public void save() {
		System.out.println("UserRepository save...");
		System.out.println(testObject);
		
	}

}