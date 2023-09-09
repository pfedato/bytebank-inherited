public class TestEmployee {

    public static void main(String[] args) {

        Employee pedro = new Employee();
        pedro.setName("Pedro Fedato");
        pedro.setCpf("01234567890");
        pedro.setSalary(2590.80);

        System.out.println(pedro.getName());
        System.out.println(pedro.getBonus());
    }
}
