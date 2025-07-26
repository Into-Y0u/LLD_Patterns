#!/bin/bash

# Check if the user provided a Java file as input
if [ "$#" -ne 1 ]; then
    echo "Usage: $0 <JavaFile>"
    exit 1
fi

# Extract the Java file name from the command line argument
java_file="$1"

# Check if the Java file exists
if [ ! -f "$java_file" ]; then
    echo "Error: Java file '$java_file' not found."
    exit 1
fi

# Extract the file name without the extension
file_name=$(basename "$java_file" .java)

# Compile the Java file and store the class files in a folder named "output"
javac -d classes "$java_file"

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful. Class files are stored in the 'output' folder."
else
    echo "Compilation failed."
fi
