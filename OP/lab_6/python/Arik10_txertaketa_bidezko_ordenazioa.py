def bektorea_idatzi(bek):
	for i in bek:
		print(i, end=' ')

def mugitu_posizio_bat_eskuinera(bek,unekoPos,hasieraPos):
    while hasieraPos > unekoPos:
          aux=bek[hasieraPos]
          bek[hasieraPos] = bek[hasieraPos-1]
          bek[hasieraPos-1]=aux
          hasieraPos -=1

    return(bek)


def bilatu_txertatze_posizioa(bek,unekoPos,hasieraPos):
    while bek[hasieraPos] < bek[unekoPos-1] and unekoPos-1 >=0:
          unekoPos -=1
        
    return(unekoPos)

def txertaketa_bidezko_ordenazioa(bek):
    hasieraPos=1
    while hasieraPos < len(bek):
        unekoPos=bilatu_txertatze_posizioa(bek,hasieraPos,hasieraPos)
        bek=mugitu_posizio_bat_eskuinera(bek,unekoPos,hasieraPos)
        hasieraPos +=1
			
    return(bek)

def nagusia():
     #1. kasua
     bektorea1 = [9, 5, 3, 4, 10, 8, 13, 24, 15, 11]
     
     print("Hasierako bektorea: (9,5,3,4,10,8,13,24,15,11):")
     bektorea_idatzi(bektorea1)

     bektorea1=txertaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (3,4,5,8,9,10,11,13,15,24) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

    #2. kasua: bektorea ordenean dago.
     bektorea1 = [1,2,3,4,5,6,7,8,9]
     
     print("Hasierako bektorea: (1,2,3,4,5,6,7,8,9):")
     bektorea_idatzi(bektorea1)

     bektorea1=txertaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (1,2,3,4,5,6,7,8,9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #3. kasua: bektorea hutsik dago.
     bektorea1 = []
     
     print("Hasierako bektorea: ():")
     bektorea_idatzi(bektorea1)

     bektorea1=txertaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke () eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #4. kasua: bektorean elementuak errepikatzen dira.
     bektorea1 = [3,2,3,4,4,6,7,9,9]
     
     print("Hasierako bektorea: (3,2,3,4,4,6,7,9,9):")
     bektorea_idatzi(bektorea1)

     bektorea1=txertaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (2,3,3,4,4,6,7,9,9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

    #5. kasua: bektorearen azken elementua txikiena.
     bektorea1 = [9,8,7,6,5,4,3,2,1]
     
     print("Hasierako bektorea: (9,8,7,6,5,4,3,2,1):")
     bektorea_idatzi(bektorea1)

     bektorea1=txertaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (1,2,3,4,5,6,7,8,9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #6. kasua: bektore oso handia.
     bektorea1 = [9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1]
     
     print("Hasierako bektorea: (9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1):")
     bektorea_idatzi(bektorea1)

     bektorea1=txertaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 8 8 8 8 9 9 9 9 9 9 9 9 9 9 9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #7. kasua: bektore txikia.
     bektorea1 = [9]
     
     print("Hasierako bektorea: (9):")
     bektorea_idatzi(bektorea1)

     bektorea1=txertaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     # Proba kasuak falta dira

nagusia()