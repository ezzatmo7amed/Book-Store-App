package com.project.logger.base.model;


import jakarta.persistence.*;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseModel <ID extends Number> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
    private Integer statusCode;
    @Column(updatable = false)
    private LocalDate createdDate;
    @Column(updatable = false)
    private String createdUser;

    private LocalDate modifiedDate;

    private String modifiedUser;

}
