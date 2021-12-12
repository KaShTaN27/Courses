package Chapter6.Task30;

public class Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age >= 0 && age <= 100 ? age : 0;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (!firstName.isEmpty() && !lastName.isEmpty())
            return firstName + " " + lastName;
        if (!firstName.isEmpty())
            return  firstName;
        if (!lastName.isEmpty())
            return  lastName;
        return "";
    }
}
