package formatter;

class ConvertAsciiCodeToChar {
    public static void main(String[] args) {
        for (int i = 0; i < 20000 ; i++) {
            int asciiValue = i;
            char ch = (char) asciiValue;
            System.out.printf("Ascii Code/Character  %d = %c\n", asciiValue, ch);
      }
    }
}
