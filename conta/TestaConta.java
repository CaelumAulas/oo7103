class TestaConta {
    
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.titular = "João";
        c1.saldo = 500.5;
        c1.numero = 798;

        Conta c2 = new Conta();
        c2.titular = "Ana";
        c2.saldo = 798.5;
        c2.numero = 978;

        System.out.println("Titular de c1: " + c1.titular);
        System.out.println("Saldo de c1: " + c1.saldo);

        if(c1 == c2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        c1.titular = "Ana";
        c1.saldo = 798.5;
        c1.numero = 978;
        
        if(c1 == c2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        c1 = c2;

        c1.titular = "Lucas";
        System.out.println(c2.titular);
    }
}