def inverse(a,m):
    d = pow(a, -1, m)
    return d

def desencription(c,d,n):
    m=pow(c,d,n)
    return m

def ind(num):
    if num < 0:
        return num+26
    else:
        return num

def code():
    p = 17
    q = 23
    e = 13

    n = p * q

    phi = (p - 1) * (q - 1)
    s=str(input("insert the code given between spaces, to separate words write . between spaces: "))
    num_str=s.split()
    d=inverse(e,phi)
    for num in num_str:
        if num == ".":
            print(" ", end="")
        else:
            numin=int(num)
            an=desencription(numin, d, n)
            v="abcdefghijklmnopqrstuvwxyz"
            s=an-4
            index=ind(s)
            try:
                print(v[index], end="")
            except IndexError:
                print("\nHas introducido mal el código")
                return 

code()