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

### List 1
]ezdESiKJGPIX(*@m374=+Z6faRN\"2&y^9VqY8A1B`%hs.v}#L0pQD:o;C-x,!ul)bHU{wW/tF'r~Ong?c[_MjT$k5

### List 2
3h*4c&P(H?dY}t=%!GXjT@{/pF1r7glOqf:SEubA5LB#vW[w)-R.V,U`zy\"e;ZN0]$6^mJ2'sxM9k+_~a8KinICoDQ

### Non-reversibility
One security feature of using this algorithm is that it is non-reversible without the key, even if you fully understand the algorithm. This is because the algorithm uses the key to generate the password, and without the key, you cannot generate the password. This means that if someone gets access to your password, they cannot reverse engineer the algorithm to get the key, and therefore cannot get access to your other passwords.