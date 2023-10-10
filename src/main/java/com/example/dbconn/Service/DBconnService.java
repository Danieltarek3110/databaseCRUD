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

    public String CreateTuple(int dataid , int ownerid , String name , int parentid , Boolean deleted ){
        try{
            /*  dbRepo.save(new DBEntity(dataid, ownerid, name, parentid, false));  */
            
            dbRepo.Create(dataid, ownerid, name, parentid, deleted);
        }
        catch(Exception e){ 
            return e.getMessage().toString();
        }
        return  " #### " + "Sucessfully added" + name ;
    }

    
}
