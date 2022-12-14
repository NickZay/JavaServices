package ru.nickzay.dataservice.count;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "counts")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter(AccessLevel.NONE)
    private Long id;

    private String name;
    private Long count;
}
