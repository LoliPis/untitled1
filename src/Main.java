public class Main {
    public static void main(String[] args) {
        //Task First
        String str = "анна";
        int count = 0;
        int j = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(j)){
                count++;
                j--;
            }
        }
        if (count == str.length()/2){
            System.out.println("Эта строка палиндром");
        }

        //Task Second

        StringBuilder clearedString = new StringBuilder();
        String str1 = "one two three four";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                clearedString.append(str1.charAt(i));
            }
        }

    }
}