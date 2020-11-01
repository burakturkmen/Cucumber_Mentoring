@RegressionTest
@SmokeTest
  Feature: SWAGLABS Page

    Scenario: SWAGLABS Test 1

      Given Navigate to Swaglabs Login Page
      When Enter Username and Password
      Then Click to Login Button
      When Click to Sauce Labs Bacpack
      Then Click to Add to Cart
      And Click to Cart
      Then Verify Items Price Text