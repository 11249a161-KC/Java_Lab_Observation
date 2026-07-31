public class stringops {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String strWithSpaces = "  Java Programming  ";

        System.out.println("=== STRING OPERATIONS ===");

        System.out.println("Length of str1: " + str1.length());

        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated: " + combined);
 
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Index of 'o' in str1: " + str1.indexOf('o'));

        System.out.println("Substring (0 to 4): " + combined.substring(0, 4));

        String str3 = "hello";
        System.out.println("Equals (case-sensitive): " + str1.equals(str3));
        System.out.println("Equals (ignore case): " + str1.equalsIgnoreCase(str3));

        System.out.println("Contains 'World'?: " + combined.contains("World"));
        System.out.println("Starts with 'He'?: " + str1.startsWith("He"));
        System.out.println("Ends with 'lo'?: " + str1.endsWith("lo"));

        String replaced = combined.replace("World", "Java");
        System.out.println("Replaced String: " + replaced);

        System.out.println("Original with spaces: '" + strWithSpaces + "'");
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        String fruits = "Apple,Banana,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("\nSplit Fruits:");
        for (String fruit : fruitArray) {
            System.out.println("- " + fruit);
        }
    }
}