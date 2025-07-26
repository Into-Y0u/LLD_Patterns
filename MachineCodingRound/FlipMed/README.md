## Getting Started

Machine Coding Round: FLIPMED
Description:

We are required to build an app that lets patients connect to doctors and book appointments. The day is divided into time slots of 30 mins each, starting from 9 am to 9 pm. Doctors can login to the portal and declare their availability for the given day in terms of slots.  Patients can book appointments/ cancel existing appointments. For simplicity you can assume that the doctors’ availability is declared for that particular day only. 

Actor : 
1. Doctor
    a. login 
    b. Availablity and Time slots
    c. Only one day case
2. Patient
    a. Log in 
    b. choose doctor by sicknees 
    c. book appointment 
    d. pay/pay in cash


Entity : 

Class : Doctor
+ Name
+ Spec
+ availability for each slots
+ Can see other doctor slots so far

Enum Class Cardiologist, Dermatologist, Orthopedic, General Physician


Class : Patients
+ Name
+ Problems
+ Search based on problems
+ can see slots of doctors
+ Book multiple Slots ( A patient cannot book two appointments with two different doctors in the same time slot.)
+ cancle (at least before that slot)
+ attend 
+ Give rating if at least attend once the doct(future)


class Slots :
a) default is by timeing
b) by rating of doctor


class Manager :
1. CRUD slots
2. adn waiting list

waiting list : one slot max have 1 waiting list


Features:

A new doctor should be able to register, and mention his/her speciality among (Cardiologist, Dermatologist, Orthopedic, General Physician)
A doctor should be able to declare his/her availability in each slot for the day. For example, the slots will be of 30 mins like 9am-9.30am, 9.30am-10am..
Patients should be able to register. Patients should be able to search available slots based on speciality.  
The slots should be displayed in a ranked fashion. Default ranking strategy should be to rank by start time. But we should be able to plugin more strategies like Doctor’s rating etc in future.
Patients should be able to book appointments with a doctor for an available slot.A patient can book multiple appointments in a day.  A patient cannot book two appointments with two different doctors in the same time slot.
Patients can also cancel an appointment, in which case that slot becomes available for someone else to book.
Build a waitlist feature:
If the patient wishes to book a slot for a particular doctor that is already booked, then add this patient to the waitlist.
If the patient with whom the appointment was booked originally cancels the appointment, then the first in the waitlist gets the appointment.
A patient/doctor should be able to view his/her booked appointments for the day.  

Bonus requirements:

Trending Doctor: Maintain at any point of time which doctor has the most appointments.
Different ranking strategy - use rating of doctor as a strategy to display a list of available doctors for a given specialization.

Expectations and guidelines:
Time: 120mins
You are allowed to access the internet only for syntax purposes.
You are free to use any language of your choice.
Do not use any external libraries. All of the code should be your own.
Implement the code using only in-memory data structures or basic file handling. The use of databases is not allowed.
Do not create any UI for the application.
Write a driver class for demo purpose which will execute all the commands at one place in the code and test cases.
Create the sample data yourself. You can put it into a file, test cases or the main driver program itself.
Make sure that you can execute your code and show that it is working.
Please prioritize code compilation, execution and completion.
Make sure that code is functionally correct.
Work on the expected output first and then add good-to-have features of your own.
Code should be modular and readable.
Separation of concern should be addressed.
Code should easily accommodate new requirements with minimal changes.
Code should be modular and have the correct abstractions.
Code should be legible, readable, and DRY.
Code should be easily testable.
Please focus on the Bonus requirement only after ensuring the required features are complete and demoable. The bonus portion would not be evaluated if any of the required functionality is missing   


