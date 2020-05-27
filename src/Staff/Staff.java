package Staff;

public class Staff {
    private String fullName;
    private String position;
    private String email;
    private String number;
    private int wage;
    private int age;

    public Staff(String fullName, String position, String email, String number, int wage, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.wage = wage;
        this.age = age;
    }

    public String print() {
        return
                "ФИО='" + fullName + '\'' +
                ", Должность='" + position + '\'' +
                ", email='" + email + '\'' +
                ", Номер телефона='" + number + '\'' +
                ", Заработная плата=" + wage +
                ", Возраст=" + age;
    }

    public int getAge()//возвращаем возраст сотрудника;
    {
        return age;
    }
}
