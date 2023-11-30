# Passicle
Passicle is a password generator that uses a unique key and the name of the account / service you need a password for to generate a password. This means that you only need to remember one key and the name of the account / service to generate a password. This is a lot more secure than using the same password for every account / service you use, and a lot easier than remembering a different password for every account / service you use.

## How to use
<details>
<summary><h3>v1.X.X</h3></summary>
<ol>
    <li>Input the name of the account / service you need a password for.</li>
    <li>Input your key (a key is a password that is used, along with the account / service name, to generate a password).</li>
    <li>Click the generate button.</li>
    <li>Copy the generated password and log in or sign up to the account / service you need a password for.</li>
</ol>
</details>

## Versions
<details>
<summary><h3>v1.X.X</h3></summary>
<p>Passicle v1 is the original version of Passicle. It is available as a Windows app, a Python module, and an Android app.</p>
<p>The encryption algorithm used in v1 is quite secure, but can generate passwords that are too short, or do not contain enough special characters for some services.</p>
</details>
<details>
<summary><h3>v2 Alpha</h3></summary>
<p>The v2 Alpha is the next version of Passicle. It is not yet available in its compiled form, but feel free to dig about in the source code.</p>
<p>The encryption algorithm used in v2 will be a lot more secure, and will be able to generate passwords of any length, and with any amount of special characters.</p>
<p>I also have plans to integrate a password manager into v2 Alpha, and passkey integration.</p>
<p>If all goes well, v2 will be released in early 2024, with versions for Web, Windows, Linux, and Android.</p>
<p><sup>I did have plans to release an iOS version, but Apple requires a $99/year subscription to release apps on the App Store, so I will not be releasing an iOS version.</sup></p>
<p>While this is all sunshine and rainbows, I do have to make it clear that <strong>passwords generated with v1 will not be compatible with v2</strong>. This is because the encryption algorithm used in v2 Alpha is completely different to the one used in v1.X.X.</p>
</details>

## Privacy
No version of passicle stores any data, and all but the web version can be used online. Passicle uses a one-way algorithm, meaning that your password cannot be reversed into your key.

## Installation
<details>
<summary><h3>v1.X.X</h3></summary>
<ul>
    <li><h4>Online (Recommended)</h4><p>Can be found <a href="https://barxilly.github.io/Passicle-Online/">here</a>.</p></li>
    <li><h4>Windows</h4><p>Can be found <a href="https://github.com/barxilly/Passicle/releases">here</a>.<br>Download and install, just open the app whenever you want to generate.</p></li>
    <li><h4>Python Module</h4><p>Install with <code>pip install passicle</code>, more info <a href="https://github.com/barxilly/Passicle-Python">here</a></p></li>
    <li><h4>Android</h4><p>Currently only available as .apk <a href="https://github.com/barxilly/Passicle/releases">here</a>. Coming to Play Store soon.</p></li>
</ul>
</details>

## How it works
Passicle uses a custom encryption algorithm to generate passwords. The algorithm ensures that the generated passwords are always the same for the same key and account / service name.
The algorithm is also one-way meaning that it is impossible to decrypt the generated passwords to get the key or account / service name.
