package com.tt.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tt.gmall.bean.PmsBaseSaleAttr;
import com.tt.gmall.bean.PmsProductInfo;
import com.tt.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {

    @Reference
    private SpuService spuService;

    @RequestMapping(path = "spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){
        List<PmsProductInfo> pmsProductInfos = spuService.spuList(catalog3Id);
        return pmsProductInfos;
    }

    @RequestMapping(path = "baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList(){
        List<PmsBaseSaleAttr> pmsBaseSaleAttrs = spuService.baseSaleAttrList();
        return pmsBaseSaleAttrs;
    }

    @RequestMapping(path = "fileUpload")
    @ResponseBody
    //MultipartFile类用于接收前台的文件
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        return null;
    }

    @RequestMapping(path = "saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){

        return "success";
    }

}
