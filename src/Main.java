public class Main {
    public static void main(String[] args) {   System.out.println("Задача 1");
        System.out.println("----------------------------------");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("----------------------------------");

        System.out.println("Задача 2");
        System.out.println("----------------------------------");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("----------------------------------");

        System.out.println("Задача 3");
        System.out.println("----------------------------------");
        String fullName2 = "Иванов Семён Семёнович";
        String fullName2True = fullName2.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2True);
        System.out.println("----------------------------------"); }
}