package com.stock.pojo.vo.sys;

import com.stock.dao.model.sys.SysAttachment;
import com.stock.pojo.vo.BaseModelVO;

public class SysAttachmentVO extends SysAttachment {

	private BaseModelVO baseModel;

	public BaseModelVO getBaseModel() {
		return baseModel;
	}
	public void setBaseModel(BaseModelVO baseModel) {
		this.baseModel = baseModel;
	}
}