package com.czy.bean;

/*
 * 已经购买的商品
 */
public class AlreadyBuy {

	// 主键
	private int aid;
	// 用户id
	private int usid;
	// 商品id
	private int gid;
	// 购买的商品数量
	private int number;
	// 购买时间
	private String buyTime;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getUsid() {
		return usid;
	}

	public void setUsid(int usid) {
		this.usid = usid;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}

}
