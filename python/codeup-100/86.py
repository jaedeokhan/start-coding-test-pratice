# 86, 소리 파일 저장용량 계산하기
# 저장용량 = (hz * bit * stereo * sec) / 8 / 1024 / 1024
hz, bit, stereo, sec = map(int, input().split())

result = (hz * bit * stereo * sec) / 8 / 1024 / 1024

print('%.1f MB'%result)
