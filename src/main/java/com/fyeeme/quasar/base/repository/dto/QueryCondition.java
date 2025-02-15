package com.fyeeme.quasar.base.repository.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
public class QueryCondition implements Serializable {
    @Serial
    private static final long serialVersionUID = -2662365981651296053L;
    private Integer page = 0;
    private Integer pageSize = 10;
    private List<SortOrder> sortOrders;

    private List<FieldCondition> andConditions;
    private List<FieldCondition> orConditions;
    private List<JoinFieldCondition> joinConditions;

    public Integer getPage() {
        return page > 1 ? page - 1 : 0;
    }

    /**
     * 分页排序
     */
    @Data
    public static class SortOrder {
        private String field;
        private Boolean ascending;
    }
}
