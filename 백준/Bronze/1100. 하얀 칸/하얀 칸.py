chess = [input().strip() for _ in range(8)]

print(sum(
    1
    for i in range(8)
    for j in range(8)
    if (i + j) % 2 == 0 and chess[i][j] == 'F'
))