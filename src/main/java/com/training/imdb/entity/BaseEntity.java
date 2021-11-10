package com.training.imdb.entity;

import com.training.imdb.enums.Deleted;
import com.training.imdb.enums.Status;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass         //Using the MappedSuperclass strategy, inheritance is only evident in the class, but not the entity model.
@Data
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {
    @CreatedBy
    @Column(name="CREATED_BY", nullable=false,updatable = false)
    private String createdBy;

    @Column(name = "CREATED_DATE_TIME", nullable=false,updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    @LastModifiedBy
    @Column(name="MODIFIED_BY", nullable=false)
    private String modifiedBy;

    @Column(name = "MODIFIED_DATE_TIME", nullable=false)
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDateTime;

    @Column(name="IS_DELETED", nullable=false)
    @ColumnDefault("0")
    private Deleted isDeleted;

    @Column(name="STATUS", nullable=false)
    @ColumnDefault("1")
    private Status status;
}
