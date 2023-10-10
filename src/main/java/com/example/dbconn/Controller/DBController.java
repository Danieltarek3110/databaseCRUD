package com.example.dbconn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbconn.Service.DBconnService;

@RestController
@RequestMapping("/api/v1/DBconn")
public class DBController {
    @Autowired
    private DBconnService DBconnService;

    @PostMapping(value={"" , "/"} , produces = MediaType.APPLICATION_JSON_VALUE)
    public String CreateTuple(
        @RequestParam("DataID") Long dataid,
        @RequestParam("OwnerID") Long ownerid,
        @RequestParam("Name") String name,
        @RequestParam("ParentID") int parentid,
        @RequestParam("Deleted") Boolean deleted
    ){
        return DBconnService.CreateTuple(dataid , ownerid , name , parentid , deleted);
    }

}
