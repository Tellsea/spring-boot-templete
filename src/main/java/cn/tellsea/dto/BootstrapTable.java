package cn.tellsea.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回给前端的bootstrap-table的数据，格式是固定的，且最终返回值必须是json格式
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BootstrapTable {

    private Integer total; // 总条数

    private Object rows; // 返回的数据List
}