
  Feature: Datatable Feature

    Scenario: Datatable Register Scenario

      Given Navigate to Register Website
      When Fill the Areas
        |-Fields-           |-Values-           |
        |First Name         |Mustafa            |
        |Last Name          |Aydin              |
        |Email              |mustafa@aydin.com  |
        |Mobile             |345235234523       |
        |Current Address    |Landwehr Str. 12   |

      Then Verify Register Page's Url


