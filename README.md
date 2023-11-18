# Passicle
Passicle is a password generator that uses a unique key and the name of the account / service you need a password for to generate a password. This means that you only need to remember one key and the name of the account / service to generate a password. This is a lot more secure than using the same password for every account / service you use, and a lot easier than remembering a different password for every account / service you use.

## Privacy
No version of passicle stores any data, and all but the web version can be used online. Passicle uses a one-way algorithm, meaning that your password cannot be reversed into your key.

## Installation
Install with pip:
`pip install passicle`

## Usage
### Import the script
`import passicle`
### Generate a password
`passicle.generate('service', 'key')`