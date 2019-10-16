package com.secondhandbook.org.secondhandbook.service.user;

import com.secondhandbook.org.secondhandbook.domain.user.Admin;
import com.secondhandbook.org.secondhandbook.service.IService;

import java.util.List;

public interface AdminService extends IService<Admin,String>
{
    List<Admin> getAll();
}
