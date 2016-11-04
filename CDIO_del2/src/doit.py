file = open('ud.txt', 'w')

spaces = ['Tower', 'Crater', 'PalaceGates', 'ColdDesert', 'WalledCity', 'Monastery', 'BlackCave', 'HutsInTheMountain', 'TheWerewall', 'ThePit', 'Goldmine']

for space in spaces:
	file.write(space.upper()+'NAME = '+space+'\n')
	file.write(space.upper()+'DESC = A '+space+'\n')
	file.write(space.upper()+'ONLAND = You land on '+space+'\n')
	
file.close()