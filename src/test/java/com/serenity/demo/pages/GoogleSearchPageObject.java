package com.serenity.demo.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class GoogleSearchPageObject extends PageObject {


	@FindBy(id="lst-ib")
	public WebElementFacade txtboxGoogleSearch;

	@FindBy(css="h3.r>a")
	public WebElementFacade lnkGoogleSearchResults_FirstRecord;

	@FindBy(name="btnG")
	public WebElementFacade btnSearch;

	public void openURL(){
		String url = "http://www.google.com";
		openAt(url);
	}

	public void typeSearchText(String sSearchTerm){
		txtboxGoogleSearch.type(sSearchTerm);
//		txtboxGoogleSearch.sendKeys("\u2212");
	}

	public  String getFirstRecordFromSearchResults(){
		waitABit(3000);
		return lnkGoogleSearchResults_FirstRecord.getText();
	}

	public void pressEnterToSearch(){
		btnSearch.click();
	}
}
	
