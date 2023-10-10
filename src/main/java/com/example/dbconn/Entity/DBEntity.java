package com.example.dbconn.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TestDBconn")
public class DBEntity {

    @jakarta.persistence.Id
    @Column(name = "DataID")
    private int DataId;

    @Column(name = "OwnerID")
    private int OwnerID;
    
    @Column(name = "Name")
    private String Name;

    @Column(name = "ParentID")
    private int ParentID;

    @Column(name = "Deleted")
    private boolean Deleted;

    public int getDataId() {
        return DataId;
    }

    public void setDataId(int dataId) {
        DataId = dataId;
    }

    public int getOwnerID() {
        return OwnerID;
    }

    public void setOwnerID(int ownerID) {
        OwnerID = ownerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getParentID() {
        return ParentID;
    }

    public void setParentID(int parentID) {
        ParentID = parentID;
    }

    public boolean isDeleted() {
        return Deleted;
    }

    public void setDeleted(boolean deleted) {
        Deleted = deleted;
    }

    public DBEntity(int dataId, int ownerID, String name, int parentID, boolean deleted) {
        DataId = dataId;
        OwnerID = ownerID;
        Name = name;
        ParentID = parentID;
        Deleted = deleted;
    }

    public DBEntity() {
    }

    
}
