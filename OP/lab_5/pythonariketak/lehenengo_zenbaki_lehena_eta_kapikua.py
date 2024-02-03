def kapikuaDa(num):
    num_str = str(num)
    if num_str == num_str[::-1]:
         return True
    else:
        return False

def lehenaDa(num):
    if num <= 1:
        return False
    if num <= 3:
        return True
    if num % 2 == 0 or num % 3 == 0:
        return False
    i = 5
    while i * i <= num:
        if num % i == 0 or num % (i + 2) == 0:
            return False
        i = i + 1
    return True


def hurrengo_kap_lehena(num):
    num = num + 1
    while True:
        if kapikuaDa(num) and lehenaDa(num):
            return num
        num = num + 1


def proba():
    #1. Proba
    print('Sarrera 1 da, programak 2 bueltatu behar du.')
    emaitza=hurrengo_kap_lehena(1)
    print('Programak %d ematen du.' %emaitza)
    print()
    #2. Proba
    print('Sarrera 7 da, programak 11 bueltatu behar du.')
    emaitza=hurrengo_kap_lehena(7)
    print('Programak %d ematen du.' %emaitza)
    print()
    #3. Proba
    print('Sarrera 32 da, programak 101 bueltatu behar du.')
    emaitza=hurrengo_kap_lehena(32)
    print('Programak %d ematen du.' %emaitza)
    print()
    #4. Proba
    print('Sarrera 453 da, programak 727 bueltatu behar du.')
    emaitza=hurrengo_kap_lehena(453)
    print('Programak %d ematen du.' %emaitza)
    print('')
    
    
proba()
