package com.chinasoft.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.dao.RoleDao;
import com.chinasoft.model.Role;
import com.chinasoft.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	public RoleDao roleDao = null;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public int createRole(Role role) {
		Role r = role;
		int i = 0;
		i = roleDao.createRole(r);
		return i;
	}

	@Override
	public int getRoleByName(String name) {
		return roleDao.getRoleByName(name);
	}

	@Override
	public Role updateRole(Role role) {
		return roleDao.updateRole(role);
	}

	@Override
	public Role getRoleByID(long id) {
		return roleDao.getRoleByID(id);
	}

	@Override
	public Role findRoles(String name) {
		return roleDao.findRoles(name);
	}


	

}
