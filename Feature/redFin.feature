Feature:
Scenario Outline:  Searching House in Sunnyvale City
Given Launched the browser and enter Url
When User send "<CityName>" in Search Box and Enter 
Then Pop-up Displays and User select Sunnyvale CA,USA
And User verify the serchbox
Then User Select the minium price button
And User Slect  min_price
Then User select Maximum price button
And User Select max_price
#And User verify the house is displayed in the range
Then User Quit the Browser

Examples:
|CityName		|
|Sunnyvale	|
|Dallas			|	   		
