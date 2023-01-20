public class Person {

public static void main(String[] args) {

        Person p1 = new Person();
        p1.setFirstName("Nidhi");
        p1.setLastName("Shisodia");
        p1.setAge(16);

        System.out.println("Your firstname is " + p1.getFirstName());
        System.out.println("Your lastname is " + p1.getLastName());
        System.out.println("Your age is " + p1.getAge());
        System.out.println("Teen " + p1.isTeen());

        p1.setFirstName("");
        p1.setLastName("Shisodia");
        System.out.println("Your full name is " + p1.getFullName());




    }

    private String firstName;
    private String lastName ;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ageofPerson) {
        if (ageofPerson < 0 || ageofPerson > 100) {
            this.age = 0;
        }
        else{
            this.age = ageofPerson;
        }
    }

    public boolean isTeen() {
        if(this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName () {

        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        if(this.lastName.isEmpty()) {
            return this.firstName;
        }

        if(this.firstName.isEmpty()) {
            return this.lastName;
        }
        return this.firstName + " "+ this.lastName;
    }

}
