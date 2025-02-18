def posizioa_matrizean(mat,zen):
    #sarrera:mat matrize bat
    #aurre: mat gutxienez lerro bat eta zutabe bat ditu zenbaki osokoz beteta
    #irteera: bi osoko posL eta posZ
    #post: zen matrizean badao, posL-k elementu hori dagoen lerroaren balioa izango du 
    #      eta posZ-k zutabearen posizioa. zen hainbat aldiz agertuz gero, lehenengo agerpenako 
    #      balioak itzultzen dira. Ez badago, posZ eta posL biak, -1 balioa izango dute

    lerroKop = 	len(mat)
    zutabeKop = len(mat[0])
    y = 0
    while y < lerroKop:
        x = 0
        while x < zutabeKop:
            if mat[y][x] == zen:
                return y, x
            x = x + 1
        y = y + 1
    return -1, -1
    
    
def nagusia():
    zutabeak=[None]*9
    matrizea=[zutabeak]*10
    
    #elementua hasieran dago
    print("Matrizea honakoa da: ")
    matrizea[0]=[1,2,3,4,5,6,7,8,9]
    matrizea[1]=[11,12,13,14,15,16,17,18,19]
    matrizea[2]=[21,22,23,24,25,26,27,28,29]
    matrizea[3]=[31,32,33,34,35,36,37,38,39]
    matrizea[4]=[41,2,3,4,55,6,7,8,9]
    matrizea[5]=[51,2,3,4,5,67,7,8,9]
    matrizea[6]=[61,2,3,4,5,6,79,8,9]
    matrizea[7]=[71,2,3,4,5,6,7,83,9]
    matrizea[8]=[81,2,3,4,5,6,73,8,93]
    matrizea[9]=[91,2,3,4,5,6,7,85,93]
    for lerroa in range(0,10):
        print(matrizea[lerroa])
    print("posizioa_matrizean(matrizea,1)  itzuli beharko luke: (0,0)")
    print("eta emaitza honako da:")
    ema=posizioa_matrizean(matrizea,1)
    print(ema)
    
    #elementua matrizearen erdian dago
    print("Matrizea honakoa da: ")
    matrizea[0]=[1,2,3,4,5,6,7,8,9]
    matrizea[1]=[11,12,13,14,15,16,17,18,19]
    matrizea[2]=[21,22,23,24,25,26,27,28,29]
    matrizea[3]=[31,32,33,34,35,36,37,38,39]
    matrizea[4]=[41,2,3,4,55,6,7,8,9]
    matrizea[5]=[51,2,3,4,5,67,7,8,9]
    matrizea[6]=[61,2,3,4,5,6,79,8,9]
    matrizea[7]=[71,2,3,4,5,6,7,83,9]
    matrizea[8]=[81,2,3,4,5,6,73,8,93]
    matrizea[9]=[91,2,3,4,5,6,7,85,93]
    for lerroa in range(0,10):
        print(matrizea[lerroa])
    print("posizioa_matrizean(matrizea,21)  itzuli beharko luke: (2,0)")
    print("eta emaitza honako da:")
    ema=posizioa_matrizean(matrizea,21)
    print(ema)
    
    #elementua bukaeran dago
    print("Matrizea honakoa da: ")
    matrizea[0]=[1,2,3,4,5,6,7,8,9]
    matrizea[1]=[11,12,13,14,15,16,17,18,19]
    matrizea[2]=[21,22,23,24,25,26,27,28,29]
    matrizea[3]=[31,32,33,34,35,36,37,38,39]
    matrizea[4]=[41,2,3,4,55,6,7,8,9]
    matrizea[5]=[51,2,3,4,5,67,7,8,9]
    matrizea[6]=[61,2,3,4,5,6,79,8,9]
    matrizea[7]=[71,2,3,4,5,6,7,83,9]
    matrizea[8]=[81,2,3,4,5,6,73,8,93]
    matrizea[9]=[91,2,3,4,5,6,7,85,100]
    for lerroa in range(0,10):
        print(matrizea[lerroa])
        
    print("posizioa_matrizean(matrizea,100)  itzuli beharko luke (9,8)")
    print("eta emaitza honako da:")
    ema=posizioa_matrizean(matrizea,100)
    print (ema)
    
    #elementua ez dago
    print("Matrizea honakoa da: ")
    matrizea[0]=[1,2,3,4,5,6,7,8,9]
    matrizea[1]=[11,12,13,14,15,16,17,18,19]
    matrizea[2]=[21,22,23,24,25,26,27,28,29]
    matrizea[3]=[31,32,33,34,35,36,37,38,39]
    matrizea[4]=[41,2,3,4,55,6,7,8,9]
    matrizea[5]=[51,2,3,4,5,67,7,8,9]
    matrizea[6]=[61,2,3,4,5,6,79,8,9]
    matrizea[7]=[71,2,3,4,5,6,7,83,9]
    matrizea[8]=[81,2,3,4,5,6,73,8,93]
    matrizea[9]=[91,2,3,4,5,6,7,85,93]
    for lerroa in range(0,10):
        print(matrizea[lerroa])
        
    print("posizioa_matrizean(matrizea,200)  itzuli beharko luke (-1,-1)")
    print("eta emaitza honako da:")
    ema=posizioa_matrizean(matrizea,200)
    print(ema)

    #matrizea hustik dago
    print("Matrizea honakoa da: ")
    matrizea[0]=[]
    matrizea[1]=[]
    matrizea[2]=[]
    matrizea[3]=[]
    matrizea[4]=[]
    matrizea[5]=[]
    matrizea[6]=[]
    matrizea[7]=[]
    matrizea[8]=[]
    matrizea[9]=[]
    for lerroa in range(0,10):
        print(matrizea[lerroa])
        
    print("posizioa_matrizean(matrizea,200)  itzuli beharko luke (-1,-1)")
    print("eta emaitza honako da:")
    ema=posizioa_matrizean(matrizea,200)
    print(ema)

    # proba kasuak falta dira
  
nagusia()
