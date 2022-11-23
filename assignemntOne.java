

import java.util.Scanner;

class Student{

    int usn;
    char sem;
    int marks[] = new int[8];

    public Student(int usn, int sem) {

    }

    void display() {
        System.out.println("USN :" + usn);
        System.out.println("Semester :" + sem);//<TO DO:Add Constructor to initialize sem and usn>
        System.out.println("Maximum marks:"+);
    }

    //<TO DO : Add constructor with no intializations>
    public void setSem() {
        System.out.println("Enter Sem of student ");
        Scanner sc  = new Scanner(System.in);
        this.sem=sc.next().charAt(0);
    }
    public void setUsn(int usn) {
        System.out.println("Enter usn of student");
        Scanner sc  = new Scanner(System.in);
        this.usn=sc.nextInt();

    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
//<TO DO : ADD METHOD TO SET MARKS>

    public int[] getMarks() {
        return marks;
    }

    public char getSem() {
        return sem;
    }

    public int getUsn() {
        return usn;
    }
    public int getMaximumMark() {
        int max = Integer.MIN_VALUE;
        for(int mark:marks) {
            if(mark > max) {
                max = mark;
            }
        }
        return max; //<TO DO: Add a method to find maximum marks>

    }


    public class assignemntOne {
        public static void main(String[] args) {
            Student eeeStudent1 = new Student();
            int usn;
            int sem;
            Student eeeStudent2 = new Student(usn, sem);
            eeeStudent1.setMarks(new int[]{39, 43, 94, 60, 90, 56, 43, 32,});
            eeeStudent2.setMarks(new int[]{50, 68, 78, 89, 57, 67, 87, 89}); //<TO DO: Assign marks to students>

            eeeStudent1.setSem();
            eeeStudent1.setUsn();
            eeeStudent1.getMaximumMark();
            eeeStudent1.display();

            eeeStudent2.setSem();
            eeeStudent2.setUsn();
            eeeStudent2.getMaximumMark();
            eeeStudent2.display();//<TO DO: Print the max marks of both students>

            /*<TO DO: Take input of a subject index from user and print
            which student has more marks in that subject>*/


        }
    }

