
1. 2 player game, 3x3 Board.
2. Any user can create one game / one series of game. there will be leader board facility
3. add user > invaitation to join 
4. get result, leader board
5. Game Mode : Limited series, FIRST_WIN, -> players accpts the draw. 

Multiplayer Featusre
5. even user can check what are the active game waiting for oppnent. user can ask for join, the host may accept or no. each user will have history. how many wins , how many losses, even game history


Board

Match    1 --- 1 Board
Board
proper matrix 



GameWinning Rule : Strategy Pattern
FIRST_WIN 
N MATCH Series

Game/Series of game -    1 --- * Match
winnning rule : 
once winner is found > Conclude the game
add Player
join
game status
match
update leaderboard
update match status



TTTManager -       SingleTon 1 --- * Game 
List of games, 


Leaderboard

Player
NotificationSystem


