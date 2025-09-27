package com.ra.session9.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "seeds")
public class Seed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String seedName;
    private String quantity;
    @ManyToOne
    @JoinColumn(name = "category_id")//tao lien ket giua 2 bang bang khoa ngoai cua bang nay va khoa chinh cua bang kia
    private Category category;
}

