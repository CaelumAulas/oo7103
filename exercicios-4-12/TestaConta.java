class TestaConta {

    public static void main(String[] args) {

        Titular ana = new Titular();
        ana.nome = "Ana";
        ana.cpf = "678.365.098-5";

        Conta contaAna = new Conta();
        contaAna.titular = ana;
        contaAna.saldo = 500.5;
        contaAna.agencia = "123-6";
        contaAna.dataDeAbertura = "01/05/2016";
        contaAna.numero = 156;

        contaAna.saca(200);
        contaAna.deposita(400);

        double rendimento = contaAna.calculaRendimento();
        System.out.println("Redimento da conta: " + rendimento);

        String dados = contaAna.recuperaDados();
        System.out.println(dados);

        contaAna.titular.nome = "Luisa";
        System.out.println(ana.nome);
    }
}