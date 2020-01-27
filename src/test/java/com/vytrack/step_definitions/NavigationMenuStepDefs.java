package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @Given("the user should be on the dashboard by entering sales manager credentials")
    public void the_user_should_be_on_the_dashboard_by_entering_sales_manager_credentials() {
        System.out.println("User should be on the sales manager dashboard");
    }

    @When("the user navigate from Fleet to Vehicles module")
    public void the_user_navigate_from_Fleet_to_Vehicles_module() {
        System.out.println("User navigates from Fleet to Vehicles");
    }

    @When("the user navigate to Campaings through Marketing module")
    public void the_user_navigate_to_Campaings_through_Marketing_module() {
        System.out.println("User navigates from Marketing to Campaigns");
    }

    @When("the user navigate from activities to calendar module")
    public void the_user_navigate_from_activitoes_to_calendar_module() {
        System.out.println("User navigate from Activities to Calendar Module");
    }

    @Then("user should be on the https:\\/\\/qa{int}.vytrack.com\\/entity\\/fleet")
    public void user_should_be_on_the_https_qa_vytrack_com_entity_fleet(Integer int1) {
        System.out.println("User should be on the https://qa3.vytrack.com/entity/fleet");
    }

    @Then("user should be on the https:\\/\\/qa{int}.vytrack.com\\/campaig")
    public void user_should_be_on_the_https_qa_vytrack_com_campaig(Integer int1) {
        System.out.println("User should be on the https://qa3.vytrack.com/campaign");

    }

    @Then("user should be on the https:\\/\\/qa{int}.vytrack.com\\/calendar\\/event")
    public void user_should_be_on_the_https_qa_vytrack_com_calendar_event(Integer int1) {
        System.out.println("User should be on the  https://qa3.vytrack.com/calendar/event");
    }

    @When("the user navigates {string} {string}")
    public void the_user_navigates(String tab, String module) {
        BrowserUtils.waitFor(3);
        new DashboardPage().navigateToModule(tab,module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer ePageNumber) {
        ContactsPage contactsPage = new ContactsPage();

        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(ePageNumber,actualNumber);
    }



}
