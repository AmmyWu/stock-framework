package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock.dao.model.sys.SysResource;
import com.stock.pojo.vo.RequestResultVO;
import com.stock.pojo.vo.sys.SysResourceVO;

public interface SysResourceService {


	public  List<SysResourceVO> listResource(List<String> types);

	public boolean getChildResource(String pid);

	public void init_RESOURCESTREE_UNINCLUDE_BUSINESS();

	public List<SysResource> getResource(List<String> types);

	public boolean insert(SysResource res);

	public boolean delete(SysResource res);

	public boolean delete(String id);

	public boolean update(SysResource res);

	public void init_RESOURCESTREE();
}


