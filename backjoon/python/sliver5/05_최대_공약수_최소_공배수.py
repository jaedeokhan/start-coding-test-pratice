n,m = map(int, input().split())
# GCD : The Greatest common denominator
# LCM : The Least common multiple
ori_n = n
ori_m = m
GCD = 1
LCM = 1

while True:

    if n % 2 == 0 and m % 2 == 0:
        n /= 2
        m /= 2
        GCD *= 2
        
    elif n % 3 == 0 and m % 3 == 0:
        n /= 3
        m /= 3
        GCD *= 3
    elif n % 11 == 0 and m % 11 == 0:
        n /= 11
        m /= 11
        GCD *= 11
    else:
        LCM = (ori_n * ori_m) / GCD  
        break

print(GCD)
print(int(LCM))
