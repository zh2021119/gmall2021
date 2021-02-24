package com.tt.gmall.service;

import com.tt.gmall.bean.PmsBaseCatalog1;
import com.tt.gmall.bean.PmsBaseCatalog2;
import com.tt.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    //一级分类
    public List<PmsBaseCatalog1> getCatalog1();

    //二级分离
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    //三级分类
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
