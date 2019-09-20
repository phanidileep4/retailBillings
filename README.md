# retailBillings
retails billings is a utility that can calculate the discounts with various cases and can provide the effective total bill


Code walk through:
------------------

Class OrderAction which is in the package of retail.billings.bl have the calculateDiscounts method which can calculate the discounts to a bill that is given with list of items based on customer and it's type according to problem given.

EffectiveTotalOrderValue of order will hold the order value which is after discount= total value-(percentage discount based on criteria+fixed discount)


Can be runnable by uncommenting the main in OrderAction or any of the junit test cases that are available.

Have used the Order, Customer, Item classes to do follow the object oriented programming concepts, where i have used only the basic concepts but not many like inheritence due to time constraint. But this can be easily convertable as that


Junit Test & Code Coverage:
---------------------------
Tried to cover all the code and business aspects, and when i run the eclipse code coverage tool it has given me 96%. 
In business cases test case has covered general customer case only not employee or affliant case.
Code coverage of eclipse can be runnable on test folder anyhow.


UML Class Diagram :
------------

Have also attached the uml class diagram where all the members are private and not really exposed any of the implemention as this is kind of a utility and all the cacluclation methods are also kind of setters and getters so not exposed in class diagram but can be understandable with properties names.


I would request to excuse if any of the implementations are not upto the mark and I will be very happy to assist in code walkthrough or any of the explanation


