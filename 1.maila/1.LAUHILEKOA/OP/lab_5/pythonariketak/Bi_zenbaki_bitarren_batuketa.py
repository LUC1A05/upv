def bitarrenGehiketa(bitar1, bitar2):
    bitarGehiketa=0
    eramana=0
    pisua = 0
    while bitar1 > 0 or bitar2 >0:
        bitarGehiketa += (bitar1 % 10 + bitar2 % 10 + eramana) % 2 *(10**pisua)
        eramana = (bitar1 % 10 + bitar2 % 10 + eramana) // 2
        bitar1 = bitar1 // 10
        bitar2 = bitar2 // 10
        pisua = pisua + 1
    if eramana == 1:
        bitarGehiketa += (bitar1 % 10 + bitar2 % 10 + eramana) % 2 *(10**pisua)
        
    return bitarGehiketa

def proba():
    bitar1=0
    bitar2=0
    bitarra=bitarrenGehiketa(bitar1,bitar2)
    print("0 + 0 bitarrez 0 da eta zure programaren arabera %d da" % (bitarra))
    
    bitar1=0
    bitar2=1
    bitarra=bitarrenGehiketa(bitar1,bitar2)
    print("0 + 1 bitarrez 1 da eta zure programaren arabera %d da" %(bitarra))

    bitar1=1
    bitar2=0
    bitarra=bitarrenGehiketa(bitar1,bitar2)
    print("1 + 0 bitarrez 1 da eta zure programaren arabera %d da" %(bitarra))

    bitar1=1
    bitar2=1
    bitarra=bitarrenGehiketa(bitar1,bitar2)
    print("1 + 1 bitarrez 10 da eta zure programaren arabera %d da" %(bitarra))

    bitar1=11
    bitar2=11
    bitarra=bitarrenGehiketa(bitar1,bitar2)
    print("11 + 11 bitarrez 110 da eta zure programaren arabera %d da" %(bitarra))

proba()
