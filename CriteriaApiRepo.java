package com.example.demo.user;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CriteriaApiRepo {

	List<User> findBy(User user, Helper help);

}
