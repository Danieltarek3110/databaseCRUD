package com.example.dbconn.Controller;

import org.apache.tika.io.IOExceptionWithCause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbconn.Service.DBconnService;

@RestController
public class DBController {
    @Autowired
    private DBconnService DBconnService;

    @PostMapping("/submit")
    public String CreateTuple (@RequestParam int dataid ,  int ownerid ,  String name , int parentid , boolean deleted) {
         DBconnService.CreateTuple(dataid , ownerid , name , parentid , deleted);
         return "User Added Successfully";
    }

}
