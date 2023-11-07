class Person {
    private String name;
    private String address;
  
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
  
    String getName() {
        return name;
    }
    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String toString() {
        return "Person [name = " + this.name + ", address = " this.address + "]";
    }
}
