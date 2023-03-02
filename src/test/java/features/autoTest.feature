Feature: Auto Quote Testing

  Background: 
    * this is a quote test

  @auto @smoke
  Scenario: Auto Test
    Given verify home page title
    And insert zipcode field '10461'
    When click go button
    And click auto LOB
    Then click start my quote

  @dataDriven @csr-453 @regression
  Scenario Outline: Auto Test with <zipCode>
    Given verify home page title
    And insert zipcode field <ZipCode>
    When click go button
    And click auto LOB
    Then click start my quote

    Examples: 
      | zipCode |
      | '10461' |
      | '10462' |
      | '10463' |
