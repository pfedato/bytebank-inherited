public class TestReferences {

    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.setName("Marcos");
        m1.setSalary(5000.00);

        Employee e1 = new Employee();
        e1.setSalary(2000.00);

        VideoEditor vE1 = new VideoEditor();
        vE1.setSalary(2500.00);

        Designer d1 = new Designer();
        d1.setSalary(2000.00);

        BonusControl control = new BonusControl();
        control.register(m1);
        control.register(e1);
        control.register(vE1);
        control.register(d1);

        System.out.println(control.getSum());

    }

}
