public class inheritance {

    public class Guest {
        public void read() {
            System.out.println("read  updated code");
        }
    }

    public class Developer extends Guest {
        public void write() {
            System.out.println("write code");
        }
    }

    public class Manager extends Developer {
        public void manage() {
            System.out.println("manage code");
        }
    }

    public static void main(String[] args) {
        inheritance inheritance = new inheritance();

        Guest guest = inheritance.new Guest();
        guest.read();

        Developer developer = inheritance.new Developer();
        developer.read();
        developer.write();

        Manager manager = inheritance.new Manager();
        manager.read();
        manager.write();
        manager.manage();
    }
}
