

public class Passicle {
    public static String generate(String service_name, String key) {
        String list1 = "]ezdESiKJGPIX(*@m374=+Z6faRN\"2&y^9VqY8A1B`%hs.v}#L0pQD:o;C-x,!ul)bHU{wW/tF'r~Ong?c[_MjT$k5";
        String list2 = "3h*4c&P(H?dY}t=%!GXjT@{/pF1r7glOqf:SEubA5LB#vW[w)-R.V,U`zy\"e;ZN0]$6^mJ2'sxM9k+_~a8KinICoDQ";
        String password = "";
        for (int i = 0; i < service_name.length(); i++) {
            char c = service_name.charAt(i);
            int index = list1.indexOf(c);
            char k = key.charAt(index % key.length());
            int index2 = list1.indexOf(k);
            int newIndex = (index + index2 + i) % list1.length();
            char newChar;
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
}