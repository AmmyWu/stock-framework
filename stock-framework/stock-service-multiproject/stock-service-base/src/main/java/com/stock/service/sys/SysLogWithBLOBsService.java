package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock.dao.model.sys.SysLogWithBLOBs;
import com.stock.pojo.vo.RequestResultVO;

public interface SysLogWithBLOBsService {

	public RequestResultVO insert(SysLogWithBLOBs  SysLogWithBLOBs);

	public RequestResultVO update(SysLogWithBLOBs  SysLogWithBLOBs);

	public RequestResultVO delete(List<Integer> nulls);

    public Map<String,Object> getByPage(String keys, Integer pageSize,Integer pageNow);

    }


