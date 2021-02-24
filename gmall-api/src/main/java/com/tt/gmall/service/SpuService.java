package com.tt.gmall.service;

import com.tt.gmall.bean.PmsBaseSaleAttr;
import com.tt.gmall.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {

    public List<PmsProductInfo> spuList(String catalog3Id);

    public List<PmsBaseSaleAttr> baseSaleAttrList();
}
