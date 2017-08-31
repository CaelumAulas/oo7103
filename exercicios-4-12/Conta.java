class Conta {

    Titular titular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;

    void saca(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    double calculaRendimento() {
        return this.saldo * 0.15;
    }

    String recuperaDados() {
        String imprimir = "Titular: " + this.titular.nome + "\n";
        imprimir += "Saldo: " + this.saldo + "\n";
        imprimir += "Data de abertura: " + this.dataDeAbertura;
        return imprimir;
    }
}
