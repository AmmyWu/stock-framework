package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock.dao.model.sys.SysMessage;
import com.stock.pojo.vo.RequestResultVO;

public interface SysMessageService {

	public List<SysMessage> getMessages(String text) ;

	public List<SysMessage> getMessages();

	public Map<String,Object> getMessages(String keys,Integer pageSize,Integer pageIndex);

	public boolean insert(SysMessage message);

	public boolean delete(Integer rid);

	public boolean deleteMessages(String messagesIds);

	public boolean updateReadNum(Integer messageId,Integer readNum);
}


