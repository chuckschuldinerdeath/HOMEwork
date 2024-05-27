public class User {
    private String name;
    private String surname;
    private String secondName;
    private String dateOfBirth;
    private String email;

    public User(String name, String surname, String secondName, String dateOfBirth, String email){
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;

    }

    public void info(){
        System.out.print("ФИО: ");
        System.out.print(name + " ");
        System.out.print(surname + " ");
        System.out.println(secondName);
        System.out.println("дата рождения: " + dateOfBirth);
        System.out.println("e-mail: " + email);
    }

}