package com.mmall.vo;

import java.math.BigDecimal;
import java.util.List;

public class OrderProductVo {
    private List<OrderItemVo> orderItemVoList;
    private BigDecimal productToTalPrice;
    private String imagesHost;

    public List<OrderItemVo> getOrderItemVoList() {
        return orderItemVoList;
    }

    public void setOrderItemVoList(List<OrderItemVo> orderItemVoList) {
        this.orderItemVoList = orderItemVoList;
    }

    public BigDecimal getProductToTalPrice() {
        return productToTalPrice;
    }

    public void setProductToTalPrice(BigDecimal productToTalPrice) {
        this.productToTalPrice = productToTalPrice;
    }

    public String getImagesHost() {
        return imagesHost;
    }

    public void setImagesHost(String imagesHost) {
        this.imagesHost = imagesHost;
    }
}
