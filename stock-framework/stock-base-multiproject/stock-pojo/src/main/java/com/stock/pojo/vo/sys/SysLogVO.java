package com.stock.pojo.vo.sys;

import com.stock.dao.model.sys.SysLog;
import com.stock.pojo.vo.BaseModelVO;

public class SysLogVO extends SysLog {

	private BaseModelVO baseModel;

	public BaseModelVO getBaseModel() {
		return baseModel;
	}
	public void setBaseModel(BaseModelVO baseModel) {
		this.baseModel = baseModel;
	}
}