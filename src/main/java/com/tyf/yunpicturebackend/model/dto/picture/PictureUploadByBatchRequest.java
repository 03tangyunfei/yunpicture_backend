package com.tyf.yunpicturebackend.model.dto.picture;

import lombok.Data;

/**
 * 批量导入图片请求
 */
@Data
public class PictureUploadByBatchRequest {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 名称前缀
     */
    private String namePrefix;

    /**
     * 抓取数量
     */
    private Integer count = 10;
}

