package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock.dao.model.sys.SysLog;
import com.stock.dao.model.sys.SysLogWithBLOBs;
import com.stock.pojo.vo.RequestResultVO;

public interface SysLogService {

	public List<SysLog> getLogs(String keys);

	public Map<String, Object>getLogsByPage(String keys,Integer pageSize,Integer pageIndex);


}


