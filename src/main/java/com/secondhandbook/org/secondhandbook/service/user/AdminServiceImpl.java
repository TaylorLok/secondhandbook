package com.secondhandbook.org.secondhandbook.service.user;

import com.secondhandbook.org.secondhandbook.domain.user.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.secondhandbook.org.secondhandbook.repository.user.AdminRepository;

import java.util.List;
import java.util.Map;

@Service(value = "AdminServiceImpl")
public class AdminServiceImpl implements AdminService {
    private static AdminServiceImpl service = null;
    private Map<String, Admin> adminMap;

    public static AdminServiceImpl getRepository() {
        if (service == null) service = new AdminServiceImpl();
        return service;

    }

    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    AdminRepository adminRepository;

    public Admin create(Admin admin) {
        this.adminMap.put(admin.getName(), admin);
        this.adminMap.put(admin.getSurname(), admin);
        this.adminMap.put(admin.getId(), admin);
        return admin;
    }


    public Admin update(Admin admin) {
        this.adminMap.replace(admin.getName(), admin);
        this.adminMap.replace(admin.getSurname(), admin);
        this.adminMap.replace(admin.getId(), admin);
        return admin;
    }

    @Override
    public void delete(Admin admin) {
        this.adminMap.remove(admin);
    }

    @Override
    public Admin read(Admin admin) {
        this.adminMap.get(admin);
        return admin;
    }

    public List<Admin> getAll() {

        return this.adminRepository.findAll();
    }
}