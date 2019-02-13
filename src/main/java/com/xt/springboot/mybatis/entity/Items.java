package com.xt.springboot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品定价
     */
    private Float price;

    /**
     * 商品图片
     */
    private String pic;

    /**
     * 生产日期
     */
    private Date createtime;

    /**
     * 商品描述
     */
    private String detail;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品定价
     *
     * @return price - 商品定价
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置商品定价
     *
     * @param price 商品定价
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取商品图片
     *
     * @return pic - 商品图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置商品图片
     *
     * @param pic 商品图片
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取生产日期
     *
     * @return createtime - 生产日期
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置生产日期
     *
     * @param createtime 生产日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取商品描述
     *
     * @return detail - 商品描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置商品描述
     *
     * @param detail 商品描述
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}