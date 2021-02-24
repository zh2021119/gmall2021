package com.tt.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tt.gmall.bean.PmsBaseSaleAttr;
import com.tt.gmall.bean.PmsProductInfo;
import com.tt.gmall.manage.mapper.PmsBaseSaleAttrMapper;
import com.tt.gmall.manage.mapper.PmsProductInfoMapper;
import com.tt.gmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;

    @Autowired
    private PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(catalog3Id);
        List<PmsProductInfo> pmsProductInfos = pmsProductInfoMapper.select(pmsProductInfo);
        return pmsProductInfos;
    }

    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        return pmsBaseSaleAttrMapper.selectAll();
    }

}
