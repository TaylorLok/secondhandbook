package service.user;

import domain.user.Admin;
import service.IService;

import java.util.List;
import java.util.Set;

public interface AdminService extends IService<Admin,String>
{
    List<Admin> getAll();
}
