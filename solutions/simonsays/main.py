commands = int(input())

# Store commands in a list
commands_list = []

for _ in range(commands):
    command  = input().strip()

    if command.startswith("Simon says"):

        # Extract the command after "Simon says" and add to list
        commands_list.append(command[11:])

# Print commands
for command in commands_list:
    print(command)