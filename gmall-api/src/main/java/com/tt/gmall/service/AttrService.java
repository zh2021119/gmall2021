package com.tt.gmall.service;

import com.tt.gmall.bean.PmsBaseAttrInfo;
import com.tt.gmall.bean.PmsBaseAttrValue;

import java.util.List;

public interface AttrService {

    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    public String insertAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    public List<PmsBaseAttrValue> getAttrValueList(String attrId);

}
