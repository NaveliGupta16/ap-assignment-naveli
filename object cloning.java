class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        try {
            Person originalPerson = new Person("John", 30);
            Person clonedPerson = (Person) originalPerson.clone();

            System.out.println("Original: " + originalPerson);
            System.out.println("Cloned: " + clonedPerson);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

