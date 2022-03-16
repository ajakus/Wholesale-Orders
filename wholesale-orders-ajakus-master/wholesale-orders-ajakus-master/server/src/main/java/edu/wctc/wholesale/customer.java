package edu.wctc.wholesale;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class customer {
    @Id
    @Column(name = "customer_id")
    private int customer_id;
    @Column(name = "name")
    private String name;
}
