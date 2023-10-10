package com.example.dbconn.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "DTreeCore")
public class DBEntity {

    @Column(name = "DataID")
    private long DataId;

    @Column(name = "OwnerID")
    private String OwnerID;
    
    @Column(name = "Name")
    private String Name;

    @Column(name = "ParentID")
    private int ParentID;

    @Column(name = "Deleted")
    private boolean Deleted;

    public long getDataId() {
        return DataId;
    }

    public void setDataId(long dataId) {
        DataId = dataId;
    }

    public String getOwnerID() {
        return OwnerID;
    }

    public void setOwnerID(String ownerID) {
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

    public DBEntity(long dataId, String ownerID, String name, int parentID, boolean deleted) {
        DataId = dataId;
        OwnerID = ownerID;
        Name = name;
        ParentID = parentID;
        Deleted = deleted;
    }

    public DBEntity() {
    }

    
}
