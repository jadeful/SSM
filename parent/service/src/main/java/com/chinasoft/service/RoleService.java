package com.chinasoft.service;

import com.chinasoft.model.Role;

public interface RoleService {
	
	public int createRole(Role role);
	
	public int getRoleByName(String name);
	
	public Role updateRole(Role role);
	
	public Role getRoleByID(long id);
	
	public Role findRoles(String name);

}
