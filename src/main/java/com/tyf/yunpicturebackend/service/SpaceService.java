package com.tyf.yunpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyf.yunpicturebackend.model.dto.space.SpaceAddRequest;
import com.tyf.yunpicturebackend.model.dto.space.SpaceQueryRequest;
import com.tyf.yunpicturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyf.yunpicturebackend.model.entity.User;
import com.tyf.yunpicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author tangyunfei
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-02-22 13:10:05
*/
public interface SpaceService extends IService<Space> {


    /**
     * 创建空间
     * @param spaceAddRequest
     * @param loginUser
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 校验空间
     *
     * @param space
     */
    void validSpace(Space space, boolean add);



    /**
     * 将查询请求转为QueryWrapper对象
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);


    /**
     * 获取空间包装类（单条）
     * @param space
     * @param request
     * @return
     */
    public SpaceVO getSpaceVO(Space space, HttpServletRequest request);


    /**
     * 获取空间包装类（分页）
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    void fillSpaceBySpaceLevel(Space space);
}
