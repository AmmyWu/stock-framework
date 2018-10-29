package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock.dao.model.sys.SysUserRole;
import com.stock.pojo.vo.RequestResultVO;
import com.stock.pojo.vo.sys.SysRoleVO;

public interface SysUserRoleService {


	Map<String,Object> getUserRoleVOMap(Integer userId);

	List<SysUserRole> getUserRoleList(Integer userId);

	List<SysRoleVO> getUserRoleVOList(Integer userId);

	boolean insert(String userId,String roleId);

	boolean delete(String userId,String roleId);

	/**
	 * 返回指定userId已分配的角色名称
	 * @param userId
	 * @return
	 */
	public String getRoleNames(Integer userId);

	public boolean isExistRoleUser(Integer userId,Integer roleId);

	public boolean isExistUsers(Integer roleId);

	public boolean isExistUsers(List<Integer> rolesIds);

	public boolean insert(SysUserRole usersRoles);

	public boolean delete(String ids);

	public boolean updata(SysUserRole usersRoles);
}


