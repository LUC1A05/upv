def bektorea_idatzi(B):
#Sarrera: osokoen array bat
#Aurre:-
#Irteera: pantailatik arrayaren elementuak erakusten dira
#Post:
    for i in B:
        print(i, end=' ')

def eskuinera_mugitu(B):
#Sarrera: osokoen array bat
#Aurre:-
#Irteera: osokoen array bat
#Post: irteerako arrayak sarrerako arrayaren elementuak ditu, baina poszio bat eskuinera mugituta
    i=0
    while i < len(B)-1:
        aux = B[i+1]
        B[i+1]=B[0]
        B[0] = aux
        i=i+1
    return B
   
def nagusia(): 
    #hasieratu
    bektorea1=[1,2,3,4,5,6,7,8,9,10]
 
    print("10 elementutako bektore bat: \n [1,2,3,4,5,6,7,8,9,10]")
    print(" Hasierako elementuak honakoak dira: ")
    bektorea_idatzi(bektorea1)

    print(" elementuak mugitzean, emaitza honakoa da: ")
    bektorea1 = eskuinera_mugitu(bektorea1)
    bektorea_idatzi(bektorea1)
    
    bektorea1=[1,2,3,4,5,6,7,8,9,10,11]
 
    print("10 elementutako bektore bat: \n [1,2,3,4,5,6,7,8,9,10,11]")
    print(" Hasierako elementuak honakoak dira: ")
    bektorea_idatzi(bektorea1)

    print(" elementuak mugitzean, emaitza honakoa da: ")
    bektorea1 = eskuinera_mugitu(bektorea1)
    bektorea_idatzi(bektorea1)

    bektorea1=[1,2]
 
    print("10 elementutako bektore bat: \n [1,2]")
    print(" Hasierako elementuak honakoak dira: ")
    bektorea_idatzi(bektorea1)

    print(" elementuak mugitzean, emaitza honakoa da: ")
    bektorea1 = eskuinera_mugitu(bektorea1)
    bektorea_idatzi(bektorea1)
    
nagusia()
