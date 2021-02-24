package com.tt.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tt.gmall.bean.PmsBaseCatalog1;
import com.tt.gmall.bean.PmsBaseCatalog2;
import com.tt.gmall.bean.PmsBaseCatalog3;
import com.tt.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    //一级分类
    @RequestMapping(path = "getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> pmsBaseCatalog1s = catalogService.getCatalog1();
        return pmsBaseCatalog1s;
    }

    //二级分类
    @RequestMapping(path = "getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> pmsBaseCatalog2s = catalogService.getCatalog2(catalog1Id);
        return pmsBaseCatalog2s;
    }

    //三级分类
    @RequestMapping(path = "getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> pmsBaseCatalog3s = catalogService.getCatalog3(catalog2Id);
        return pmsBaseCatalog3s;
    }

}
