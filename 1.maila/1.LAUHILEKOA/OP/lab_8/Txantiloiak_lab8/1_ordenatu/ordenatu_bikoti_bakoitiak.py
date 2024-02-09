def bektorea_idatzi(bek):
	print(bek)   


def ordenatu_bikoiti_bakoitiak(bek):
    i=0
    j=len(bek)-1
    while i < j:
        if bek[i] % 2 != 0:
            aux=bek[i]
            bek[i]=bek[j]
            bek[j]=aux
            j-=1
        else:
            i+=1
    return(bek)

def nagusia():
    #Caso 1 
     bektorea1 = [10, 3, 13, 4, 6, 3, 5, 2, 9, 7, 8, 18, 12, 2]
     
     print("Hasierako bektorea: (10,3,13,4,6,3,5,2,9,7,8,18,12,2):")
     bektorea_idatzi(bektorea1)

     bektorea1=ordenatu_bikoiti_bakoitiak(bektorea1)
     print("Bukaerako bektorea honakoa beharko luke (10,4,6,2,8,18,12,2, 3,13,3,5,9,7)")
     print("Bikoitien arteko eta bakoitien arteko barneko ORDNEA KONTUAN HARTU GABE");
     print("eta emaitza da:")
     bektorea_idatzi(bektorea1)
        
nagusia()
