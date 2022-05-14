package dio.basecamp.poo.heranca;

class main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(55);
        Carro carro2 = new Carro("Branco", "gol", 60);

        System.out.println(carro1);
        System.out.println(carro2);

        carro1.virar();

        Motocicleta moto1 = new Motocicleta("preto", "yamaha", 15);
        System.out.println(moto1);
        moto1.virar();


        Caminhao caminhao1 = new Caminhao("preto", "Mercedes", 100);
        System.out.println(caminhao1);

        Veiculo moto3 = new Motocicleta("preto", "susuki", 20); //Upcast
        //Motocicleta moto4 = (Motocicleta) new Veiculo("preto", "susuki", 20); //Downcast


    }
}
