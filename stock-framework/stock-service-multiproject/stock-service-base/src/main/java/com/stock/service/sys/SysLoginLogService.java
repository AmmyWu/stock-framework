package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock.dao.model.sys.SysLoginLog;
import com.stock.pojo.vo.RequestResultVO;

public interface SysLoginLogService {

	public List<SysLoginLog> getLogs(String keys);

	public Map<String, Object>getLogsByPage(String keys,Integer pageSize,Integer pageIndex);

	void insert(SysLoginLog loginLog);


}


