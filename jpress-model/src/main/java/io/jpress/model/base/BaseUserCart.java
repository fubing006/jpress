package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserCart<M extends BaseUserCart<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 购买的用户
     */
	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

    /**
     * 购买的用户
     */
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

    /**
     * 商品的所属用户
     */
	public void setSellerId(java.lang.Long sellerId) {
		set("seller_id", sellerId);
	}

    /**
     * 商品的所属用户
     */
	public java.lang.Long getSellerId() {
		return getLong("seller_id");
	}

    /**
     * 分销用户
     */
	public void setDistUserId(java.lang.Long distUserId) {
		set("dist_user_id", distUserId);
	}

    /**
     * 分销用户
     */
	public java.lang.Long getDistUserId() {
		return getLong("dist_user_id");
	}

    /**
     * 商品的类别，默认是 product ，但是未来可能是 模板、文件、视频等等...
     */
	public void setProductTable(java.lang.String productTable) {
		set("product_table", productTable);
	}

    /**
     * 商品的类别，默认是 product ，但是未来可能是 模板、文件、视频等等...
     */
	public java.lang.String getProductTable() {
		return getStr("product_table");
	}

	public void setProductTableText(java.lang.String productTableText) {
		set("product_table_text", productTableText);
	}

	public java.lang.String getProductTableText() {
		return getStr("product_table_text");
	}

	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}

	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

    /**
     * 是否是虚拟产品，虚拟产品支付完毕后立即交易完成
     */
	public void setProductVirtual(java.lang.Boolean productVirtual) {
		set("product_virtual", productVirtual);
	}

    /**
     * 是否是虚拟产品，虚拟产品支付完毕后立即交易完成
     */
	public java.lang.Boolean getProductVirtual() {
		return get("product_virtual");
	}

    /**
     * 商品标题
     */
	public void setProductTitle(java.lang.String productTitle) {
		set("product_title", productTitle);
	}

    /**
     * 商品标题
     */
	public java.lang.String getProductTitle() {
		return getStr("product_title");
	}

	public void setProductSummary(java.lang.String productSummary) {
		set("product_summary", productSummary);
	}

	public java.lang.String getProductSummary() {
		return getStr("product_summary");
	}

    /**
     * 产品规格
     */
	public void setProductSpec(java.lang.String productSpec) {
		set("product_spec", productSpec);
	}

    /**
     * 产品规格
     */
	public java.lang.String getProductSpec() {
		return getStr("product_spec");
	}

    /**
     * 商品缩略图
     */
	public void setProductThumbnail(java.lang.String productThumbnail) {
		set("product_thumbnail", productThumbnail);
	}

    /**
     * 商品缩略图
     */
	public java.lang.String getProductThumbnail() {
		return getStr("product_thumbnail");
	}

    /**
     * 商品加入购物车时的价格
     */
	public void setProductPrice(java.math.BigDecimal productPrice) {
		set("product_price", productPrice);
	}

    /**
     * 商品加入购物车时的价格
     */
	public java.math.BigDecimal getProductPrice() {
		return get("product_price");
	}

    /**
     * 商品的最新价格
     */
	public void setProductNewPrice(java.math.BigDecimal productNewPrice) {
		set("product_new_price", productNewPrice);
	}

    /**
     * 商品的最新价格
     */
	public java.math.BigDecimal getProductNewPrice() {
		return get("product_new_price");
	}

    /**
     * 商品数量
     */
	public void setProductCount(java.lang.Integer productCount) {
		set("product_count", productCount);
	}

    /**
     * 商品数量
     */
	public java.lang.Integer getProductCount() {
		return getInt("product_count");
	}

    /**
     * 产品详情页
     */
	public void setProductDetailPage(java.lang.String productDetailPage) {
		set("product_detail_page", productDetailPage);
	}

    /**
     * 产品详情页
     */
	public java.lang.String getProductDetailPage() {
		return getStr("product_detail_page");
	}

    /**
     * 查看的网址路径，访问时时，会添加orderid
     */
	public void setViewPath(java.lang.String viewPath) {
		set("view_path", viewPath);
	}

    /**
     * 查看的网址路径，访问时时，会添加orderid
     */
	public java.lang.String getViewPath() {
		return getStr("view_path");
	}

    /**
     * 查看的文章内容，比如：查看、下载
     */
	public void setViewText(java.lang.String viewText) {
		set("view_text", viewText);
	}

    /**
     * 查看的文章内容，比如：查看、下载
     */
	public java.lang.String getViewText() {
		return getStr("view_text");
	}

    /**
     * 可访问的有效时间，单位秒
     */
	public void setViewEffectiveTime(java.lang.Long viewEffectiveTime) {
		set("view_effective_time", viewEffectiveTime);
	}

    /**
     * 可访问的有效时间，单位秒
     */
	public java.lang.Long getViewEffectiveTime() {
		return getLong("view_effective_time");
	}

	public void setCommentPath(java.lang.String commentPath) {
		set("comment_path", commentPath);
	}

	public java.lang.String getCommentPath() {
		return getStr("comment_path");
	}

    /**
     * 选中状态
     */
	public void setSelected(java.lang.Boolean selected) {
		set("selected", selected);
	}

    /**
     * 选中状态
     */
	public java.lang.Boolean getSelected() {
		return get("selected");
	}

	public void setOptions(java.lang.String options) {
		set("options", options);
	}

	public java.lang.String getOptions() {
		return getStr("options");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

	public java.util.Date getModified() {
		return get("modified");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

}
