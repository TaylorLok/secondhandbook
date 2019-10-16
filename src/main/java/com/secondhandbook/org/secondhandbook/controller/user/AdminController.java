package com.secondhandbook.org.secondhandbook.controller.user;

import com.secondhandbook.org.secondhandbook.domain.ResponseObject;
import com.secondhandbook.org.secondhandbook.domain.user.Admin;
import com.secondhandbook.org.secondhandbook.factory.ResponseObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.secondhandbook.org.secondhandbook.service.user.AdminServiceImpl;

@RestController
@RequestMapping("/secondhandbook/admin")
public class AdminController
{
    @Autowired
    private AdminServiceImpl adminService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createAdmin(@RequestBody Admin admin)
    {
        System.out.println(admin);
        ResponseObject responseObject = ResponseObjectFactory.buildGenericResponseObject(HttpStatus.OK.toString(),"New admin created");
        if (admin.getName()==null || admin.getSurname()==null || admin.getId()==null)
        {
            responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObject.setResponseDescription("Please enter a name, last name or ID");
        } else
        {
            Admin savedAd = admin;
            responseObject.setResponse(savedAd);

            adminService.create(admin);
            adminService.update(savedAd);
            adminService.read(savedAd);
            adminService.delete(savedAd);
            adminService.getAll();
        }
        if (admin==null)
        {
            responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            String message = admin == null? "admin not found|":"";
            responseObject.setResponseDescription(message);
        }


        return ResponseEntity.ok(responseObject);

    }


}
