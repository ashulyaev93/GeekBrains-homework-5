package Staff;

public class Main {

    public static void main(String[] args) {
	Staff staff1 = new Staff(
	        "Shulyaev Alexandr Vitalevich",
            "Java developer",
            "ashulyaev93@mail.ru",
            "89277799417",
            100000,
            26);

	    System.out.println(staff1.print());//метод print, чтобы распечатывалось;
	    System.out.println();

        Staff[] stArray = new Staff[5];
        stArray[0] = new Staff("Shulyaev Alexandr Vitalevich","Java developer","ashulyaev93@mail.ru","89277799417",100000,26);
        stArray[1] = new Staff("Ivanov Ivan Ivanovich", "Market", "ivanov@mail.ru", "89277799418",80000, 24);
        stArray[2] = new Staff("Petrov Petr Petrovich", "Engineer", "petrov@mailbox.com", "892312311", 110000, 45);
        stArray[3] = new Staff("Smirnov Alexei Alexandrovich", "CO-Founder", "smirnov@mailbox.com", "892312000", 400000, 65);
        stArray[4] = new Staff("Sidorov Sergei Sergeevvich", "Intern", "sidorov@mailbox.com", "892312425", 20000, 22);

        for(int i = 0; i < stArray.length; i++)
        {
            Staff curStaff = stArray[i];//объявляем массив;
            int age = curStaff.getAge();
            if (age > 40)
            {
                System.out.println(curStaff.print());
            }
        }
    }
}
