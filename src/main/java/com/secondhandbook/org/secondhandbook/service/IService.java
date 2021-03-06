package com.secondhandbook.org.secondhandbook.service;

public interface IService<Real,sort>
{
    Real create(Real type);
    Real update(Real type);
    void delete(Real id);
    Real read(Real id);
}
