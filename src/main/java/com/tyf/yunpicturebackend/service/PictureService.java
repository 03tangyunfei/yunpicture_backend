package com.tyf.yunpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyf.yunpicturebackend.model.dto.picture.PictureQueryRequest;
import com.tyf.yunpicturebackend.model.dto.picture.PictureUploadRequest;
import com.tyf.yunpicturebackend.model.dto.user.UserQueryRequest;
import com.tyf.yunpicturebackend.model.entity.Picture;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyf.yunpicturebackend.model.entity.User;
import com.tyf.yunpicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @author tangyunfei
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-02-07 23:21:24
*/
public interface PictureService extends IService<Picture> {

    /**
     * 校验图片
     *
     * @param picture
     */
    void validPicture(Picture picture);

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);


    /**
     * 将查询请求转为QueryWrapper对象
     *
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);


    /**
     * 获取图片包装类（单条）
     * @param picture
     * @param request
     * @return
     */
    public PictureVO getPictureVO(Picture picture, HttpServletRequest request);


    /**
     * 获取图片包装类（分页）
     * @param picturePage
     * @param request
     * @return
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);


}
