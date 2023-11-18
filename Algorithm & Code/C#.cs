public string Passicle(string service_name, string key)
{
    string password = "";
    string list1 = "]ezdESiKJGPIX(*@m374=+Z6faRN""2&y^9VqY8A1B`%hs.v}#L0pQD:o;C-x,!ul)bHU{wW/tF'r~Ong?c[_MjT$k5";
    string list2 = "3h*4c&P(H?dY}t=%!GXjT@{/pF1r7glOqf:SEubA5LB#vW[w)-R.V,U`zy""e;ZN0]$6^mJ2'sxM9k+_~a8KinICoDQ";
    for (int i = 0; i < service_name.Length; i++)
    {
        char c = service_name[i];
        int index = list1.IndexOf(c);
        char k = key[index % key.Length];
        int index2 = list1.IndexOf(k);
        int newIndex = (index + index2 + i) % list1.Length;
        char newChar = i % 2 == 0 ? list1[newIndex] : list2[newIndex];
        password += newChar;
    }
    password += list1[key.Length];
    password += list1[service_name.Length];
    password += list1[service_name.Length + key.Length];
    password += list1[password.Length];
    return password;
}