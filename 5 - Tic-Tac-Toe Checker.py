# If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved, wouldn't we? Our goal is to create a function that will check that for us!

# Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty, 1 if it is an "X", or 2 if it is an "O", like so:

# [[0, 0, 1],
#  [0, 1, 2],
#  [2, 1, 0]]
# We want our function to return:

# -1 if the board is not yet finished AND no one has won yet (there are empty spots),
# 1 if "X" won,
# 2 if "O" won,
# 0 if it's a cat's game (i.e. a draw).
# You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.


# Solution

def is_solved(board):
    solution = 0
    
    for index in range(3):
        
        if 0 in board[index]:
            solution = -1
        
        # check rows
        if board[index][0] == board[index][1] and board[index][0] == board[index][2]:
            if board[index][0] != 0:
                return board[index][0]
                
        # check cols
        if board[0][index] == board[1][index] and board[0][index] == board[2][index]:
            if board[0][index] != 0:
                return board[0][index]
            
        # check diagonal
        if (board[0][0] == board[1][1] and board[2][2] == board[1][1]) \
        or (board[2][0] == board[1][1] and board[0][2] == board[1][1]):
            if board[1][1] != 0:
                return board[1][1]
    
    return solution
            
                