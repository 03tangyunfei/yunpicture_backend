package com.tyf.yunpicturebackend.model.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SpaceLevel {

    /**
     * 值
     */
    private int value;

    /**
     * 文本
     */
    private String text;

    /**
     * 最大数量
     */
    private long maxCount;

    /**
     * 最大空间
     */
    private long maxSize;
}
