# Passicle
Passicle is a password generator that uses a unique key and the name of the account / service you need a password for to generate a password. This means that you only need to remember one key and the name of the account / service to generate a password. This is a lot more secure than using the same password for every account / service you use, and a lot easier than remembering a different password for every account / service you use.

## How to use
### v1.X.X
1. Enter your key (a special password that you need to remember) and the name of the account / service you need a password for.
2. Click generate.
3. Copy the generated password and use it for the account / service you entered in step 1.

## Privacy
No version of passicle stores any data, and all but the web version can be used online. Passicle uses a one-way algorithm, meaning that your password cannot be reversed into your key.

## Usage
<details>
<summary>### v1.X.X</summary>
<br>
#### Online (Recommended)
Can be found [here](https://barxilly.github.io/Passicle-Online/).
#### Windows
Can be found [here](https://github.com/barxilly/Passicle/releases).
Download and install, just open the app whenever you want to generate.
#### Python Module
Install with `pip install passicle`, more info [here](https://github.com/barxilly/Passicle-Python)
#### Android
Currently only available as .apk [here](https://github.com/barxilly/Passicle/releases). Coming to Play Store soon.
</details>

## How it works
Passicle uses a custom encryption algorithm to generate passwords. The algorithm ensures that the generated passwords are always the same for the same key and account / service name.
The algorithm is also one-way meaning that it is impossible to decrypt the generated passwords to get the key or account / service name.
