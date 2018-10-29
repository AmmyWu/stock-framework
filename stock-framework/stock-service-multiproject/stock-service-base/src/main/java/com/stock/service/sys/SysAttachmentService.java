package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock.dao.model.sys.SysAttachment;
import com.stock.pojo.vo.RequestResultVO;

public interface SysAttachmentService {

	/**
	 * 添加返回主键
	 * @param attachment
	 * @return
	 */
	public SysAttachment insertReturnId(SysAttachment attachment);
	/**
	 * 根据主键获取
	 * @param id
	 * @return
	 */
	public SysAttachment getById(int id);

	/**
	 * 根据主键更新
	 * @param sysAttachment
	 * @return
	 */
	public int update(SysAttachment sysAttachment);

	/**
	 * 根据SysAttachment里面查询条件得到附件的HTML
	 * @param sysAttachment
	 * @param type
	 * @return
	 */
	public String getAttachmentHTML(SysAttachment sysAttachment,String type);
}



