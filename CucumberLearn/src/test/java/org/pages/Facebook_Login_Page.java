package org.pages;

import org.core.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_Page extends CommonMethods{
	
	public Facebook_Login_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindAll({@FindBy(id="loginbutton"),@FindBy(name="login")})
	public WebElement loginBtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}

