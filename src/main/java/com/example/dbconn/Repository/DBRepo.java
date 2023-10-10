package com.example.dbconn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dbconn.Entity.DBEntity;


@Repository
public interface DBRepo extends JpaRepository<DBEntity, Long> {

    @Modifying
    
    @Query("INSERT INTO DBEntity dt (dt.DataId , dt.OwnerID , dt.Name , dt.ParentID , dt.Deleted) VALUES (:DataId , :OwnerId , :name , :ParentId , :deleted )")

    @Transactional
    public void Create(int DataId, int OwnerId, String name, int ParentId, Boolean deleted);


}
