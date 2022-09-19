public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee( String imie, int ID, String dzial, String stanowisko){
        name = imie;
        idNumber = ID;
        department = dzial;
        position = stanowisko;
    }

    public Employee( String imie, int ID){
        name = imie;
        idNumber = ID;
        department = "";
        position = "";
    }

    public Employee(){
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setID(int idNumber) {

        this.idNumber = idNumber;
    }

    public int getID() {

        return idNumber;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public String getDepartment() {

        return department;
    }

    public void setPosition(String position) {

        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
