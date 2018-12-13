package cn.zxt.JinXiaoCun.pojo;

public class Users {
	private int id;
	private String userName;
	private String password;
	private String readName;

	public Users() {
	}

	public Users(int id, String userName, String password, String readName) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.readName = readName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReadName() {
		return readName;
	}

	public void setReadName(String readName) {
		this.readName = readName;
	}

	@Override
	public String toString() {
		return "Users{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", readName='" + readName + '\'' +
				'}';
	}
}