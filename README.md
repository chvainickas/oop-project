# OOP 50% project
([Class Diagram](https://lucid.app/lucidchart/504d4fb6-3541-4ce5-b555-7d42c2ca3be7/edit?viewport_loc=-11%2C-11%2C2219%2C1067%2C0_0&invitationId=inv_bc6a68d9-ba3c-4121-86a5-77b80a45d6e5))
## Project idea

A quiz to educate users about climate change and for them to be able to take action. This aim of this project will be to aid in achieving goal #13 of the Global Goals, which is Climate Action to urge people to take urgent action to combat climate change([ref](https://www.globalgoals.org/goals/13-climate-action/))

Our idea is to build a quiz for people to log in and test their knowledge of how their actions impact climate change and the actions they can do to lower their carbon footprint.

## 3 Sections

### Login/Details Page(Edward)

The user will be to register and login in to the portal. Their details will be written to a file to log their details and keep a log of their results for the quiz.

#### Class 1 - User

##### Data members

-String firstName
-String surName
-int age
-String email(in specific format "string" + "@" + "string" "." + "string")
-String loginName(only numbers and letters)
-String loginPassword(needs to be secure(string with 1 uppercase,1 number,1 special character))
-bool termsAndConditions(do users agreee to terms)

##### Funcs

-termsAndConditions(if user accepts, registration is valid, if not, registration void(error message))

#### Class 2 - Registration

##### Data members

-super.\*(all data members from from User class)

##### Funcs

-setter&getters for data members
-verify each data member
-if verified write to csv file

#### Class 3 - Login

##### Data members

-super(loginName,loginPassword)
-bool isUser

##### Funcs

-login(super.loginName,super.loginPassword)
-loginMsg()
-timeout()
-setter and getters

### Quiz(Daniel)

The user will take a quiz to see how their actions affect climate change. This section will have a defined instance of inheritance using the parent questions class

#### Class 1 - Quiz

#### Class 2 - ??

#### Class 3 - ??

### Results(Maksym)

The user will receive a grade on how they did on the quiz. The user might get an eco-friendly rating or certification based on their awareness level of how their actions affect the climate.

#### Class 1 - Results

#### Class 2 - ??

#### Class 3 - ??
