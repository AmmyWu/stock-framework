package com.stock.pojo.vo.sys;

import com.stock.dao.model.sys.SysUserRole;
import com.stock.pojo.vo.BaseModelVO;

public class SysUserRoleVO extends SysUserRole {

	private BaseModelVO baseModel;

	public BaseModelVO getBaseModel() {
		return baseModel;
	}
	public void setBaseModel(BaseModelVO baseModel) {
		this.baseModel = baseModel;
	}
}