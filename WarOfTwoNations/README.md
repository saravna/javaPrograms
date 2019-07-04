War of Two Nations
Sparta and Persia are fighting a war. A messenger is reporting the same to a remote location using the following format

The first line of input (integer) represents the number of days of battle.
The rest of the rows represents each day of battle.
Here H represents Horse, E represents elephants, C represents cavalry and A represents archers.
Capital letters represent Spartans and small letters represent Persian army.
The . represents the number of units. For example H... represents 3 units of horses, E.... represents 4 units of elephants.
X in the unit represents double points (X is equivalent to two dots)
The objective is to calculate who wins the battle. Every line represents one day of battle.
The team which scores the highest points wins. 
Points are calculated as follows:
Horse - 5 points
Elephant - 10 points
Archer - 3 points
Cavalry - 1 point


So the points for
H...E...H.XC..A..  means
5*3 + 10*3 + 5*3 + 1*2 + 3*2 = 68 points

Input 1:
5
H...E...H...C..A...h..e....h...c....a....$
H.......................h.......................$ 
H.XE...H.........C..A...h..e....h.Xc....a....$
H...E...H...CXA...h..e.............h...c....a....$
H...E...H.X.C..A.............hXe....h...c....a....$ 

Output 1:
Persia Wins


Input 2:
5
EXXH...XCXXXXXA.....C...hXX...a.....eX.c.....h.$
H......EXH.a...XX..h...e.$
H.........H.E...e....h....c..............$
e.X.X...h.........aXXXXXe.c......$
EXX..C..XXXXXXXE...hX.......a..$

Output 2:
Persia Wins


Input 3:
5
EXXH...XCXXXXXA.....C...hXX...a.....eX.c.....h.$
H......EXH.a...XX..h...e.$
H.........H.E...e....h....c..............$
HX..e.haXXXXXc......$
EXX..C..XXXXXXXE...hX.......a..$

Output 3:
Sparta Wins
