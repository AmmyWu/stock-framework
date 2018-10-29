package com.stock.service.sys;

import java.util.List;
import java.util.Map;

import com.stock.dao.model.sys.SysAuthentication;
import com.stock.pojo.vo.RequestResultVO;

public interface SysAuthenticationService {

	Map<String,Object> getAuthenticationMap(Integer uId);

	public String updatePassword(String account,String password,String newPassword);

	public boolean isExistAccount(String account);

	public String resetPassword(String account);

	public List<SysAuthentication> getAuthenticationInfo(String account,String password,String type);

	public List<SysAuthentication> getAuthenticationInfo(String account,String password);

	public SysAuthentication getAuthenticationByAccount(String account);

	public List<SysAuthentication> getAuthenticationInfo(String uId);

	public boolean insert(SysAuthentication authInfo);

	public boolean delete(String ids);

	public boolean deleteByUserId(Integer uId);

	public boolean update(SysAuthentication authInfo);

    }


