package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock
		.dao.model.sys.SysRole;

public interface SysRoleService {

	public List<SysRole> getRoles(String text) ;

	public List<SysRole> getRoles();
	public Map<String,Object> getRoles(String keys,Integer pageSize,Integer pageIndex);

	public boolean insert(SysRole res);

	public boolean delete(Integer rid);

	public boolean deleteRoles(String rolesIds);

	//	public boolean ddelete(Roles res);
//
//	public boolean updateAuth(SysRoles roles);
//
	public boolean update(SysRole roles);
}