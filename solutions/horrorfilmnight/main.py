import sys

def main():
    # Read number of days
    emma = set(map(int, sys.stdin.readline().split()[1:]))
    marcos = set(map(int, sys.stdin.readline().split()[1:]))

    # Sort the days when Emma and Marcos liked films
    days = sorted(emma | marcos)

    e = 0  # Last day a liked film by Emma
    m = 0  # Last day a liked film by Marcos
    b = 0  # Last day a liked film by both

    # Iterate through the days
    for day in days:
        if day in emma and day in marcos:
            b = max(e, m, b) + 1

        elif day in emma:
            m = max(e, b) + 1

        else:
            e = max(m, b) + 1

    print(max(e, m, b))

if __name__ == "__main__":
    main()