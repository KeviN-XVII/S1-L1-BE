import java.util.Arrays;

public class Es1 {
    public static void main (String[] args) {
//       Moltiplica

        int numero1 = 5;
        int numero2 = 2;
        int risultato = numero1 * numero2;
        System.out.println(risultato);
//       Concatena

        String settimana = "I giorni della settimana sono ";
        int numeriS = 7;
        System.out.println(settimana + numeriS);
//        Array
        String[] array = {"Lunedi", "Martedi", "Giovedi", "Venerdi", "Sabato"};
        String nuova = "Mercoledi";

        String[] risultatoArray = listaStringhe (array, nuova);
        System.out.println(Arrays.toString(risultatoArray));
    }
        public static String[] listaStringhe (String[] array, String nuovaStringa) {
            String[] risultato = new String[6];

            risultato[0] = array[0];
            risultato[1] = array[1];
            risultato[2] = nuovaStringa;
            risultato[3] = array[2];
            risultato[4] = array[3];
            risultato[5] = array[4];

            return risultato;
        }
}
