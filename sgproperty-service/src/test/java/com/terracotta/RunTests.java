package com.terracotta;

/**
 * Created by johndoe on 7/21/14.
 */

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"}, features = "src/test/resources")
public class RunTests {

}