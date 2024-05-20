package lesson4;

public class User {
    String name;
    String surname;
    String secondName;
    String dateOfBirth;
    String email;

    User(String name, String surname, String secondName, String dateOfBirth, String email){
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;

    }

    void info(){
        System.out.print("ФИО: ");
        System.out.print(name + " ");
        System.out.print(surname + " ");
        System.out.println(secondName);
        System.out.println("дата рождения: " + dateOfBirth);
        System.out.println("e-mail: " + email);
    }

}
