public class PrincipalBancoHackeado3 {
    public static void main(String[] args) throws Exception{
        CuentaBancaria3 c1 = new CuentaBancaria3(
                "Chuck Norris",
                "21031221",
                1000.0);
        System.out.println(c1);

        System.out.println("\nRetirar dinero");
        c1.retirarDinero(2000);
        System.out.println(c1);
    }
}
