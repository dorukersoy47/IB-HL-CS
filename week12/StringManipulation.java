import javax.swing.JOptionPane;

public class StringManipulation {

    public static String reverse(String str) {
        String strFinal = "";
        for (int i = str.length()-1; i >= 0; i--) {
            strFinal += str.charAt(i);
        }
        return strFinal;
    }

    public static int search(String s, String str) {
        return str.indexOf(s);
    }
    public static void main(String[] args) {
        String str1 = "Test";
        String str2 = new String();
        String str3 = new String("Text");
        String str4;

        char[] chars = { 'T', 'e', 'x', 't' };

        String s5 = new String(chars);

        System.out.println(chars[2]);
        System.out.println(s5.charAt(2));

        System.out.println(s5.indexOf("x"));
        System.out.println(s5.length());

        String s6 = "Computer" + "Science";
        for (int i = 0; i < 5; i++) {
            s6 += JOptionPane.showInputDialog("Enter a word");
        }

        JOptionPane.showMessageDialog(null, s6);

        System.out.println(reverse(s5));

        System.out.println(search("ex", "text"));
        System.out.println(search("ex", "animal"));
        System.out.println(search("ex", "e aşadasxex)"));
    }
}