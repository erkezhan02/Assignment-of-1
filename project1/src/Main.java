public class Main{
    public static void main(String[] args) {
        Person person = new Person("Yerkezhan Akhmetova",17);
        System.out.println("Person info");
        System.out.println("Name" + person.name);
        System.out.println("Age" + person.age);

        //2 TASK
        Person2 Person2=new Person2("Yerkezhan",17);
        Person2.printDetails();

        //3 Task
        Person3 Person3=new Person3("Yerkezhan",17);
            Person3.setName("Alinur");
            Person3.setAge(19);
        System.out.println("Name:" + Person3.getName());
        System.out.println("Age:" + Person3.getAge());
    }
}
