package com.test.rest.beans;

public class LoginForm {
	private String username;
	private String passphrase;
	private String input2fa;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username.trim();
	}
	public String getPassphrase() {
		return passphrase;
	}
	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase.trim();
	}
	public String getInput2fa() {
		return input2fa;
	}
	public void setInput2fa(String input2fa) {
		this.input2fa = input2fa;
	}
}
