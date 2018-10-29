package com.stock.pojo.vo.sys;


import com.stock.dao.model.sys.SysLogWithBLOBs;
import com.stock.pojo.vo.BaseModelVO;

public class SysLogWithBLOBsVO extends SysLogWithBLOBs {

	private BaseModelVO baseModel;

	public BaseModelVO getBaseModel() {
		return baseModel;
	}
	public void setBaseModel(BaseModelVO baseModel) {
		this.baseModel = baseModel;
	}
}