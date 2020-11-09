package HW05modul2;

class Person {
    private String firstName;
    private String lastName;
    private String city;
    private int age;
    private int taxationClass;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTaxationClass() {
        return taxationClass;
    }

    public void setTaxationClass(int taxationClass) {
        this.taxationClass = taxationClass;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
    }

    public void walks(int hoursPerDay) {
        System.out.println("The person walks: " + hoursPerDay + " hours per day.");
    }

    public static void insertionSortAge(Person[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Person temp = arr[i];
            int location = i - 1;
            while (location >= 0 && arr[location].getAge() > temp.getAge()) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = temp;
        }
    }


    public static void printArr(Person[] arr) {
        for (Person person : arr) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
        }
        System.out.println();

    }

    public static Person[] deletePersonArray(Person[] arr) {
        Person[] newPersonArray = new Person[arr.length - 1];
        for (int i = 0; i < newPersonArray.length; i++) {
            newPersonArray[i] = arr[i];
        }
        return newPersonArray;
    }

    public static Person[] updatePersonArray(Person[] arr, int index, Person update) {
        arr[index] = update;
        return arr;
    }

    public static Person[] addPersonArray(Person newPerson, Person[] personArray) {
        Person[] newPersonArray = new Person[personArray.length + 1];
        for (int i = 0; i < personArray.length; i++) {
            newPersonArray[i] = personArray[i];
        }
        newPersonArray[newPersonArray.length - 1] = newPerson;
        return newPersonArray;
    }
}

