package com.jsp.spring_bootwith_nosqldb.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    @Id
    private int id;
    private String name;
    private String address;
    

}
