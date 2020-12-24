package com.cube.core.domain.repository;

import com.cube.core.infrastructure.po.MenuDO;

import java.util.List;

/**
 * @author LMZ
 */
public interface IMenuRepository {

    /**
     * 保存菜单
     * @param menuDO
     */
    void save(MenuDO menuDO);

    /**
     * 查询菜单
     * @param menuDO
     * @return
     */
    List<MenuDO> query(MenuDO menuDO);

    /**
     * 主键查询
     * @param id
     * @return
     */
    MenuDO query(String id);
}
