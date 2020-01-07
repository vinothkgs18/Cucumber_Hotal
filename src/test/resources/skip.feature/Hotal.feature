Feature: To validate the hotal reservation 
Scenario Outline: To verify the login page with valid crediantial 

	Given User in hotal login page 
	When User has enter the valid crediantial"<userName>","<Password>" 
	And User has enter the booking details"<location>","<hotal>","<roomType>","<numberOfRoom>","<checkIn>","<checkOut">,"<adult>","<cheildren>" 
	And User need to select hotal and click ok 
	And User need to fill the customer details and Payment details "<firstName>","<lastName>","<billinAddress>""<cardNo>","<cardType>","<expMonth>","<expYear>","<ccvNumber>" 
	Then User get booking ID 
	
	
	Examples: 
		|userName|Password|location|hotal|roomType|numberOfRoom|checkIn|checkOut|adult|children|firstName|lastName|billinAddress|cardNo|cardType|expMonth|expYear|ccvNumber|
		|vinothkgs18|J0129Q|Sydney|Hotel Creek|Double|2|05/01/2020|05/01/2020|2|2|vinoth|Kumar|PO BOX 95 omr chennai|7896453515981436|VISA|5|2022|165|
		
		
		
