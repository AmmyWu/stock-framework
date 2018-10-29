package com.stock.pojo.vo.sys;

import com.stock.dao.model.sys.SysOrganizationStructure;
import com.stock.pojo.vo.BaseModelVO;

public class SysOrganizationStructureVO extends SysOrganizationStructure {

	private BaseModelVO baseModel;

	public BaseModelVO getBaseModel() {
		return baseModel;
	}
	public void setBaseModel(BaseModelVO baseModel) {
		this.baseModel = baseModel;
	}
}