package io.cucumber.skeleton;

import static io.cucumber.junit.platform.engine.Constants.ANSI_COLORS_DISABLED_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("io.cucumber.skeleton")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(
    key = ANSI_COLORS_DISABLED_PROPERTY_NAME,
    value = "true"
)
@ConfigurationParameter(
    key = GLUE_PROPERTY_NAME,
    value = "io.cucumber.skeleton"
)
public class RunCucumberTest {}