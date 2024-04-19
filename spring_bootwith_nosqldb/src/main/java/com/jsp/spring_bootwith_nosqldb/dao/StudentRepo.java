package com.jsp.spring_bootwith_nosqldb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jsp.spring_bootwith_nosqldb.dto.Students;
@Repository
public interface StudentRepo extends MongoRepository<Students,Integer>{

}
