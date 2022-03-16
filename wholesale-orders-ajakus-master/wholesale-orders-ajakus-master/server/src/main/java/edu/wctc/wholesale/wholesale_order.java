package edu.wctc.wholesale;

import lombok.*;


import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@NoArgsConstructor
@Entity
@Table(name = "wholesale_order")
public class wholesale_order {
    @Id
    @Column(name = "order_id")
    private int order_id;
    @Column(name = "purchase_order_num")
    private String purchase_order_num;
    @Column(name = "terms")
    private String terms;
    @Column(name = "purchase_date")
    private int purchase_date;
    @Column(name = "shipped_date")
    private LocalDateTime shipped_date;



    @ManyToOne
    @JoinColumn(name = "customer_id")
    private customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private product Product;

    public product getProduct() {
        return Product;
    }

    public void setProduct(product Product) {
        this.Product = Product;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }
}
