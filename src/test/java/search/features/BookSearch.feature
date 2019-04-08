Feature: Find shop page via Google search page, go to shop find required book and add it to cart

  Scenario: Open browser, type text and find it

    Given open browser and navigate to google search page
    When type walmart in search field
    And click search button
    And find link with walmart.com and move to the shop
    And change search category to Books
    And type Conan Doyle into search field
    And find Sherlock : The Essential Arthur Conan Doyle Adventures book and move to book's page
    And select book format as Hardcover
    And click Add to cart button
    And click View Cart button
    Then cart page contains 1 item
    And cart page contains Sherlock : The Essential Arthur Conan Doyle Adventures book