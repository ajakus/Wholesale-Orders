package edu.wctc.wholesale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class wholesale_order_service {
    @Autowired
    private wholesale_order_repository Wholesale_order_repository;

    public List<wholesale_order> getAllOrders(){
        List<wholesale_order> list = new ArrayList<>();
                Wholesale_order_repository.findAll().forEach(list::add);
        return list;
    }


}
