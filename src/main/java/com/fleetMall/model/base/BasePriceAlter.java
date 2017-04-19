package com.fleetMall.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePriceAlter<M extends BasePriceAlter<M>> extends Model<M> implements IBean {

	public M setUuid(java.lang.String uuid) {
		set("uuid", uuid);
		return (M)this;
	}

	public java.lang.String getUuid() {
		return get("uuid");
	}

	public M setAlterDate(java.lang.String alterDate) {
		set("alter_date", alterDate);
		return (M)this;
	}

	public java.lang.String getAlterDate() {
		return get("alter_date");
	}

	public M setAlterMoney(java.lang.String alterMoney) {
		set("alter_money", alterMoney);
		return (M)this;
	}

	public java.lang.String getAlterMoney() {
		return get("alter_money");
	}

	public M setCommodityUuid(java.lang.String commodityUuid) {
		set("commodity_uuid", commodityUuid);
		return (M)this;
	}

	public java.lang.String getCommodityUuid() {
		return get("commodity_uuid");
	}

	public M setIsDelete(java.lang.Integer isDelete) {
		set("isDelete", isDelete);
		return (M)this;
	}

	public java.lang.Integer getIsDelete() {
		return get("isDelete");
	}

}
