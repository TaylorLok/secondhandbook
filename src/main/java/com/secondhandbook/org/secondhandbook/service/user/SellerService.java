package com.secondhandbook.org.secondhandbook.service.user;

import com.secondhandbook.org.secondhandbook.domain.user.Seller;
import com.secondhandbook.org.secondhandbook.service.IService;

import java.util.List;

public interface SellerService extends IService<Seller,String>
{
    List<Seller>getAll();
}
