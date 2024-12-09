public class AlfanumericoTarea implements Runnable{
    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {

        if (this.tipo == Tipo.STRING){
            for (char i = 'A'; i <= 'Z'; i++){
                System.out.println(i);
            }
        }else {
            for (int i = 0; i < 10; i++){
                System.out.println(i);
            }
        }
    }
}
