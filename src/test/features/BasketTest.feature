Feature: Basket feature test

  As a user
  I can able to add the product which I have choosen

  @basket
  Scenario:Verify product to be added in the basket

    Given I am on home page "https://www.amazon.co.uk/" with title ".co.uk"
    When I enter "kids white tshirt"
    And I click search
    And I get redirected to products page with title "kids white tshirt"
    And I click "4 Pack 100% Cotton Kids Plain T-Shirts Hypoallergenic Tee for Boys Girls Children School Uniform K01" and get redirected to product description page
    And I select size as "3-4 Years"
    Then I click add to basket and see the item added to basket