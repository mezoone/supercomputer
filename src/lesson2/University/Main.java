package lesson2.University;

public class Main {
    public static void main(String[] msi) {
        Student student = new Student("Михаил", "Швехгеймер", "БАП1801", 4.5);
        Aspirant aspirant = new Aspirant("Андей", "Вовик", "ИСУИА", 4, "Робот");
        Student un = new Aspirant("Андрей", "Елисеев", "БАП1801", 5, "Нанотехнологии");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}
