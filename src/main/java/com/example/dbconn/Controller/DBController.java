package com.example.dbconn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/submit")
    public String CreateTuple(
        @RequestParam("DataID") int dataid,
        @RequestParam("OwnerID") int ownerid,
        @RequestParam("Name") String name,
        @RequestParam("ParentID") int parentid,
        @RequestParam("Deleted") Boolean deleted
    ){
        return DBconnService.CreateTuple(dataid , ownerid , name , parentid , deleted);
    }

}
