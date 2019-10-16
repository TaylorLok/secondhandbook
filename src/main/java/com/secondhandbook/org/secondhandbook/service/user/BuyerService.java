package com.secondhandbook.org.secondhandbook.service.user;

import com.secondhandbook.org.secondhandbook.domain.user.Buyer;
import com.secondhandbook.org.secondhandbook.service.IService;

import java.util.List;

public interface BuyerService extends IService<Buyer,String>
{
    List<Buyer> getAll();
}
