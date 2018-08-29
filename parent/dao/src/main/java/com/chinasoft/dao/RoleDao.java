package com.chinasoft.dao;

import org.springframework.stereotype.Repository;

import com.chinasoft.model.Role;

@Repository("roleDao")
public interface RoleDao {

	public int createRole(Role role);
	
	public int getRoleByName(String name);
	
	public Role updateRole(Role role);
	
	public Role getRoleByID(long id);
	
	public Role findRoles(String name);
	
}
