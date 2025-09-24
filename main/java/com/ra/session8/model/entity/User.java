package com.ra.session8.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private boolean status;
    @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
    //neu khong dung @join table thi hibernate tu tao ban trung gian
    //Set :khong cho phep phan tu trung lap,khong quan tam den thu tu
    //nghia la moi user co nhieu role,nhung moi role chi xuat hien mot lan
    private Set<Role> roles;

}
