class TestaConta {

    public static void main(String[] args) {
    
        Conta c1 = new Conta();
        c1.setTitular("Lucas");
        c1.setNumero(167);
        c1.deposita(80.5);

        Conta c2 = new Conta("Jeferson");
        c2.setNumero(862);
        c2.deposita(764);
        c2.saca(80);

        System.out.println(c2.getSaldo());
        System.out.println(c1.getTitular());
    }
}