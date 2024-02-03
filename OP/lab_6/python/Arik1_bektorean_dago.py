def bektorean_dago(x,bek):
    i=0
    dago=False
    while i<len(bek):
        if bek[i]==x:
            dago=True
        i=i+1
    return dago

def nagusia():

    bektore1 = [1, 13, 55, 27, 99, 111, 133, 150, 17, 6]
    print("1. kasua: balioa erdian dago")
    print(" bektorean_dago(111, (1, 13, 55, 27, 99, 111, 133, 150, 17, 6))")
    print(" True izan behar da, eta emaitza da: ")
    ema=bektorean_dago(111,bektore1)
    print(ema)
    print("")
    
    bektore1 = [16, 33, 567, 73, 9, 111, 153, 15, 197, 1]
    print("2. kasua: balioa bukaeran dago")
    print(" bektorean_dago(1, (16, 33, 567, 73, 9, 111, 153, 15, 197, 1))")
    print(" True izan behar da, eta emaitza da: ")
    ema=bektorean_dago(1,bektore1)
    print(ema)
    print("")
    
    bektore1 = [19, 3, 556, 72, 91, 11, 1, 15, 817, 199]
    print("3. kasua: balioa ez dago")
    print(" bektorean_dago(45, (19, 3, 556, 72, 91, 11, 1, 15, 817, 199))")
    print(" False izan behar da, eta emaitza da: ")
    ema=bektorean_dago(45,bektore1)
    print(ema)
    print("")
   
    bektore1 = []
    print("4. kasua: ez dago elementurik bektorean")
    print(" bektorean_dago(19, ())")
    print(" False izan behar da, eta emaitza da: ")
    ema=bektorean_dago(19,bektore1)
    print(ema)
    print("")

    bektore1 = [19]
    print("5. kasua: elementu bakarra bektorean eta balioa dago")
    print(" bektorean_dago(19, (19))")
    print(" True izan behar da, eta emaitza da: ")
    ema=bektorean_dago(19,bektore1)
    print(ema)
    print("")

    bektore1 = [2]
    print("6. kasua: elementu bakarra bektorean eta balioa ez dago")
    print(" bektorean_dago(19, (2))")
    print(" False izan behar da, eta emaitza da: ")
    ema=bektorean_dago(19,bektore1)
    print(ema)
    print("")

    bektore1 = [19, 19, 19, 19]
    print("7. kasua: bektorearen elementu guztiak berdinak eta balioaren berdinak")
    print(" bektorean_dago(19, (19, 19, 19, 19))")
    print(" True izan behar da, eta emaitza da: ")
    ema=bektorean_dago(19,bektore1)
    print(ema)
    print("")

    bektore1 = [2, 2, 2, 2, 2]
    print("8. kasua: bektorearen elementu guztiak berdinak eta balioaren desberdinak")
    print(" bektorean_dago(19, (2, 2, 2, 2, 2))")
    print(" False izan behar da, eta emaitza da: ")
    ema=bektorean_dago(19,bektore1)
    print(ema)
    print("")

    
nagusia()
