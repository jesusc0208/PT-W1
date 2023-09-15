public class Main {
    public static void main(String[] args) {
        String[] students = new String[3];

        students[0] = "Tommy Sawyer";
        students[2] = "Kevin Smith";
        students[1] = "Jeffrey Culo";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        for (String student : students) {
            System.out.println(student);
        }
    }
    }