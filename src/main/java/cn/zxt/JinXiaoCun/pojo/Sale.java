package cn.zxt.JinXiaoCun.pojo;


import java.sql.Date;

public class Sale {
	private int id;
	private double price;
	private int quantity;
	private double totalPrice;
	private Date saleDate;
	private Users users;
	private Product product;

	public Sale() {
	}

	public Sale(int id, double price, int quantity, double totalPrice, Date saleDate, Users users, Product product) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.saleDate = saleDate;
		this.users = users;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Sale{" +
				"id=" + id +
				", price=" + price +
				", quantity=" + quantity +
				", totalPrice=" + totalPrice +
				", saleDate=" + saleDate +
				", users=" + users +
				", product=" + product +
				'}';
	}
}