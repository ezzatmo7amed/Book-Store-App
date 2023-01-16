package com.project.logger.model.usermanagement;

import com.project.logger.base.model.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "sec_users")
public class User extends BaseModel<Long> {
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
}
