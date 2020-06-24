package com.jiangsl.qxglxt.common; /*
 * @Description TODO
 * @Author jiangsl
 * @Date 2020/6/24 8:05
 */

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseBean implements Serializable {

    private Long id;
    private String createBy;
    private String createTime;
    private String lastUpdateBy;
    private String lastUpdateTime;
    private Integer delFlag;

}
