public class PersonProgram {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Thuy");
        person.setAge(20);
        person.setSex(true);
        Person person2 = new Person("Duc",true,20);

        person.sayHello();
        System.out.println();
        person2.sayHello();
    }
}
