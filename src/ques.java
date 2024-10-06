////public class ques {
//
////    You parked your car in a parking lot and want to compute the total cost of the ticket. The billing rules are as follows:
////
////    The entrance fee of the car parking lot is 2;
////    The first full or partial hour costs 3;
////    Each successive full or partial hour (after the first) costs 4.
////    You entered the car parking lot at time E and left at time L. In this task, times are represented as strings in the format "HH:MM" (where "HH" is a two-digit number between 0 and 23, which stands for hours, and "MM" is a two-digit number between 0 and 59, which stands for minutes).
////    that, given strings E and L specifying points in time in the format "HH:MM", returns the total cost of the parking bill from your entry at time E to your exit at time L. You can assume that E describes a time before L on the same day.
////    For example, given "10:00" and "13:21" your function should return 17, because the entrance fee equals 2, the first hour costs 3 and there are two more full hours and part of a further hour, so the total cost is 2 + 3 + (3 * 4) = 17. Given "09:42" and "11:42" your function should return 9, because the entrance fee equals 2, the first hour costs 3 and the second hour costs 4, so the total cost is 2 + 3 + 4 = 9.
////    Assume that:
////
////    strings E and L follow the format "HH:MM" strictly;
////    string E describes a time before L on the same day.
////    In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
//  //  Write a function:
//
//import java.util.stream.Collectors;
//
//class Solution {
//
//        public static void main(String[] args) {
//            List<Student> list = Arrays.asList(
//                    new Student(1, "Mohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
//                    new Student(2, "Saurav", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
//                    new Student(3, "Priya", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
//                    new Student(4, "Satish", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
//                    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
//                    new Student(6, "Kusum", "Star", 24, "Female", "Mechanical Engineering", 2023, "Karnataka", 90),
//                    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
//                    new Student(8, "Luv", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
//                    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
//                    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
//
//            list.stream().collect(Collectors.groupingBy(i->i.getDepartment(), Collectors.averagingInt(Student::getAge)));
//            list.stream().map(i->i.getRank()).;
//            //System.out.print(solution("14:01", "23:00"));
//        }
//
//        Select * from Employee order by salary desc limit 9,1
//
//            limit
//
//
//    }
//        //
//
////        public static int solution(String E, String L){
////            //"10:00" and "13:21"  // 10:21 and 13:00
////            // 17 (2 +3 +4+4+4)
////            String[] entryTimeArr = E.split(":");
////            String[] exitTimeArr = L.split(":");
////            Integer hrs = Integer.parseInt(exitTimeArr[0])-Integer.parseInt(entryTimeArr[0]);
////            Integer minsDiff = Integer.parseInt(exitTimeArr[1])-Integer.parseInt(entryTimeArr[1]);
////            if(minsDiff>0){
////                hrs++;
////            }
////            if((hrs==0 && minsDiff>0) || (hrs==1 && minsDiff==0)){
////                return 5;
////            }
////            int cost = 2+3+ ((hrs-1)*4);
////            return cost;
////
////        } }
//
//
//
