def dezimaletik_hexadezimalera(zenb):
    hexadezimalak = "0123456789ABCDEF"
    if zenb < 16:
        return hexadezimalak[zenb]
    else:
        hondarra=zenb%16
        zatiketa=zenb//16
        return dezimaletik_hexadezimalera(zatiketa) + hexadezimalak[hondarra]
    

def proba():
    zenb = 1
    hex=dezimaletik_hexadezimalera(zenb)
    print(f"zure zenbakia {zenb} da eta 1 eman beharko luke. Zure programak {hex} itzultzen du.")

    zenb = 15
    hex=dezimaletik_hexadezimalera(zenb)
    print(f"zure zenbakia {zenb} da eta F eman beharko luke. Zure programak {hex} itzultzen du.")

    zenb = 16
    hex=dezimaletik_hexadezimalera(zenb)
    print(f"zure zenbakia {zenb} da eta 10 eman beharko luke. Zure programak {hex} itzultzen du.")

    zenb = 163
    hex=dezimaletik_hexadezimalera(zenb)
    print(f"zure zenbakia {zenb} da eta A3 eman beharko luke. Zure programak {hex} itzultzen du.")

    zenb = 1234567890
    hex=dezimaletik_hexadezimalera(zenb)
    print(f"zure zenbakia {zenb} da eta 499602D2 eman beharko luke. Zure programak {hex} itzultzen du.")

    zenb = -1
    hex=dezimaletik_hexadezimalera(zenb)
    print(f"zure zenbakia {zenb} da eta 80000000 eman beharko luke. Zure programak {hex} itzultzen du.")

proba()