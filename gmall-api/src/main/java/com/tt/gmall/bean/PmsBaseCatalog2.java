package com.tt.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class PmsBaseCatalog2 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String name;

    @Column
    private String catalog1Id;

    @Transient
    private List<PmsBaseCatalog1> catalog1s;

    @Transient
    private List<PmsBaseCatalog3> catalog3s;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(String catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    public List<PmsBaseCatalog1> getCatalog1s() {
        return catalog1s;
    }

    public void setCatalog1s(List<PmsBaseCatalog1> catalog1s) {
        this.catalog1s = catalog1s;
    }

    public List<PmsBaseCatalog3> getCatalog3s() {
        return catalog3s;
    }

    public void setCatalog3s(List<PmsBaseCatalog3> catalog3s) {
        this.catalog3s = catalog3s;
    }

    @Override
    public String toString() {
        return "PmsBaseCatalog2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", catalog1Id='" + catalog1Id + '\'' +
                ", catalog1s=" + catalog1s +
                ", catalog3s=" + catalog3s +
                '}';
    }

}
