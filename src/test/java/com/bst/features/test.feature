Feature: test

  @home
  Scenario: test as a Admin user
    Given Log in as Admin "admin" user
    When go to case system settings page