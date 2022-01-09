package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    // pk
    private Long id;

    private String name;

    @Embedded
    // 내장 타입 (embedable, embedded 둘 중에 하나만 있어도 된다)
    private Address address;


    @OneToMany(mappedBy = "member")
    // 나는 저거에 의해서 정의되는 거울일 뿐, 여기서 업데이트를 쳐도 저기에는 업데이트가 안된다.
    private List<Order> orders = new ArrayList<>();





}
