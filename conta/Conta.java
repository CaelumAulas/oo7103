class Conta {
    
    String titular;
    double saldo;
    int numero;

    void deposita(double valor) {
        this.saldo += valor;
    }

    boolean saca(double valor) {
        if(valor <= this.saldo)  {
            this.saldo -= valor;
            return true;
        }

        return false;
    }
}