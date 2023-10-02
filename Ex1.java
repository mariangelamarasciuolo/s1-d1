public class Ex1 {
    public static void main(String[] args) {
        int moltResult = moltiplica(6, 6);
        System.out.println("Moltiplico" + "=" + moltResult);

        String concatResult = concatena("9", 4);
        System.out.println("Concateno:" + concatResult);

        String[] arrayDiStringhe = {"Mela", "Pera", "Banana", "Arancia", "Caffè"};
        //---creo l'elemento da aggiungere all'array per metterlo in terza posizione-----
        String aggiungoElemento = "Papaya";


        //mi creo un altro array di dimensioni maggiori
        //int arrayUnPoPiuGrande = arrayDiStringhe.length + 1;
        //String[] arrayAggiornato = new String[arrayUnPoPiuGrande];

        String[] nuovoArray = modificaArray(arrayDiStringhe, aggiungoElemento);
        for (int i = 0; i < nuovoArray.length; i++) {
            System.out.println(nuovoArray[i]);
        }

    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String a, int b) {
        return a + b;
    }

    public static String[] modificaArray(String[] arrayDiStringhe, String aggiungoElemento) {
        String[] nuovoArray = new String[arrayDiStringhe.length + 1];
        int cont = 0;
        for (int i = 0; i < nuovoArray.length; i++) {
            if (i == 2) {
                nuovoArray[i] = aggiungoElemento;
            } else {
                nuovoArray[i] = arrayDiStringhe[cont];
                cont++;
            }
        }
        return nuovoArray;
    }
}