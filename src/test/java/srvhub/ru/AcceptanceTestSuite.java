package srvhub.ru;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {
    public AcceptanceTestSuite() {
        runSerenity().inASingleSession();
    }
}
