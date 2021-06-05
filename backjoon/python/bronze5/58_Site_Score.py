# 20254번, Site Score
# 문제 : Please write a program to compute the site score of the 2020 Taipei-Hsinchu regional contest.
# 입력 : The input has only one line containing four blank-separated positive integers UR, TR, UO, and TO.
# 출력 : Output the site score of the 2020 Taipei-Hsinchu regional contest.
u_r, t_r, u_o, t_o = map(int, input().split())

print(u_r * 56 + t_r * 24 + u_o * 14 + t_o * 6)
