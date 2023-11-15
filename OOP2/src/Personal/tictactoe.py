#-------------------------------------------------------------------------------
# Name:        TIC TAC TOE
# Purpose:     COMPUTER PLAYS WITH THE USER
#
# Author:      PATRICIA
#
# Created:     28/10/2023
# Copyright:   (c) dell 2023
# Licence:     <your licence>
#-------------------------------------------------------------------------------

"""
Your task is to write a simple program which pretends to play tic-tac-toe with the user. To make it all easier for you, we've decided to simplify the game. Here are our assumptions:

the computer (i.e., your program) should play the game using 'X's;
the user (e.g., you) should play the game using 'O's;
the first move belongs to the computer − it always puts its first 'X' in the middle of the board;
all the squares are numbered row by row starting with 1 (see the example session below for reference)
the user inputs their move by entering the number of the square they choose − the number must be valid, i.e., it must be an integer, it must be greater than 0 and less than 10, and it cannot point to a field which is already occupied;
the program checks if the game is over − there are four possible verdicts: the game should continue, the game ends with a tie, you win, or the computer wins;
the computer responds with its move and the check is repeated;
don't implement any form of artificial intelligence − a random field choice made by the computer is good enough for the game.
The example session with the program may look as follows:

+-------+-------+-------+
|       |       |       |
|   1   |   2   |   3   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   4   |   X   |   6   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   7   |   8   |   9   |
|       |       |       |
+-------+-------+-------+
Enter your move: 1
+-------+-------+-------+
|       |       |       |
|   O   |   2   |   3   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   4   |   X   |   6   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   7   |   8   |   9   |
|       |       |       |
+-------+-------+-------+
+-------+-------+-------+
|       |       |       |
|   O   |   X   |   3   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   4   |   X   |   6   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   7   |   8   |   9   |
|       |       |       |
+-------+-------+-------+
Enter your move: 8
+-------+-------+-------+
|       |       |       |
|   O   |   X   |   3   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   4   |   X   |   6   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   7   |   O   |   9   |
|       |       |       |
+-------+-------+-------+
+-------+-------+-------+
|       |       |       |
|   O   |   X   |   3   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   4   |   X   |   X   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   7   |   O   |   9   |
|       |       |       |
+-------+-------+-------+
Enter your move: 4
+-------+-------+-------+
|       |       |       |
|   O   |   X   |   3   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   O   |   X   |   X   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   7   |   O   |   9   |
|       |       |       |
+-------+-------+-------+
+-------+-------+-------+
|       |       |       |
|   O   |   X   |   X   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   O   |   X   |   X   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   7   |   O   |   9   |
|       |       |       |
+-------+-------+-------+
Enter your move: 7
+-------+-------+-------+
|       |       |       |
|   O   |   X   |   X   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   O   |   X   |   X   |
|       |       |       |
+-------+-------+-------+
|       |       |       |
|   O   |   O   |   9   |
|       |       |       |
+-------+-------+-------+
You won!

Requirements
Implement the following features:

the board should be stored as a three-element list, while each element is another three-element list (the inner lists represent rows) so that all of the squares may be accessed using the following syntax:

board[row][column]


each of the inner list's elements can contain 'O', 'X', or a digit representing the square's number (such a square is considered free)
the board's appearance should be exactly the same as the one presented in the example.
implement the functions defined for you in the editor.

Drawing a random integer number can be done by utilizing a Python function called randrange(). The example program below shows how to use it (the program prints ten random numbers from 0 to 8).

Note: the from-import instruction provides access to the randrange function defined within an external Python module callled random.

rom random import randrange

for i in range(10):
    print(randrange(8))
"""

import random
print("Welcome to Tic Tac Toe\n------------------------------------------")
possibleNumbers = [1,2,3,4,5,6,7,8,9]
gameBoard = [[1,2,3], [4,5,6], [7,8,9]]
rows = 3
cols= 3

def printGameBoard():
    for x in range(rows):
        print("\n+---+---+---+")
        print("|", end="")
        for y in range(cols):
            print("", gameBoard[x][y], end=" |")
    print("\n+---+---+---+")

printGameBoard()

def modifyArray(num, turn):
    num -= 1
    if num == 0:
        gameBoard[0][0] = turn
    elif num == 1:
        gameBoard[0][1] = turn
    elif num == 2:
        gameBoard[0][2] = turn
    elif num == 3:
        gameBoard[1][0] = turn
    elif num == 4:
        gameBoard[1][1] = turn
    elif num == 5:
        gameBoard[1][2] = turn
    elif num == 6:
        gameBoard[2][0] = turn
    elif num == 7:
        gameBoard[2][1] = turn
    elif num == 8:
        gameBoard[2][2] = turn

def checkWinner(gameBoard):
    #X AXIS
    if gameBoard[0][0] == 'X' and gameBoard[0][1] == "X" and gameBoard[0][2] == "X":
        print("X has won")
        return "X"
    elif gameBoard[0][0] == 'O' and gameBoard[0][1] == "O" and gameBoard[0][2] == "O":
        print("O has won")
        return "O"
    #Y AXIS
    elif gameBoard[0][0] == 'X' and gameBoard[1][0] == "X" and gameBoard[2][0] == "X":
        print("X has won")
        return "X"
    elif gameBoard[0][0] == 'O' and gameBoard[1][0] == "O" and gameBoard[2][0] == "O":
        print("O has won")
        return "O"
    #CROSS WINS
    elif gameBoard[0][0] == 'X' and gameBoard[1][1] == "X" and gameBoard[2][2] == "X":
        print("X has won")
        return "X"
    elif gameBoard[0][0] == 'O' and gameBoard[1][1] == "O" and gameBoard[2][2] == "O":
        print("O has won")
        return "O"
leaveLoop = False
turnCounter = 0

while leaveLoop == False:
    #its the player's turn
    if turnCounter % 2 == 1:
        printGameBoard()
        numberPicked = int(input("\nChoose a number [1-9]: "))
        if numberPicked >= 1 or numberPicked <= 9:
            modifyArray(numberPicked, "X")
            possibleNumbers.remove(numberPicked)
        else:
            print("invalid input. Please try again")
        turnCounter += 1
    #its computer's turn
    else:
        while True:
            cpuChoice = random.choice(possibleNumbers)
            print("\ncpuChoice: ", cpuChoice)
            if cpuChoice in possibleNumbers:
                modifyArray(cpuChoice, "O")
                possibleNumbers.remove(cpuChoice)
                turnCounter += 1
                break