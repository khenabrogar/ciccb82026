public class Task3 {
    public static void main(String[] args) {
        // ============= MODIFY ONLY THIS SECTION =============
        String a = "Wow";              // No "new String" → same reference as b
        String b = "Wow";
        String c = "wow";              // Different case → NOT equal to a
        String d = "Wow!";             // Matches: b + "!" = "Wow!"
        // =====================================================

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
