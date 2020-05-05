$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Home/eclipse-workspace/CucumberAMBatch/features/Tagging.feature");
formatter.feature({
  "line": 1,
  "name": "Tags in cucumber",
  "description": "",
  "id": "tags-in-cucumber",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 12,
  "name": "Verify search",
  "description": "",
  "id": "tags-in-cucumber;verify-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "This is search test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefinitions.this_is_search_test()"
});
formatter.result({
  "duration": 227778400,
  "status": "passed"
});
});