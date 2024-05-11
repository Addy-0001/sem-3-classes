import random

players = [
    "Bhujel",
    "Kafle",
    "Sujan",
    "Adamya",
    "Aavash",
    "Poddar",
    "Rohan",
    "Subhayu",
    "Abhisek",
    "Aayash",
    "Rishan dai",
]

Team1 = ["Salin",]
Team2 = ["Rasailee", ]
temp = 0
count = 9
player = ""
for i in range(len(players)):
    if (len(Team1) <= 5):
        temp1 = random.randint(0, count)
        player = players.pop(temp1)
        Team1.append(player)

    elif (len(Team2) <= 5):
        temp2 = random.randint(0, count)
        player = players.pop(temp2)
        Team2.append(player)

    count = count - 1
print(Team1, "vs.", Team2)

