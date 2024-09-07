Main Application Module

This will be the main application page that is visible when the root URI of the application is accessed.
The main application should provide initial navigation concepts (e.g., a menu bar) to access the application's core functionality, such as Login and Register.
The main application, at this point, should have well-defined styles, fonts, colors, and an overall application theme implemented that will be used for the remaining milestone deliverables.
The application should leverage Spring MVC for all dynamic page generation.
The application should have a title (and possible a logo).
Registration Module

A user should be able to register to access the application.
Registration details, at a minimum, should include First Name, Last Name, Email Address, Phone Number, and Login Credentials (Username and Password).
The Registration page should leverage Spring MVC for all dynamic page generation.
A user object model should be designed and implemented.
A database model should be designed, but an implementation is not required until Milestone 4.
All data entered by the user must be validated and proper error messages provided so as to enable the user to easily correct the data.
Login Module

Initial login module that will emulate authenticating the user (i.e., no database).
The log page should leverage Spring MVC for all dynamic page generation.
A login/principle object model should be designed and implemented.
A database model should be designed, but an implementation is not required until Milestone 4.
All data entered by the user must be validated and proper error messages provided so as to enable the user to easily correct the data.
Security will be implemented as part of Milestone 6 using the Spring Security framework. For now, it is not required to securely protect any pages in the application.
Once the user is logged in, the main "product" page should be displayed and the menu system dynamically updated to reflect the logged in state of the application.
