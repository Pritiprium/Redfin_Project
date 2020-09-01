$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/redFin.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Searching House in Sunnyvale City",
  "description": "",
  "id": ";searching-house-in-sunnyvale-city",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Launched the browser and enter Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User send \"\u003cCityName\u003e\" in Search Box and Enter",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Pop-up Displays and User select Sunnyvale CA,USA",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User verify the serchbox",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Select the minium price button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Slect  \"\u003cmin_price\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User select Maximum price button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Select \"\u003cmax_price\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User verify the house is displayed in the range \"\u003cCityName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Quit the Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": ";searching-house-in-sunnyvale-city;",
  "rows": [
    {
      "cells": [
        "CityName",
        "min_price",
        "max_price"
      ],
      "line": 15,
      "id": ";searching-house-in-sunnyvale-city;;1"
    },
    {
      "cells": [
        "Sunnyvale",
        "800",
        "950"
      ],
      "line": 16,
      "id": ";searching-house-in-sunnyvale-city;;2"
    },
    {
      "cells": [
        "Dallas",
        "600",
        "800"
      ],
      "line": 17,
      "id": ";searching-house-in-sunnyvale-city;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Searching House in Sunnyvale City",
  "description": "",
  "id": ";searching-house-in-sunnyvale-city;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Launched the browser and enter Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User send \"Sunnyvale\" in Search Box and Enter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Pop-up Displays and User select Sunnyvale CA,USA",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User verify the serchbox",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Select the minium price button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Slect  \"800\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User select Maximum price button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Select \"950\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User verify the house is displayed in the range \"Sunnyvale\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Quit the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_Steps.launched_the_browser_and_enter_Url()"
});
formatter.result({
  "duration": 12609123300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 11
    }
  ],
  "location": "Automation_Steps.user_send_in_Search_Box_and_Enter(String)"
});
formatter.result({
  "duration": 2668023100,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.pop_up_Displays_and_User_select_Sunnyvale_CA_USA()"
});
formatter.result({
  "duration": 1736696300,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.user_verify_the_serchbox()"
});
formatter.result({
  "duration": 6796770300,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.user_Select_the_minium_price_button()"
});
formatter.result({
  "duration": 676605900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "800",
      "offset": 13
    }
  ],
  "location": "Automation_Steps.user_Slect(String)"
});
formatter.result({
  "duration": 114155500,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.user_select_Maximum_price_button()"
});
formatter.result({
  "duration": 165812700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "950",
      "offset": 13
    }
  ],
  "location": "Automation_Steps.user_Select(String)"
});
formatter.result({
  "duration": 1328100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 49
    }
  ],
  "location": "Automation_Steps.user_verify_the_house_is_displayed_in_the_range(String)"
});
formatter.result({
  "duration": 2307240300,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.user_Quit_the_Browser()"
});
formatter.result({
  "duration": 898104100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Searching House in Sunnyvale City",
  "description": "",
  "id": ";searching-house-in-sunnyvale-city;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Launched the browser and enter Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User send \"Dallas\" in Search Box and Enter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Pop-up Displays and User select Sunnyvale CA,USA",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User verify the serchbox",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Select the minium price button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Slect  \"600\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User select Maximum price button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Select \"800\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User verify the house is displayed in the range \"Dallas\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Quit the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Automation_Steps.launched_the_browser_and_enter_Url()"
});
formatter.result({
  "duration": 13774053500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dallas",
      "offset": 11
    }
  ],
  "location": "Automation_Steps.user_send_in_Search_Box_and_Enter(String)"
});
formatter.result({
  "duration": 2388141200,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.pop_up_Displays_and_User_select_Sunnyvale_CA_USA()"
});
formatter.result({
  "duration": 2122148300,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.user_verify_the_serchbox()"
});
formatter.result({
  "duration": 6262005900,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.user_Select_the_minium_price_button()"
});
formatter.result({
  "duration": 160612000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "600",
      "offset": 13
    }
  ],
  "location": "Automation_Steps.user_Slect(String)"
});
formatter.result({
  "duration": 175265900,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.user_select_Maximum_price_button()"
});
formatter.result({
  "duration": 170916400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "800",
      "offset": 13
    }
  ],
  "location": "Automation_Steps.user_Select(String)"
});
formatter.result({
  "duration": 150002300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dallas",
      "offset": 49
    }
  ],
  "location": "Automation_Steps.user_verify_the_house_is_displayed_in_the_range(String)"
});
formatter.result({
  "duration": 1754875300,
  "status": "passed"
});
formatter.match({
  "location": "Automation_Steps.user_Quit_the_Browser()"
});
formatter.result({
  "duration": 839151300,
  "status": "passed"
});
});