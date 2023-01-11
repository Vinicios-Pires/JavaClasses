public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();

        user.name = "User";
        user.setEmail("user@email.com");
        user.university.name = "University";
        user.university.campus = "UniversityCampus";
        user.university.course = "UniversityCourse";
        user.university.entranceYear = 2023;
        user.university.entrancePeriod = 1;

        System.out.println(user);
    }
}
