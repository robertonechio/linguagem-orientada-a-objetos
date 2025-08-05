public class Animal { 
    // Atributos da classe
    String nomeAnimal;
    int numeroDePatas;
    boolean temRabo;
    String cor;
    int idade;
    double peso;
    String tipoAlimentacao;
    char genero;
    String somAnimal;
    
    //Método para imprimir os atributos do animal
    public void printStatus(){
        System.out.println("Nome: " + nomeAnimal);
        System.out.println("Número de patas: " + numeroDePatas);
        System.out.println("Tem rabo? " + temRabo);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de alimentação: " + tipoAlimentacao);
        System.out.println("Genero: " + genero);
        System.out.println("------------------------------------------------");
    }
    
    public void emitirSom() {
        if (somAnimal != "N") {
            System.out.println("O som de " + nomeAnimal + " é " + somAnimal);
            System.out.println("------------------------------------------------");
        } else {
            System.out.println("Esse animal não tem som");
        }
        
    }
    
    //Método principal main
    public static void main(String[] args){
        //Criando o primeiro animal
        Animal cachorro = new Animal();
        cachorro.nomeAnimal = "Euclides";
        cachorro.numeroDePatas = 4;
        cachorro.temRabo = true;
        cachorro.cor = "Tigrado";
        cachorro.idade = 4;
        cachorro.tipoAlimentacao = "Ração";
        cachorro.genero = 'M';
        cachorro.somAnimal = "Auuu";
        
        Animal gato = new Animal();
        gato.nomeAnimal = "Clara";
        gato.numeroDePatas = 4;
        gato.temRabo = true;
        gato.cor = "Tigrado";
        gato.idade = 2;
        gato.tipoAlimentacao = "Ração";
        gato.genero = 'F';
        gato.somAnimal = "Miau";
        
        Animal peixe = new Animal();
        peixe.nomeAnimal = "Estrela";
        peixe.numeroDePatas = 0;
        peixe.temRabo = true;
        peixe.cor = "Tigrado";
        peixe.idade = 1;
        peixe.tipoAlimentacao = "Ração";
        peixe.genero = 'F';
        peixe.somAnimal = "N";
    
        
        //Chamando os métodos para imprimir os atributos
        cachorro.printStatus();
        cachorro.emitirSom();
        gato.printStatus();
        gato.emitirSom();
        peixe.printStatus();
        peixe.emitirSom();
    
    }
    
}