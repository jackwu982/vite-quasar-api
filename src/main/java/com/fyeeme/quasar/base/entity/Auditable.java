package com.fyeeme.quasar.base.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<T> extends BaseEntity {

    @CreatedBy
    protected T createdBy;
    @LastModifiedBy
    protected T modifiedBy;

    @CreatedDate
    protected Instant createdDate;
    @LastModifiedDate
    protected Instant modifiedDate;
}
