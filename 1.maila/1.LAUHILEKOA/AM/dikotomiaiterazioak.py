def funtzioa(x):
    return x**3-x-1

def dikotomia(a, b, max_iter):
    
    if funtzioa(a) * funtzioa(b) > 0:
        print("Ezin da metodoa aplikatu.")
        return None
    
    iterazioa = 0
    while iterazioa < max_iter:
        c = (a + b) / 2
        if funtzioa(c) == 0:
            break
        elif funtzioa(c) * funtzioa(a) < 0:
            b = c
        else:
            a = c
        iterazioa += 1
    
    erroa = (a + b) / 2
    return erroa

intervalo_inicio = float(input("sartu tartearen hasiera: "))
intervalo_fin = float(input("sartu tartearen amaiera: "))
max_iter = int(input("sartu iterazio kopurua: "))
max_iter = max_iter-1
raiz_aproximada = dikotomia(intervalo_inicio, intervalo_fin, max_iter)

if raiz_aproximada is not None:
    print(f"Erantzuna: {raiz_aproximada}")
else:
    print("Ezin da erantzuna lortu.")