package com.jsp.spring_bootwith_nosqldb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.spring_bootwith_nosqldb.dto.Students;
@Repository
public class StudentDao {
    @Autowired
    StudentRepo sp;
    public Students insert(Students st){
         return (Students)sp.save(st);
    }
    public Students getbyId(int id){
        return (Students)sp.findById(id).get();
    }
    public String update(int id,Students st){
        try{
            Students s=getbyId(id);
            if(s.getId()==st.getId()){
               sp.save(st);
               return "update";
            }
        }catch(Exception e){
            return "Id is wrong";
        }
        return null;
    }
    public String delete(int id){
      try {
        sp.delete(sp.findById(id).get());
        return "delete";
      } catch (Exception e) {
        // TODO: handle exception
        return "id is wrong";
      }
      
    }
  public List<Students> getAllData(){
    return sp.findAll();
  }
}
