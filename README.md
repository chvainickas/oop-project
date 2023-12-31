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
-String email(in specific format "string" + "@" + "string" "." + "string")
-String loginName(only numbers and letters)
-String loginPassword(needs to be secure(string with 1 uppercase,1 number,1 special character))
##### Funcs
verifyLogin()

#### Class 2 - Admin
##### Data members
-String adminID
##### Funcs
addUser()
removeUser()

#### Class 3 - AppUser
##### Data members
-int userID
-String firstName
-String surName
-int age
-bool termsAndConditions(do users agreee to terms)
##### Funcs
register()
login()

### Quiz(Daniel)

The user will take a quiz with a range of up to 20 questions in which the topic is going to be the causes, consecuences and possible actions of climate change. This section will have a defined instance of inheritance using the parent Quiz class and three children, which are going to be Question, Answer and the QuizUI as interface.

#### Class 1 - Quiz

#### Class 2 - Question

#### Class 3 - Answer

#### Class 4 - QuizUI

### Results(Maksym)

The user will receive a grade on how they did on the quiz and information regarding each question that they answered. The user might get an eco-friendly rating or certification based on their awareness level of how their actions affect the climate.

#### Class 1 - Results

#### Class 2 - ResultsUI

#### Class 3 - Review
