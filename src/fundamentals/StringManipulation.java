package fundamentals;

public class StringManipulation {

    public static void main(String[] args) {

        // 1️⃣ split()
        String sentence = "Java is fun";
        String[] words = sentence.split(" "); // split by space
        System.out.println("Words:");
        for (String word : words) System.out.println(word);

        // 2️⃣ substring()
        String sub = sentence.substring(0, 4); // "Java"
        System.out.println("Substring (0,4): " + sub);

        // 3️⃣ trim()
        String padded = "   Hello World   ";
        System.out.println("Before trim: '" + padded + "'");
        System.out.println("After trim: '" + padded.trim() + "'");

        // 4️⃣ replace()
        String replaced = sentence.replace("fun", "awesome");
        System.out.println("After replace: " + replaced);

        // 5️⃣ == vs .equals()
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("a == b: " + (a == b));       // true (same literal in string pool)
        System.out.println("a == c: " + (a == c));       // false (different objects)
        System.out.println("a.equals(c): " + a.equals(c)); // true (content is same)
    }
}
