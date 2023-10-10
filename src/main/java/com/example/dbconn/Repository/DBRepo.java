package com.example.dbconn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dbconn.Entity.DBEntity;

public interface DBRepo extends JpaRepository<DBEntity, Long > {
    
    @Query("INSERT INTO DTreeCore (DataID , OwnerID , Name , ParentID , Deleted)"+
          "VALUES (:DataId , :OwnerId , :name , :ParentId , :deleted )")
    public void Create(Long DataId , Long OwnerId , String name , Long ParentId , Boolean deleted);

    
}
