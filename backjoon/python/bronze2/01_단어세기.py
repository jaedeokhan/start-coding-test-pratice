def count_word(sentence):
    if sentence == ' ':
        return 0

    sentence = sentence.strip()
    word_count = sentence.count(' ')
    
    if word_count == 0:
        return 1
    
    return word_count + 1

sentence = input()

print(count_word(sentence))

