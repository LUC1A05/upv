#hasieraketak
zenb = int(input("Sartu osoko zenbaki bat: "))
aux = 0;
kont = 0;

#sortu zenbakia hamartarrez
while(zenb > 0):
    aux = zenb % 10;
    if (aux % 2 != 0):
        kont = kont + 1;
    zenb = zenb // 10;
    
print("Zuk sartutako zenbakiak: ", kont, "digitu bakoiti ditu.")
