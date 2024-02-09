def bektorea_idatzi(bek):
	for i in bek:
		print(i, end=' ')

def trukatu(bek,posA,posB):
    aux=bek[posA]
    bek[posA]=bek[posB]
    bek[posB]=aux
    return(bek)

def bilatu_minimoaren_posizioa(bek,hasieraPos):
#Aurre:	  0 <= hasieraPos < len(bek)
#Post:    minPos-en balio minimoa duen elementuaren posizioa jasotzen du, 
#         hasieraPos eta len(bek) artekoak
    minPos=hasieraPos
    while hasieraPos < len(bek)-1:
        if bek[minPos] >bek[hasieraPos]:
                minPos=hasieraPos
        hasieraPos+=1
        

    return(minPos)

def hautaketa_bidezko_ordenazioa(bek):
    pos=0
    while pos <len(bek):
          min=bilatu_minimoaren_posizioa(bek,pos)
          trukatu(bek,pos,min)
          pos+=1
    
    return(bek)

def nagusia():
     #1. kasua
     bektorea1 = [9, 5, 3, 4, 10, 8, 13, 24, 15, 11]
     
     print("Hasierako bektorea: (9,5,3,4,10,8,13,24,15,11):")
     bektorea_idatzi(bektorea1)

     bektorea1=hautaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honakoa beharko luke (3,4,5,8,9,10,11,13,15,24) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #2. kasua
     bektorea1 = [1,2,3,4,5,6,7,8,9]
     
     print("Hasierako bektorea: (1,2,3,4,5,6,7,8,9):")
     bektorea_idatzi(bektorea1)

     bektorea1=hautaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honakoa beharko luke (1,2,3,4,5,6,7,8,9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #3. kasua
     bektorea1 = []
     
     print("Hasierako bektorea: ():")
     bektorea_idatzi(bektorea1)

     bektorea1=hautaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honakoa beharko luke () eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #4. kasua
     bektorea1 = [3,2,3,4,4,6,7,9,9]
     
     print("Hasierako bektorea: (3,2,3,4,4,6,7,9,9):")
     bektorea_idatzi(bektorea1)

     bektorea1=hautaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honakoa beharko luke (2,3,3,4,4,6,7,9,9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #5. kasua
     bektorea1 = [9,8,7,6,5,4,3,2,1]
     
     print("Hasierako bektorea: (9,8,7,6,5,4,3,2,1):")
     bektorea_idatzi(bektorea1)

     bektorea1=hautaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honakoa beharko luke (1,2,3,4,5,6,7,8,9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #6. kasua
     bektorea1 = [9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1]
     
     print("Hasierako bektorea: (9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1):")
     bektorea_idatzi(bektorea1)

     bektorea1=hautaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honakoa beharko luke (1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 8 8 8 8 9 9 9 9 9 9 9 9 9 9 9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #7. kasua
     bektorea1 = [1]
     
     print("Hasierako bektorea: (1):")
     bektorea_idatzi(bektorea1)

     bektorea1=hautaketa_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honakoa beharko luke (1) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

        
nagusia()
