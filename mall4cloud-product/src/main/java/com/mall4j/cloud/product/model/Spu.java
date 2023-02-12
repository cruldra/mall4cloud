package com.mall4j.cloud.product.model;

import java.io.Serializable;

import com.mall4j.cloud.common.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品信息
 *
 * @author cruldra
 * @date 2023/2/13 0:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Spu extends BaseModel implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 品牌ID
     */
    private Long brandId;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 店铺分类ID
     */
    private Long shopCategoryId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * spu名称
     */
    private String name;

    /**
     * 卖点
     */
    private String sellingPoint;

    /**
     * 主图
     */
    private String mainImgUrl;

    /**
     * 商品图片 多个图片逗号分隔
     */
    private String imgUrls;

    /**
     * 商品视频
     */
    private String video;

    /**
     * 售价，整数方式保存
     */
    private Long priceFee;

    /**
     * 市场价，整数方式保存
     */
    private Long marketPriceFee;

    /**
     * 状态 1:enable, 0:disable, -1:deleted
     */
    private Integer status;

    private Integer hasSkuImg;

    /**
     * 序号
     */
    private Integer seq;
}
