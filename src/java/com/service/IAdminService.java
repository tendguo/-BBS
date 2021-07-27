
package com.service;

import com.orm.Admin;

public interface  IAdminService {
    
    //获取管理员
    public Admin loadAdmin(int id);
}
