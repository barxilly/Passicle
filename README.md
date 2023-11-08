# Passicle
Passicle is a password generator that uses a unique key and the name of the account / service you need a password for to generate a password. This means that you only need to remember one key and the name of the account / service to generate a password. This is a lot more secure than using the same password for every account / service you use, and a lot easier than remembering a different password for every account / service you use.

## Usage
### Passicle Online
Passicle Online is a web version of Passicle that can be used to generate passwords. It can be found [here](https://barxilly.github.io/Passicle-Online/).
### Passicle WinForms (Windows)
Passicle WinForms is a Windows application that can be used to generate passwords. It can be found [here](https://github.com/barxilly/Passicle/releases).

## How it works
Passicle uses a custom encryption algorithm to generate passwords. The algorithm ensures that the generated passwords are always the same for the same key and account / service name.
The algorithm is also one-way meaning that it is impossible to decrypt the generated passwords to get the key or account / service name.