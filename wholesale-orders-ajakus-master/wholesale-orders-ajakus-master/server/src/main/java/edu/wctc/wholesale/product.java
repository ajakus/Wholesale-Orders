package edu.wctc.wholesale;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "product")
public class product {
    @Id
    @Column(name = "product_id")
    private int product_id;
    @Column(name = "name")
    private String name;
    @Column(name = "cost")
    private double cost;
}
