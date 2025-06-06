numberOfCases = int(input())
minimalDistance = []

# Calculates minimal distance for walking to all store from parking spot and back
for _ in range(numberOfCases):
    numberOfStores = int(input())
    storePositions = list(map(int, input().split()))

    # Sort the store positions
    storePositions.sort()

    # Find the minimum and maximum positions of the stores
    min = storePositions[0]
    max = storePositions[numberOfStores-1]

    # The minimal distance is twice the distance between the furthest stores
    minimal_distance = (max - min) * 2
    minimalDistance.append(minimal_distance)

for distance in minimalDistance:
    print(distance)