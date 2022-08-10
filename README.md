# LoginWithCucumber

This project do a web testing automation with the cucumber library. The Page Object Model is still used as the framework, where  views will appear in the pages folder, useful methods would be under the utilities packages and the tests would be in the test package. Cucumber enter to make a link between the gerkhin written testing scenarios and the tester or runner class. 


As it is a POM model, for code readibility and reusability it is created with an architecture in 3 folders. Pages folder to provide views. utilities folder to provide useful methods, and a test folder to provide running methods or tests.   
. 

The main testing class is the so called Runner class coming from the runners library of the cucumber.   it is annotated with @RunEith(Cucumber.class) as well as the @CucumberOptions, where refers to the features folders ( it will make the connection via tags. the glue refers to the so-called Step Definitions, whic are the methods to created based on the Scenario. Actually, the terminal will suggest the method names and signatures as well.  These methods will come with the exception parts. Infact, the exception throws can be deleted for a better visualisation.

A feature file created in the resources directory serves as an link for the creation of the step methods to execute the test in the scenario. The main testing class is the so called Runner class coming from the runners library of the cucumber. 

* the pages folder contains:
  * 1-HomePage class to contain a constructor wich refer to the PageFactory.  This page contains web element "loginButton" to go to the login page
  * 2-LoginPage, which comes after. This page contains a Constructor refering to PageFactory as usual, and username, password and submit WebElements. Also, in the case of failed login, the pop-up page appear for a short time on the Login Page. Thus, an invalid credentials message element .
  * 3-DefaulPage or SuccessLoginPage. a userIDLoged webElement can be used to assert the test. 

* Utilities Folder:
  * Driver Class to prepare and use drivers. 
  * Configuration Reader class to get data from configuration file.
  * Usefull methods classs. 


* Tests Folder. 
  * one or more  test classes to run. One can write tests in the same class as well.
