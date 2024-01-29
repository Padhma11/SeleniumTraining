$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/IciciLogin.feature");
formatter.feature({
  "name": "To validate Icici bank login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To click on ICICI Bank Home",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "To launch ICICI URL",
  "keyword": "Given "
});
formatter.match({
  "location": "IciciLogin.to_launch_ICICI_URL()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.base.BaseClass.launchUrl(BaseClass.java:39)\r\n\tat org.stepdefinition.IciciLogin.to_launch_ICICI_URL(IciciLogin.java:17)\r\n\tat ✽.To launch ICICI URL(src/test/resources/IciciLogin.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click ICICI bank home",
  "keyword": "When "
});
formatter.match({
  "location": "IciciLogin.to_click_ICICI_bank_home()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To check Icici home page is displayed on new tab",
  "keyword": "Then "
});
formatter.match({
  "location": "IciciLogin.to_check_Icici_home_page_is_displayed_on_new_tab()"
});
formatter.result({
  "status": "skipped"
});
});