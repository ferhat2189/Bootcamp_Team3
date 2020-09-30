Feature: Aetna Home

  Scenario: Aetna Logo should display
    Given I am Aetna home page
    When I wait for four seconds
    Then I verify if the logo is displayed
Feature:aetna functionality

#  Scenario Outline:Aetna test 1
#    Given I am in Aetna home page
#    Then  I click on Find Doctor
#    Then I enter"<userN>"and"<pass>"
#    Then I verify find doctor appears properly
#    Examples:
#      |userN      | pass   |
#      |fer123     |root123 |
#      |belfer     |root1234|
#
#  Scenario Outline:aetna test 2
#    Given I am on Aetna home page
#    And I click log in
#    Then  I click register
#    Then I enter "<MemberID>" and "<FirstName>" and "<LastName>" and"<zipcode>"
#    And I click continue
#    Examples:
#      |MemberID| FirstName|LastName|zipcode|
#      |34527651 |David     |Di       |11204 |
#
#  Scenario Outline: aetna test 3
#    Given I am on Aetna home page
#    And I click log in
#    Then  I click login
#    Then I enter "<username>" and "<password>"
#    And I click enter
#    Examples:
#      |username| password|
#      |david12 |123test  |
#
#  Scenario Outline:aetna 4
#    Given I am on aetna home page1
#    Then  I click on member support
#    And I click on account management
#    Then Iclick on get your id
#    Then I enter VARIABLE "<username>" and "<password>"
#    And I click enter to continue
#    Examples:
#      |username| password|
#      |david15 |123tes  |
#
#  Scenario Outline:aetna 5
#    Given I am on aetna home page2
#    Then  I click on login1 and i scroll down
#    Then I click on contact member service
#    And  I file "<LastName>" and "<FirstName>" and click yesOrNo and "<email>"
#    Examples:
#      |LastName| FirstName|email|
#      |bel     |      |buotam@hotmail.fr|
#    #^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
#  Scenario:Aetna functionality test 6
#    Given I am on Aetna home page
#    Then  I click Find Doctor
#    Then I click find a pharmacist
##scenario #7
#  Scenario: aetna test 7
#    Given I am on Aetna home page
#    And I click log in
#    Then I click on employer
#    And I try to log in
##    |userName|passWord|
#      |abes95  |123tes  |
#    Then I log in
#    #scenario #8
#  Scenario: aetna test 8
#    Given I am on Aetna home page
#    And I click search
#    Then I send word to seach
#      |deantist|
#      |pharmacist|
#    #scenario #9
#  Scenario: aetna test 9
#    Given I am on Aetna home page
#    Then  I click Find Doctor
#    And   I click medicare plan
