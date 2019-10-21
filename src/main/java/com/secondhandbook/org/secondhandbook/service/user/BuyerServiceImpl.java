package com.secondhandbook.org.secondhandbook.service.user;

import com.secondhandbook.org.secondhandbook.domain.user.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.secondhandbook.org.secondhandbook.repository.user.BuyerRepository;

import java.util.List;
import java.util.Map;

@Service("UserBuyerServiceImpl")
public class BuyerServiceImpl implements BuyerService
{
    private static BuyerServiceImpl service = null;
    private Map<String,Buyer > buyerMap;

    public static BuyerServiceImpl getRepository()
    {
        if(service == null) service = new BuyerServiceImpl();
        return service;
    }

    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    BuyerRepository buyerRepository;

    @Override
    public Buyer create(Buyer buyer)
    {
        this.buyerMap.put(buyer.getName(),buyer);
        this.buyerMap.put(buyer.getSurname(),buyer);
        this.buyerMap.put(buyer.getStudentNo(),buyer);
        return buyer;
    }

    @Override
    public Buyer update(Buyer buyer)
    {
        this.buyerMap.replace(buyer.getName(),buyer);
        this.buyerMap.replace(buyer.getSurname(),buyer);
        this.buyerMap.replace(buyer.getStudentNo(),buyer);
        this.buyerMap.replace(buyer.toString(),buyer);
        return buyer;
    }

    @Override
    public void delete(Buyer buyer)
    {
        this.buyerMap.remove(buyer);

    }

    @Override
    public Buyer read(Buyer buyer)
    {
        this.buyerMap.get(buyer);
        return buyer;
    }

    @Override
    public List<Buyer> getAll()
    {
        return this.buyerRepository.findAll();
    }

}
