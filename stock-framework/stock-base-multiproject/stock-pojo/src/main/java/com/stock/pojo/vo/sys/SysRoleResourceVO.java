package com.stock.pojo.vo.sys;

import com.stock.dao.model.sys.SysRoleResource;
import com.stock.pojo.vo.BaseModelVO;

public class SysRoleResourceVO extends SysRoleResource {

	private BaseModelVO baseModel;

	public BaseModelVO getBaseModel() {
		return baseModel;
	}
	public void setBaseModel(BaseModelVO baseModel) {
		this.baseModel = baseModel;
	}
}