package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> pizzas;
    public ProduitService(){
        this.pizzas = new ArrayList<>();
    }
    @Override
     public boolean create(Produit o){return pizzas.add(o);}
    @Override
    public boolean update(Produit o){return false;}
    @Override
    public boolean delete(Produit o){return pizzas.remove(o);}
    @Override
    public Produit findById(int id){
        for (Produit p: pizzas)
            if (id==p.getId())
                return p;
        return null;
    }
    @Override
    public List<Produit> findAll(){return pizzas;}

}
