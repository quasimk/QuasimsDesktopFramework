Feature: Testing Opening Excel
Scenario: Open Excel
  Given I have opened the Excel app

Scenario: Testing a template
  Given I have opened the Excel app
  When I select New
  And I click Simple Gantt Chart from the templates
  Then the title will be "Gantt project planner1 - Excel".


  Scenario: Verifying the "Get Help" button appears
    Given I have opened the Excel app
    When I select a new Gantt Chart
    And I click help from the title bar
    And I click the Contact Support icon
    Then the get help button will appear on the right hand side of the page

    Scenario: Account User Name will appear
      Given I have opened the Excel app
      When I Select the account option
      Then my "Qas Khan" will appear under User Information

      Scenario: Inputting Data in an Excel Doc
        Given I have opened the Excel app
        When I click file
        And open
        And I search the term Desktop Test
        And I click on the document that appears
        Then I will be able to enter text into the page
        
        Scenario: Testing a template Fail
          Given I have opened the Excel app
          When I select New
          And I click Simple Gantt Chart from the templates
          Then the title will be "GanttProjectplanner-22".



