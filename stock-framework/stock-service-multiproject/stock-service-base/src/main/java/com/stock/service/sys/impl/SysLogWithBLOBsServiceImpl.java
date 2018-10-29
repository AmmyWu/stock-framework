package com.stock.service.sys.impl;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.stock.dao.model.sys.SysLog;
import com.stock.dao.model.sys.SysLogExample;
import com.stock.dao.model.sys.SysLogWithBLOBs;
import com.stock.pojo.vo.sys.SysLogWithBLOBsVO;
import com.stock.service.common.DataAuthorizeService;
import com.stock.service.sys.SysLogWithBLOBsService;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.common.exceptions.BizException;
import com.stock.common.tool.log.ErrorLoggers;
import com.stock.common.tool.log.LogUtil;
import com.stock.dao.page.Page;
import com.stock.service.common.util.DateJsonValueProcessor;
import com.stock.service.sys.utils.HttpResponseConstants.Public;
import com.stock.pojo.vo.RequestResultVO;
import com.stock.service.sys.utils.ResultBuilder;
import com.stock.service.sys.CommonService;
import com.stock.dao.mapper.sys.SysLogMapper;

@Service
public class SysLogWithBLOBsServiceImpl implements SysLogWithBLOBsService {

    @Autowired
    private SysLogMapper SysLogMapper;

    @Autowired
    private DataAuthorizeService dataAuthorizeService;

    private CommonService<SysLogWithBLOBs, SysLogMapper, SysLogExample> commonService;
    //注入commonService
    @Resource(name = "commonService")
    public void setCommonService(CommonService<SysLogWithBLOBs, SysLogMapper, SysLogExample> commonService) {
        this.commonService = commonService;
    }

    @Override
    public RequestResultVO insert(SysLogWithBLOBs SysLogWithBLOBs) {
        if(SysLogWithBLOBs == null){
            throw new BizException(Public.ERROR_700);
        }
        dataAuthorizeService.addDataAuthorizeInfo(SysLogWithBLOBs, "insert");
        SysLogMapper.insert(SysLogWithBLOBs);
        return ResultBuilder.buildSuccessResult(Public.SUCCESS_200, "");
    }

    @Override
    public RequestResultVO update(SysLogWithBLOBs SysLogWithBLOBs) {
        if(SysLogWithBLOBs == null || SysLogWithBLOBs.getLogId() == null){
            throw new BizException(Public.ERROR_700);
        }
        dataAuthorizeService.addDataAuthorizeInfo(SysLogWithBLOBs, "update");
        SysLogMapper.updateByPrimaryKeySelective(SysLogWithBLOBs);
        return ResultBuilder.buildSuccessResult(Public.SUCCESS_300, "");
    }

    @Override
    public RequestResultVO delete(List<Integer> nulls) {
        if(nulls == null || nulls.size() == 0){
            throw new BizException(Public.ERROR_700);
        }
        SysLogExample SysLogExample = new SysLogExample();
        SysLogExample.createCriteria().andLogIdIn(nulls);
        SysLogMapper.deleteByExample(SysLogExample);
        return ResultBuilder.buildSuccessResult(Public.SUCCESS_400, "");
    }

    @Override
    public Map<String, Object> getByPage(String keys, Integer pageSize,
                                         Integer pageNow) {
        SysLogExample SysLogExample = new SysLogExample();
        this.setCriteria(keys, SysLogExample);
        int totalrecords = SysLogMapper.countByExample(SysLogExample);

        Page page = new Page();
        page.setBegin(pageNow);
        page.setLength(pageSize);
        SysLogExample.setOrderByClause("null desc");
        SysLogExample.setPage(page);
        List<SysLog> SysLogWithBLOBs = SysLogMapper.selectByExample(SysLogExample);

        Map<String, Object> map = new HashMap<String, Object>();
        JsonConfig config = new JsonConfig();
        config.setIgnoreDefaultExcludes(false);
        config.registerJsonValueProcessor(Date.class,new DateJsonValueProcessor("yyyy-MM-dd"));
        try {
            map.put("aaData", JSONArray.fromObject(this.creatVos(SysLogWithBLOBs), config));
        } catch (Exception e) {
            LogUtil.error(ErrorLoggers.ERROR_LOGGER, e.getMessage());
            throw new BizException(Public.ERROR_100);
        }
        map.put("recordsTotal", totalrecords);
        map.put("recordsFiltered", totalrecords);

        return map;
    }
    private void setCriteria(String keys, SysLogExample SysLogExample) {
        if (keys == null || "{}".equals(keys))
            return;
        //JSONObject jKeys = JSONObject.fromObject(keys);
        //Criteria criteria = SysLogExample.createCriteria();

    }
    private List<SysLogWithBLOBsVO> creatVos(List<SysLog> SysLogWithBLOBss) throws Exception{
        List<SysLogWithBLOBsVO> SysLogWithBLOBsVOs = new ArrayList<SysLogWithBLOBsVO>();
        for(SysLog SysLogWithBLOBs : SysLogWithBLOBss){
            SysLogWithBLOBsVO SysLogWithBLOBsVO = new SysLogWithBLOBsVO();
            BeanUtils.copyProperties(SysLogWithBLOBs, SysLogWithBLOBsVO);
            commonService.addBaseModel(SysLogWithBLOBs, SysLogWithBLOBsVO);
            SysLogWithBLOBsVOs.add(SysLogWithBLOBsVO);
        }
        return SysLogWithBLOBsVOs;
    }
}




