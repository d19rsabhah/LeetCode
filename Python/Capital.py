str = "python is a good language"

words = str.split()

Capitalize = [word[:-1] + word[-1].upper() for word in words]

ans = ' '.join(Capitalize)

print(ans)   # Output : pythoN iS A gooD languagE
