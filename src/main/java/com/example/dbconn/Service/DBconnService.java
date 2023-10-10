package com.example.dbconn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.dbconn.Repository.DBRepo;

@Service
public class DBconnService {

    @Value("${BASE_URL}")
    private String BASE_URL;

    @Autowired
    private DBRepo dbRepo;

    public String CreateTuple(Long dataid , Long ownerid , String name , int parentid , Boolean deleted ){
        try{
            dbRepo.Create(dataid, ownerid, name, ownerid, deleted);
        }
        catch(Exception e){ 
            return e.getMessage();
        }
        return  " #### " + "Sucessfully added" + name ;
    }

    
}
