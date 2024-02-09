def zerrenda_idatzi(Z):
    print("[ ", end="")
    for i in range(0,len(Z)):
        print(str(Z[i]) + " ", end="")        
    print("]", end="")
    
def kalkulatu_anplitude_max (Zerrenda): 
# aurre:  Zerrendak gutxienez bi elementu izango ditu eta azpizerrenda gorakor batekin hasiko da.
# Post: Emaitza, segmentu luzeenaren luzera izango da. Ez badago segmenturik orduan 0 izango da emaitza
    maximoa=0
    pos=1
    anplitudea=0
    gorakorra=True
    if len(Zerrenda)<2 or Zerrenda[0]>Zerrenda[1]:
        return 0
    while pos < len(Zerrenda):
        if gorakorra:
            if Zerrenda[pos] > Zerrenda[pos-1]:
                anplitudea +=1
            elif Zerrenda[pos] < Zerrenda[pos-1]:
                anplitudea += 1
                gorakorra=False
        else:
            if Zerrenda[pos] < Zerrenda[pos-1]:
                anplitudea +=1
                if pos==len(Zerrenda)-1:
                    anplitudea +=1
                    if anplitudea>maximoa:
                        maximoa=anplitudea
            elif Zerrenda[pos] > Zerrenda[pos-1]:
                anplitudea +=1
                if anplitudea > maximoa:
                    maximoa=anplitudea
                anplitudea=0
                gorakorra=True
                pos = pos-1
        pos +=1
    return(maximoa)
   

def kalkulatu_anplitude_max_proba(): 
   # Programa honek kalkulatu_anplitude_max funtzioari deia egiten dio eta bere portaera egokia den ala ez aztertuko da

    Z = [12, 16]
   
    print("Proba 1: bakarrik gorakorra, bi elementukin")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 0 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()

    Z = [1,2,3,4,3,2,1,2,3,4,5,6,3,2,1,2,3,2]
   
    print("Proba 2: hainbat elementuetako zerrenda")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 9 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()

    Z = [5,4,3,2,1]
   
    print("Proba 3: beherakorra")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 0 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()

    Z = [5,5,5,5,5,5]
   
    print("Proba 4: zenbaki berdina")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 0 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()
   
    Z = [1,2,3,2,1,2,3,4,3,2,1,2,3,2,1,2,3,4,3,2,1]
   
    print("Proba 5: hainbat aukera")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 7 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()

    Z = []
   
    print("Proba 6: Zerrenda hutsik dago")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 0 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()

    Z = [5]
   
    print("Proba 7: Zerrendan zenbaki bakarra dago")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 0 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()

    Z = [1,2,3,4,5,4,3]
   
    print("Proba 8: Segmentu bakarra")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 7 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()

    Z = [5,4,3,2,1,2,3,4]
   
    print("Proba 9: beherakorra eta gero gorakorra")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 0 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()

    Z = [1,2,3,2,1,2,1]
   
    print("Proba 10: anplitude max hasieran")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 5 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()

    Z = [1,2,1,2,3,2,1]
   
    print("Proba 11: anplitude max amaieran")
    print("Sarrera honakoa da ", end="")
    zerrenda_idatzi(Z)
    print(". Emaitza 5 izan beharko luke eta zure programak dio: ")
    print(kalkulatu_anplitude_max(Z))
    print()
   
kalkulatu_anplitude_max_proba()

