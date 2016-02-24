package com.serenity.demo.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.serenity.demo.pages.GoogleSearchPageObject;
import net.thucydides.core.annotations.ManagedPages;

import net.thucydides.core.annotations.Step;

public class GoogleSearchUserSteps {


	@ManagedPages
	GoogleSearchPageObject googleSearchPageObject;

	@Step
	public void opensGooglePage() {
		googleSearchPageObject.openURL();
	}

	@Step
	public void searchWithText(String sSearchTerm){
		googleSearchPageObject.typeSearchText(sSearchTerm);
		googleSearchPageObject.pressEnterToSearch();
	}

	@Step
	public void shouldSeeSearchResults(String sExpectedSearchResults){
		assertThat(googleSearchPageObject.getFirstRecordFromSearchResults(), is(equalToIgnoringCase(sExpectedSearchResults)));
	}

	@Step
	public void shouldNOTSeeSearchResults(String sExpectedSearchResults){
		assertThat(googleSearchPageObject.getFirstRecordFromSearchResults(), is(not(equalToIgnoringCase(sExpectedSearchResults))));
	}
}