def bektorea_idatzi(bek):
	for i in bek:
            print(i, end=' ')


def bulbuila_bidezko_ordenazioa(bek):
    zenpas=len(bek)-1
    for i in range(zenpas):
        aldaketa =False
        for j in range(0, zenpas-i):
            if bek[j] > bek[j+1]:
                aux=bek[j]
                bek[j]=bek[j+1]
                bek[j+1]=aux  
                aldaketa=True
        if not aldaketa:
             break
    return(bek)

def nagusia():
    #Kasua 1 
     bektorea1 = [9, 5, 3, 4, 10, 8, 13, 24, 15, 11]
     
     print("Hasierako bektorea (9,5,3,4,10,8,13,24,15,11):")
     bektorea_idatzi(bektorea1)

     bektorea1=bulbuila_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (3,4,5,8,9,10,11,13,15,24) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #Kasua 2 
     bektorea1 = [1,2,3,4,5,6,7,8,9]
     
     print("Hasierako bektorea (1,2,3,4,5,6,7,8,9):")
     bektorea_idatzi(bektorea1)

     bektorea1=bulbuila_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (1,2,3,4,5,6,7,8,9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #Kasua 3 
     bektorea1 = []
     
     print("Hasierako bektorea ():")
     bektorea_idatzi(bektorea1)

     bektorea1=bulbuila_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke () eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #Kasua 4 
     bektorea1 = [3,2,3,4,4,6,7,9,9]
     
     print("Hasierako bektorea (3,2,3,4,4,6,7,9,9):")
     bektorea_idatzi(bektorea1)

     bektorea1=bulbuila_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (2,3,3,4,4,6,7,9,9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #Kasua 5 
     bektorea1 = [9,8,7,6,5,4,3,2,1]
     
     print("Hasierako bektorea (9,8,7,6,5,4,3,2,1):")
     bektorea_idatzi(bektorea1)

     bektorea1=bulbuila_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (1,2,3,4,5,6,7,8,9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #Kasua 6 
     bektorea1 = [9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1]
     
     print("Hasierako bektorea (9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1):")
     bektorea_idatzi(bektorea1)

     bektorea1=bulbuila_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 3 3 3 3 4 4 4 4 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 5 5 5 6 6 6 6 6 6 6 6 6 6 6 7 7 7 7 7 7 7 7 7 7 7 8 8 8 8 8 8 8 8 8 8 8 9 9 9 9 9 9 9 9 9 9 9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     #Kasua 7 
     bektorea1 = [9]
     
     print("Hasierako bektorea (9):")
     bektorea_idatzi(bektorea1)

     bektorea1=bulbuila_bidezko_ordenazioa(bektorea1)
     print("Bukaerako bektorea honako beharko luke (9) eta emaitza:")
     bektorea_idatzi(bektorea1)
     print("\n")

     # Proba kasuak falta dira
        
nagusia()
