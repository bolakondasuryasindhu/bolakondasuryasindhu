public class Example7 {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings to the StringBuilder
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("world");

        // Convert StringBuilder to String
        String result = stringBuilder.toString();

        // Print the result
        System.out.println(result);  // Output: Hello world
    }
}