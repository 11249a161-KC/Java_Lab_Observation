public class compareemp {
    public static boolean comparedept(String emp1, String emp2, String delimiter)
    {
        String[] details1 = emp1.split(delimiter);
        String[] details2 = emp2.split(delimiter);

        if (details1.length > 1 && details2.length > 1)
        {
            String dept1 = details1[1].trim();
            String dept2 = details2[1].trim();

            return dept1.equalsIgnoreCase(dept2);
        }

        return false;
    }
    public static void main(String[] args) 
    {
        String employee1 = "Jantar Mantar - AI";
        String employee2 = "Bhoot Bangla - IT";
        String employee3 = "Last Stop - HR";

        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);
        System.out.println("Employee 3: " + employee3);

        boolean result1 = comparedept(employee1, employee2, "-");
        System.out.println("Employee 1 and Employee 2 work in the same department -> " + result1);

        boolean result2 = comparedept(employee1, employee3, "-");
        System.out.println("Employee 1 and Employee 3 work in the same department -> " + result2);
    }
}
