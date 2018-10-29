package com.stock.pojo.vo.sys;

import com.stock.dao.model.sys.SysLoginLog;
import com.stock.pojo.vo.BaseModelVO;

public class SysLoginLogVO extends SysLoginLog {

	private BaseModelVO baseModel;

	public BaseModelVO getBaseModel() {
		return baseModel;
	}
	public void setBaseModel(BaseModelVO baseModel) {
		this.baseModel = baseModel;
	}
}