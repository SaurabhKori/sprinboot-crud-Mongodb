package com.jsp.spring_bootwith_nosqldb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.spring_bootwith_nosqldb.dao.StudentDao;
import com.jsp.spring_bootwith_nosqldb.dto.Students;
@RestController
public class StudentControler {
    @Autowired
    StudentDao sd;
    @PostMapping("/save")
   public String save(@RequestBody Students st){
       sd.insert(st);
       return "inserted..........";
   }
   @PutMapping("/update/{id}")
   public String updatedata(@PathVariable("id") int id,@RequestBody Students st){
    return sd.update(id, st);
   }
   @DeleteMapping("/delete/{id}")
   public String delete(@PathVariable int id){
    return sd.delete(id);
   }
   @GetMapping("/fethoneData/{id}")
   public Students fetch(@PathVariable int id){
    return sd.getbyId(id);
   }
   @GetMapping("/fetchAll")
   public List<Students> fetchAlldata(){
    return sd.getAllData();
   }
}
