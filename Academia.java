class Academia {
    
    public static void main(String[] args) {
        // nome do cliente
        String nome = "Jeferson";
        int idade = 17;
        float peso = 75.5f;
        double altura = 1.70;
        char sexo = 'M';
        boolean ehFumante = false;
        boolean amigoDoDono = true;

        if(idade > 18 || amigoDoDono == true) {
            System.out.println("Pode se matricular");
        } else {
            System.out.println("Não pode se matricular");
        }

        for(int i = 1; i <= 30; i++) {
            System.out.println(" " + i);
        }

        while(idade < 18) {
            System.out.println("Ainda não pode se matricular");
            idade++;
        }
    }
}