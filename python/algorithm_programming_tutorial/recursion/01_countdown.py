def countdown(x):
    
    print(x)

    if x <= 1:
        return
    
    countdown(x-1)

countdown(5)
