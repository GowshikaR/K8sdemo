package com.example.demo.bean;

public class DeliveryCountDTO {
    private Integer deliveryId;
    private Integer count;
    public DeliveryCountDTO(Integer deliveryId, Integer count) {
        this.deliveryId = deliveryId;
        this.count = count;
    }
    // getters and setters ...
	public Integer getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
