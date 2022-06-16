public class JavaAcademy {
    public static void main(String[] args) {
        String words = "MyApp JavaAcademy";
        int count = 0;
        for (int i = 0; i<words.length(); i++) {
            if (words.charAt(i) == 'm') {
                count++;
            }

        }
        System.out.println("Counted letters: m = " + count);

    }
}
