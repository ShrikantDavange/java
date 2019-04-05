
public class Users implements Comparable<Users> {
	private String username;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int compareTo(Users user) {

		return this.username.compareTo(user.getUsername());
	}

}
