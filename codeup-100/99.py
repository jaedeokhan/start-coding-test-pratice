d=[]
for i in range(19):
  d.append([])
  for j in range(19): 
    d[i].append(0)

print(len(d))

for i in range(len(d)):

    for j in range(len(d)):
        print(d[i][j], end=' ')
    print(i)
    print()
