

function passicle(service_name, key) {
    var list1 = "]ezdESiKJGPIX(*@m374=+Z6faRN\"2&y^9VqY8A1B`%hs.v}#L0pQD:o;C-x,!ul)bHU{wW/tF'r~Ong?c[_MjT$k5";
    var list2 = "3h*4c&P(H?dY}t=%!GXjT@{/pF1r7glOqf:SEubA5LB#vW[w)-R.V,U`zy\"e;ZN0]$6^mJ2'sxM9k+_~a8KinICoDQ";
    var password = "";
    for (var i = 0; i < service_name.length; i++) {
        var c = service_name.charAt(i);
        var index = list1.indexOf(c);
        var k = key.charAt(index % key.length);
        var index2 = list1.indexOf(k);
        var newIndex = (index + index2 + i) % list1.length;
        var newChar;
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