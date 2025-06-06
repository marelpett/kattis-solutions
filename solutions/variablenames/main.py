variables = int(input()) # Number of variables
taken_variables = set() # Set to keep track of taken variable names

variable_multiplier = {} # Dictionary to keep track of latest multipliers for each variable

# Read each variable name and calculate its replacement if taken
for _ in range(variables):
    input_variable = int(input())

    # Check if the variable has been seen before
    multiplier = variable_multiplier.get(input_variable, 1)

    # Calculate replacemant by multiplying the input variable
    replace_variable = input_variable * multiplier

    # If replacement is taken, increment multiplier until a non-taken variable is found
    while replace_variable in taken_variables:
        multiplier += 1
        replace_variable = input_variable * multiplier

    # Add the replacement to the list of taken variables    
    taken_variables.add(replace_variable)

    # Print the replacement
    print(replace_variable)

    # Update the multiplier for the next input variable
    variable_multiplier[input_variable] = multiplier + 1
