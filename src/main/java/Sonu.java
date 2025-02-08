import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sonu {
    //list of integers
    //years 1998,1996, 2005, 2007
    //print the list as per leap year
    public static void main(String[] args) {
    	List<Integer> years = Arrays.asList(1998, 1996, 2005, 2007);

        List<Integer> leapYears = years.stream()
                .filter(Sonu::isLeapYear)
                .collect(Collectors.toList());

        System.out.println(leapYears); // Output: [1996]
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }}

//2nd max salary

//select max(sal) from emp where sal<=(select max(sal) from emp);
//
//select sal from emp where denc_rank (0,2) order by sal;
//
////test the private method in unit test cases
//@test
//public void testPrivatemethod() throws Exception {
//    Method method = MyClass.class.getDeclared;
//    reflectMethod.setAccessible(true);
//}
//
//Design patterns, Design principles, Solid principle.