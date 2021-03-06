package com.fleetMall.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseStore<M extends BaseStore<M>> extends Model<M> implements IBean {

	public M setUuid(java.lang.String uuid) {
		set("uuid", uuid);
		return (M)this;
	}

	public java.lang.String getUuid() {
		return get("uuid");
	}

	public M setIsDelete(java.lang.Integer isDelete) {
		set("is_delete", isDelete);
		return (M)this;
	}

	public java.lang.Integer getIsDelete() {
		return get("is_delete");
	}

	public M setStoreName(java.lang.String storeName) {
		set("store_name", storeName);
		return (M)this;
	}

	public java.lang.String getStoreName() {
		return get("store_name");
	}

	public M setStoreOwnerName(java.lang.String storeOwnerName) {
		set("store_owner_name", storeOwnerName);
		return (M)this;
	}

	public java.lang.String getStoreOwnerName() {
		return get("store_owner_name");
	}

	public M setStoreOwnerTelephone(java.lang.String storeOwnerTelephone) {
		set("store_owner_telephone", storeOwnerTelephone);
		return (M)this;
	}

	public java.lang.String getStoreOwnerTelephone() {
		return get("store_owner_telephone");
	}

	public M setStorePositionX(java.lang.String storePositionX) {
		set("store_position_x", storePositionX);
		return (M)this;
	}

	public java.lang.String getStorePositionX() {
		return get("store_position_x");
	}

	public M setStorePositionY(java.lang.String storePositionY) {
		set("store_position_y", storePositionY);
		return (M)this;
	}

	public java.lang.String getStorePositionY() {
		return get("store_position_y");
	}

	public M setStoreAvatar(java.lang.String storeAvatar) {
		set("store_avatar", storeAvatar);
		return (M)this;
	}

	public java.lang.String getStoreAvatar() {
		return get("store_avatar");
	}

	public M setStoreIntroduce(java.lang.String storeIntroduce) {
		set("store_introduce", storeIntroduce);
		return (M)this;
	}

	public java.lang.String getStoreIntroduce() {
		return get("store_introduce");
	}

	public M setStoreLocation(java.lang.String storeLocation) {
		set("store_location", storeLocation);
		return (M)this;
	}

	public java.lang.String getStoreLocation() {
		return get("store_location");
	}

}
