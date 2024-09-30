public class Exception extends RuntimeException {
    public Exception(String message) {
        super(message);
    }
}

//Employee class
class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}


