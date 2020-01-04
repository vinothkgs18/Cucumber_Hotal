Feature: To validate the hotal reservation 
Scenario Outline: to verify the login page with valid crediantial 

	Given User in hotal login page 
	When User has enter the valid crediantial"<userName>","<Password>" 
	And User has enter the booking details"<location>","<hotal>","<roomType>","<numberOfRoom>","<checkIn>","<checkOut">,"<adult>","<cheildren>" 
	And User need to select hotal and click ok 
	And User need to fill the customer details and Payment details "<firstName>","<lastName>","<billinaddress>""<cardNo>","<cardType>","<expDate>","<expMonth>","<ccvNumber>" 
	Then User get booking ID 
	
	
	Examples: 
		|userName|Password|location|hotal|roomType|numberOfRoom|checkIn|checkOut|adult|children|firstName|lastName|billinaddress|cardNo|cardType|expDate|expMonth|ccvNumber|
		|vinothkgs18|J0129Q|Paris|Hotel Creek|Double|2|05/01/2020|05/01/2020|2 - Two|2 - Two|vinoth|Kumar|PO BOX 95 omr chennai|7896453515981436|VISA|July|2022|165|
		
		
		
