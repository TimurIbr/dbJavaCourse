package homework.lab2;

import lombok.ToString;

/**
 * @author Evgeny Borisov
 */
@ToString
public class Client {
    private final int debt;
    private final int bonus;
    private final String name;
    private final int salary;

    public Client(int debt, int bonus, String name, int salary) {
        this.debt = debt;
        this.bonus = bonus;
        this.name = name;
        this.salary = salary;
    }

    private Client(ClientConstructor builder){
        this.debt = builder.debt;
        this.bonus = builder.bonus;
        this.name = builder.name;
        this.salary = builder.salary;
    }

    public static class ClientConstructor {
        private int debt;
        private int bonus;
        private String name;
        private int salary;

        public ClientConstructor debt(int debt) {
            this.debt = debt;
            return this;
        }

        public ClientConstructor bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public ClientConstructor name(String name) {
            this.name = name;
            return this;
        }

        public ClientConstructor salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Client construct(){
            return new Client(this);
        }
    }


}


