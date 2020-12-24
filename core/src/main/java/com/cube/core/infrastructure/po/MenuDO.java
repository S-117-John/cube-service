package com.cube.core.infrastructure.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "sys_menu")
public class MenuDO {

    @Id
    private String id;
    private String parentId;
    private String parentIds;
    private String name;
    private int sort;
    private String href;
    private String target;
    private String icon;
    private boolean visible;
    private String permission;


}
