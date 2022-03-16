package edu.wctc.wholesale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    wholesale_order_service Wholesale_order_service;

    @GetMapping("/api/orders/")
    public List<wholesale_order> getwholesale_orderList() {
        List<wholesale_order> list = new ArrayList<>();
        Wholesale_order_service.getAllOrders();
        return list;
    }


}
