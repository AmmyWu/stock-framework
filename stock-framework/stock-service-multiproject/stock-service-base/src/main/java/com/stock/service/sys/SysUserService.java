package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock.dao.model.sys.SysUser;
import com.stock.pojo.vo.RequestResultVO;

public interface SysUserService {

	public boolean deleteByUserDetailId(List<Integer> userDetailIds,List<String> types);

	public SysUser getUsers(Integer userId);

	public Map<String,Object> getUserVO(String keys,Integer pageSize,Integer pageIndex);

	public List<SysUser> getUsers();

	public List<SysUser> getUsers(String type);

	public boolean isExistUsers(Integer roleId);

	public boolean insert(SysUser user);

	public boolean delete(String ids);

	public boolean update(SysUser user);

	void init_USERMAP();

	boolean setUsernameByEmployeeId(String username, Integer employeeId);

	List<Integer> getUserDetailIdList(String type);
}


