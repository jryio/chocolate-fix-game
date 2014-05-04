#ChocolateFixGame

###Java clone of ThinkFun's "Chocolate Fix" game for an AP Computer Science project

######*Note: The basic UI and buttons are working, no game rules or engine working*


##[How the game works](http://www.marblesthebrainstore.com/files/rules/Chocolate_Fix_Rules.pdf)

"Chocolate Fix" is a logic game based on solving a 3x3 board orientation with selective clues. There are 9 pieces total, 3
squares, 3 triangles, and 3 cirlces, with one of each in brown, pink and tan.

To play, a difficultly must be selected (which determines the ammount of information in the clues) and then clues are
shown. Each "clue" is a section of the baord taken out of context with certain tiles filled with information (either
the color of the piece or the shape, or both).

Using the clues one has to contextualize the clues into different positions and coordinate whether the color and shape of the piece will fit there.



##Goals

 * Graphics
  * Board (display)
  * Menu Bar (Level selection, etc.)
  * Clue Bar (Area to display graphically generated clues from Level Loader)
  * Images for pieces (Photoshop renders)
  * Optimization
    * Double Buffered Image
    * More (?)
* Actions
  * Mouselisteners working for different windows (Menu Bar, Board, Blue Bar)
  * Method to add/remove pieces (keyboard, mouse, click/drag?)
 * Game Engine
  * Rules
    * Win Checking
    * Maximum Pieces
    * Maximum Colors
  * Difficulty Selection
  * Level Loading
    * Parse levels, clues from XML file or .txt files (requires unique shorthand for 3x3 board).
    * Send information to Graphics Engine to display Clues for the user.
    * Alternative: Create 400+ images to load into the engine so that shapes and board orientation do not have to generated each time.
  * Save Game Progress
    * Look into XML
    * Look into .txt parsing
