# 87, 그림 파일 저장용량 계산하기
# r, g, b => 8bit + 8bit + 8bit ==> 24bit, 2^24
# (1024 * 768 * 24bit) / 8 / 1024 / 1024
width, height, bit = map(int, input().split())

byte_result = (width * height * bit) / 8 
kilo_result = byte_result / 1024
mega_result = kilo_result / 1024

print(byte_result)
print(kilo_result)
print(round(mega_result, 2), 'MB')
