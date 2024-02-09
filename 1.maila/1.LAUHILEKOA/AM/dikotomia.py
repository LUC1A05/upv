def funcion(x):
    return x**3-x-1

def biseccion(a, b, tolerancia=1e-6, max_iter=100):
    # a y b son los extremos del intervalo [a, b] donde se busca la raíz
    # tolerancia es la precisión deseada
    # max_iter es el número máximo de iteraciones permitido
    
    if funcion(a) * funcion(b) > 0:
        print("El método de la bisección no es aplicable en este intervalo.")
        return None
    
    iteracion = 0
    while (b - a) / 2 > tolerancia and iteracion < max_iter:
        c = (a + b) / 2
        if funcion(c) == 0:
            break  # Hemos encontrado la raíz exacta
        elif funcion(c) * funcion(a) < 0:
            b = c
        else:
            a = c
        iteracion += 1
    
    raiz = (a + b) / 2
    return raiz

# Ejemplo de uso
intervalo_inicio = 0
intervalo_fin = 3
raiz_aproximada = biseccion(intervalo_inicio, intervalo_fin)

if raiz_aproximada is not None:
    print(f"Una raíz aproximada es: {raiz_aproximada}")
else:
    print("No se encontró una raíz en el intervalo dado.")
