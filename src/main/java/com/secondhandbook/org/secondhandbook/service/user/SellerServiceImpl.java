package com.secondhandbook.org.secondhandbook.service.user;

import com.secondhandbook.org.secondhandbook.domain.user.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.secondhandbook.org.secondhandbook.repository.user.SellerRepository;

import java.util.List;
import java.util.Map;

@Service("UserSellerServiceImpl")
public class SellerServiceImpl implements SellerService
{
    private static SellerServiceImpl service = null;
    private Map<String,Seller > userSeller;

    public static SellerServiceImpl getRepository()
    {
        if(service == null) service = new SellerServiceImpl();
        return service;
    }

    @Autowired
    SellerRepository SellerRepository;

    @Override
    public List<Seller> getAll()
    {
        return this.SellerRepository.findAll();
    }

    @Override
    public Seller create(Seller seller)
    {
        this.userSeller.put(seller.getName(),seller);
        this.userSeller.put(seller.getSurname(),seller);
        this.userSeller.put(seller.getStudentNo(),seller);
        return seller;
    }

    @Override
    public Seller update(Seller seller)
    {
        this.userSeller.replace(seller.getName(),seller);
        this.userSeller.replace(seller.getSurname(),seller);
        this.userSeller.replace(seller.getStudentNo(),seller);
        return seller;
    }

    @Override
    public void delete(Seller id)
    {
        this.userSeller.remove(id);
    }

    @Override
    public Seller read(Seller id)
    {
        this.userSeller.get(id);
        return id;
    }
}
