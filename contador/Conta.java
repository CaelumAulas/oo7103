class Conta {
    
    private String titular;
    private double saldo;
    private int numero;

    public Conta() {
        System.out.println("Construindo uma conta");
    }

    public Conta(String titular) {
        this.titular = titular;
        System.out.println("Construindo conta com o titular");
    }

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

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}