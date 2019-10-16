package com.secondhandbook.org.secondhandbook.controller.user;

import com.secondhandbook.org.secondhandbook.domain.ResponseObject;
import com.secondhandbook.org.secondhandbook.domain.user.Buyer;
import com.secondhandbook.org.secondhandbook.factory.ResponseObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.secondhandbook.org.secondhandbook.service.user.BuyerServiceImpl;


@RestController
@RequestMapping("/secondhandbook/Buyer")
public class BuyerController
{
    @Autowired
    BuyerServiceImpl buyerService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createBuyer(@RequestBody Buyer buyer) {
        System.out.println(buyer);
        ResponseObject responseObject = ResponseObjectFactory.buildGenericResponseObject(HttpStatus.OK.toString(), "New Buyer!");
        if (buyer.getName() == null || buyer.getSurname() == null || buyer.getStudentNo() == null) {
            responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObject.setResponseDescription("provide credentials");
        } else {
            Buyer savedBuyer = buyer;
            responseObject.setResponse(savedBuyer);

            if (buyer != null) {
                buyerService.create(buyer);
                buyerService.update(savedBuyer);
                buyerService.read(savedBuyer);
                buyerService.delete(savedBuyer);
                buyerService.getAll();

            } else {
                responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
                String message = buyer == null ? "buyer not found|" : "";
                responseObject.setResponseDescription(message);
            }

        }
        return ResponseEntity.ok(responseObject);
    }
}
