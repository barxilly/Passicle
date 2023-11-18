# Passicle's Algorithm

## The Algorithm
To generate a password Passicle:
 - Takes the service name and the key as input
 - Defines 2 lists of characters (both of which have been randomised, but stay the same in the program)
 - Then for every character in the service name:
    - Gets the character as a char (char c = service_name.charAt(i))
    - Gets the index of the character in the first list (int index = list1.indexOf(c))
    - Gets the character at the index of the key (char k = key.charAt(index % key.length()))
    - Gets the index of the key character in the first list (int index2 = list1.indexOf(k))
    - Get the new index by adding the index of the character and the index of the key character ((index + index2 + i) % list1.length)
    - If the i is even, get the character at the new index in the first list (char newChar = list1.charAt(newIndex))
    - If the i is odd, get the character at the new index in the second list (char newChar = list2.charAt(newIndex))
    - Append the new character to the password (password += newChar)
 - Then add the character with the length of the key in the first list to the password (password += list1.charAt(key.length()))
 - Then add the character with the length of the service name in the first list to the password (password += list1.charAt(service_name.length()))
 - Then Add the character with the length of the sum of both in the first list to the password (password += list1.charAt(service_name.length() + key.length()))
 - Add the character with the length of the password in the first list to the password (password += list1.charAt(password.length()))
 - Return the password

### Non-reversibility
One security feature of using this algorithm is that it is non-reversible without the key, even if you fully understand the algorithm. This is because the algorithm uses the key to generate the password, and without the key, you cannot generate the password. This means that if someone gets access to your password, they cannot reverse engineer the algorithm to get the key, and therefore cannot get access to your other passwords.

## Code
### JS
function passicle(service_name, key) {
    var list1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~";
    var list2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~";
    var password = "";
    for (var i = 0; i < service_name.length; i++) {
        var c = service_name.charAt(i);
        var index = list1.indexOf(c);
        var k = key.charAt(index % key.length);
        var index2 = list1.indexOf(k);
        var newIndex = (index + index2 + i) % list1.length;
        var newChar = "";
        if (i % 2 == 0) {
            newChar = list1.charAt(newIndex);
        } else {
            newChar = list2.charAt(newIndex);
        }
        password += newChar;
    }
    password += list1.charAt(key.length);
    password += list1.charAt(service_name.length);
    password += list1.charAt(service_name.length + key.length);
    password += list1.charAt(password.length);
    return password;
}

### Java
public static String passicle(String service_name, String key) {
    String list1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~";
    String list2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~";
    String password = "";
    for (int i = 0; i < service_name.length(); i++) {
        char c = service_name.charAt(i);
        int index = list1.indexOf(c);
        char k = key.charAt(index % key.length());
        int index2 = list1.indexOf(k);
        int newIndex = (index + index2 + i) % list1.length();
        char newChar = ' ';
        if (i % 2 == 0) {
            newChar = list1.charAt(newIndex);
        } else {
            newChar = list2.charAt(newIndex);
        }
        password += newChar;
    }
    password += list1.charAt(key.length());
    password += list1.charAt(service_name.length());
    password += list1.charAt(service_name.length() + key.length());
    password += list1.charAt(password.length());
    return password;
}

### Python
def passicle(service_name, key):
    list1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~"
    list2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~"
    password = ""
    for i in range(len(service_name)):
        c = service_name[i]
        index = list1.index(c)
        k = key[index % len(key)]
        index2 = list1.index(k)
        newIndex = (index + index2 + i) % len(list1)
        if i % 2 == 0:
            newChar = list1[newIndex]
        else:
            newChar = list2[newIndex]
        password += newChar
    password += list1[len(key)]
    password += list1[len(service_name)]
    password += list1[len(service_name) + len(key)]
    password += list1[len(password)]
    return password

### C#
public static string passicle(string service_name, string key) {
    string list1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~";
    string list2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~";
    string password = "";
    for (int i = 0; i < service_name.Length; i++) {
        char c = service_name[i];
        int index = list1.IndexOf(c);
        char k = key[index % key.Length];
        int index2 = list1.IndexOf(k);
        int newIndex = (index + index2 + i) % list1.Length;
        char newChar = ' ';
        if (i % 2 == 0) {
            newChar = list1[newIndex];
        } else {
            newChar = list2[newIndex];
        }
        password += newChar;
    }
    password += list1[key.Length];
    password += list1[service_name.Length];
    password += list1[service_name.Length + key.Length];
    password += list1[password.Length];
    return password;
}

### C++
string passicle(string service_name, string key) {
    string list1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~";
    string list2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~";
    string password = "";
    for (int i = 0; i < service_name.length(); i++) {
        char c = service_name[i];
        int index = list1.find(c);
        char k = key[index % key.length()];
        int index2 = list1.find(k);
        int newIndex = (index + index2 + i) % list1.length();
        char newChar = ' ';
        if (i % 2 == 0) {
            newChar = list1[newIndex];
        } else {
            newChar = list2[newIndex];
        }
        password += newChar;
    }
    password += list1[key.length()];
    password += list1[service_name.length()];
    password += list1[service_name.length() + key.length()];
    password += list1[password.length()];
    return password;
}

### Swift
func passicle(service_name: String, key: String) -> String {
    let list1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~"
    let list2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{};':\",./<>?`~"
    var password = ""
    for i in 0..<service_name.count {
        let c = service_name[service_name.index(service_name.startIndex, offsetBy: i)]
        let index = list1.firstIndex(of: c)
        let k = key[key.index(key.startIndex, offsetBy: index! % key.count)]
        let index2 = list1.firstIndex(of: k)
        let newIndex = (index! + index2! + i) % list1.count
        var newChar = " "
        if i % 2 == 0 {
            newChar = String(list1[list1.index(list1.startIndex, offsetBy: newIndex)])
        } else {
            newChar = String(list2[list2.index(list2.startIndex, offsetBy: newIndex)])
        }
        password += newChar
    }
    password += String(list1[list1.index(list1.startIndex, offsetBy: key.count)])
    password += String(list1[list1.index(list1.startIndex, offsetBy: service_name.count)])
    password += String(list1[list1.index(list1.startIndex, offsetBy: service_name.count + key.count)])
    password += String(list1[list1.index(list1.startIndex, offsetBy: password.count)])
    return password
}