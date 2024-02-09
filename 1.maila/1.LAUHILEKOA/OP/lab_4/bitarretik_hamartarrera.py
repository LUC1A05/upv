#hasieraketak
num=int(input("Sartu zenbaki bat bitarrez eta 1ekin hasten dena"))
aux = 0;
ham = 0;
kont = 0;

#sortu zenbakia hamartarrez
while(num >= 1):
    aux = num % 10;
    ham = ham + aux*(2**kont);
    kont = kont + 1;
    num = num // 10;
print("Zenbakia hamartarrez honakoa da: ", ham)