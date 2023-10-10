package com.example.dbconn.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "DTreeCore")
public class DBEntity {

    @Column(name = "OwnerID")
    private long OwnerId;

    @Column(name = "OwnerID")
    private String OwnerID;
    
    @Column(name = "Name")
    private String Name;

    @Column(name = "ParentID")
    private int ParentID;

    @Column(name = "Deleted")
    private boolean Deleted;

    public long getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(long ownerId) {
        OwnerId = ownerId;
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

    public DBEntity(long ownerId, String ownerID2, String name, int parentID, boolean deleted) {
        OwnerId = ownerId;
        OwnerID = ownerID2;
        Name = name;
        ParentID = parentID;
        Deleted = deleted;
    }

    public DBEntity() {
    }


    
}
