class Student_Q3 {

    private int id;
    private String stname;

    public Student_Q3(int id, String stname) {
        this.id = id;
        this.stname = stname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return stname;
    }

    public void setname(String name) {
        this.stname = name;
    }
}

class Test {
    public static void main(String[] args) {
        Student_Q3 student = new Student_Q3(21, "Shivam");
        student.setId(23);
        student.setname("Shivam Rajvanshi");
        System.out.println("Student id:" + student.getId());
        System.out.println("Student Name:" + student.getname());
    }
}
