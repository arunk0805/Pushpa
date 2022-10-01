package org.movie;

import org.base.BaseClass;
import org.pom.IdmbPage;
import org.pom.WikiPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MovieInfo extends BaseClass {

	@BeforeClass
	public void beforeClass() {
		
		browserLaunch();
	}

	@Test
	public void wiki() throws InterruptedException {
        
		url("https://en.wikipedia.org/");
		WikiPage wikipage = new WikiPage();
		wikipage.wikiPageInfo("Pushpa: The Rise");
		Assert.assertEquals("Pushpa: The Rise", getText(wikipage.getExpected()));

	}

	@Test
	public void imdb() {
		
        url("https://www.imdb.com/");
		IdmbPage idmbPage = new IdmbPage();
		idmbPage.imdbPageInfo("Pushpa: The Rise");
		Assert.assertEquals("Pushpa: The Rise - Part 1", getText(idmbPage.getExpected()));

	}

	

	@AfterClass
	public void afterClass() {
		quite();
	}
}
