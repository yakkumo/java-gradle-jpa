package com.comrades.app.domain.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table("airp_airplane")
public class Airplane {

    @Id
    @With
    @Column("airp_uuid_airplane")
    private UUID id;

    @NotNull
    @NotEmpty(message = "The name of this Airplane cannot be empty")
    @Column("airp_tx_code")
    private String code;

    @Column("airp_tx_model")
    private String model;

    @Column("airp_qt_passenger")
    private Integer passengerQuantity;

    @Column("airp_dt_register")
    private Date registerDate;

}
