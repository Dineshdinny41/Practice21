
package com.testing.features;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Credentials {
	
@Test(retryAnalyzer=MyRetryAnalyzer.class)
private void username(){
	String username="Arun";
	String expectedusername="Arun";
	Assert.assertEquals(username, expectedusername);
	
}
@Test(retryAnalyzer=MyRetryAnalyzer.class)
private void password(){
	String username="monday@123";
	String expectedusername="Monday@123";
	Assert.assertEquals(username, expectedusername);
}
}
