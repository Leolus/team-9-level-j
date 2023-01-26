Feature: Move in a direction 
    
I want to move my character. If they attempt to 
move past a boundary, the move results in no change in position.
    
<img src="images/sbe.png" width="300">

Scenario Outline: Move in a direction
    Given the character starts at position with XCoordinates <startingPositionX> 
    And starts at YCoordinates <startingPositionY>
    And the current move count is <staringMoveCount>
    And the player choses to move in <direction>
    When the character moves
    Then the character is now at position with XCoordinates <endingPositionX>
    And YCoordinates <endingPositionY>
    And the ending move count is <endingMoveCount>
    Examples:
        | startingPositionX | startingPositionY | staringMoveCount | direction | endingPositionX | endingPositionY | endingMoveCount |
        | 0 | 0 | 10  | S | 1 | 0 | 11 |
        | 1 | 0 | 10  | W | 1 | 0 | 11 |
        | 5 | 5 | 55  | E | 5 | 6 | 56 | 
        | 5 | 5 | 7   | N | 4 | 5 | 8  |
        | 5 | 5 | 38  | W | 5 | 4 | 39 |
