package main.pojo;

public class AuthenticationResponse {

	private final String jwtToken;

	/**
	 * @param jwtToken
	 */
	public AuthenticationResponse(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getJwtToken() {
		return jwtToken;
	}

}
