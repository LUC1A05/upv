def posizioan_dago(x,bek):
    i=0
    while i<len(bek):
        if bek[i]==x:
            return i+1
        i = i +1
    return -1
    
def nagusia():
    bektore1 = [1, 3, 5, 17, 9, 11, 131, 15, 170, 19]
    print("1. kasua: balioa erdian dago")
    print(" posizioan_dago(131, (1, 3, 5, 17, 9, 11, 131, 15, 170, 19))")
    print(" 7 izan behar da, eta emaitza da: ")

    posi=posizioan_dago(131,bektore1)
    if (posi != -1):
        print("131 zenbakia " +str(posi)+" posizioan dago")
    else:
        print("Zenbakia ez dago")
    print("")

    bektore1 = [1, 3, 5, 17, 9, 11, 131, 15, 170, 19]
    print("2. kasua: balioa bukaeran dago")
    print(" posizioan_dago(19, (1, 3, 5, 17, 9, 11, 131, 15, 170, 19))")
    print(" 10 izan behar da, eta emaitza da: ")
    posi=posizioan_dago(19,bektore1)
    if (posi != -1):
        print("19 zenbakia " +str(posi)+" posizioan dago")
    else:
        print("Zenbakia ez dago")
    print("")

    bektore1 = [1, 3, 5, 17, 9, 11, 131, 15, 170, 19]
    print("3. kasua: balioa ez dago")
    print(" posizioan_dago(1912, (1, 3, 5, 17, 9, 11, 131, 15, 170, 19))")
    print(" Zenbakia ez dagoela agertu behar da, eta emaitza da: ")
    posi=posizioan_dago(1912,bektore1)
    if (posi != -1):
        print("1912 zenbakia " +str(posi)+" posizioan dago")
    else:
        print("Zenbakia ez dago")
    print("")

    bektore1 = [1, 3, 5, 17, 9, 11, 131, 15, 170, 19]
    print("4. kasua: balioa hasieran dago")
    print(" posizioan_dago(1, (1, 3, 5, 17, 9, 11, 131, 15, 170, 19))")
    print(" 1 izan behar da, eta emaitza da: ")
    posi=posizioan_dago(1,bektore1)
    if (posi != -1):
        print("1912 zenbakia " +str(posi)+" posizioan dago")
    else:
        print("Zenbakia ez dago")
    print("")

    bektore1 = []
    print("5. kasua: bektorea hutsik dago")
    print(" posizioan_dago(1912, ())")
    print(" Zenbakia ez dagoela agertu behar da, eta emaitza da: ")
    posi=posizioan_dago(1912,bektore1)
    if (posi != -1):
        print("1912 zenbakia " +str(posi)+" posizioan dago")
    else:
        print("Zenbakia ez dago")
    print("")
    
nagusia()
