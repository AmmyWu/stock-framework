package com.stock.pojo.vo.sys;

import com.stock.dao.model.sys.SysBasicDataSet;
import com.stock.pojo.vo.BaseModelVO;

public class SysBasicDataSetVO extends SysBasicDataSet {

	private BaseModelVO baseModel;

	public BaseModelVO getBaseModel() {
		return baseModel;
	}
	public void setBaseModel(BaseModelVO baseModel) {
		this.baseModel = baseModel;
	}
}