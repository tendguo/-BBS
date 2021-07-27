
package com.serviceImpl;

import com.dao.BaseDao;
import com.orm.Admin;
import com.service.IAdminService;
import javax.annotation.Resource;

public class AdminServiceImpl implements IAdminService {
    @Resource(name="dao")
    BaseDao dao;
    @Override
    public Admin loadAdmin(int id) {
        return (Admin)dao.loadById(Admin.class, id);
    }
     
}
