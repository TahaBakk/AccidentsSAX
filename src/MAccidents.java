import java.util.HashSet;

/**
 * Created by x3727349s on 10/10/16.
 */
public class MAccidents {

    public static void main(String[] args) {

    }


    public static void carrerConflictiu(Saxhandler sax) {

        HashSet<String> hs = new HashSet<String>();
        for (Accidents acc: sax.accList) {
            hs.add(acc.getCodiCarrer());

        }
        for (String hs1 : hs) {

            for (Accidents acc: sax.accList) {

                
            }
        }



    }






    public static void calcularAccidentDistrictes(Saxhandler sax){

        int  santMarti=0;
        int  ciutatVella=0;
        int  Eixample=0;
        int  SantsMontjuïc=0;
        int  LesCorts=0;
        int  SarriàSantGervasi=0;
        int  Gràcia=0;
        int  HortaGuinardó=0;
        int  NouBarris=0;
        int  SantAndreu=0;
        int  Desconegut=0;
        int  districteMesAccidents=0;

        //Per saber cuants accidents han agut en cada districte
        for (Accidents acc : sax.accList) {
            switch (acc.getNomDistricte()) {
                case "Sant Martí":
                    santMarti++;
                    break;
                case "Ciutat Vella":
                    ciutatVella++;
                    break;
                case "Eixample":
                    Eixample++;
                    break;
                case "Sants-Montjuïc":
                    SantsMontjuïc++;
                    break;
                case "Les Corts":
                    LesCorts++;
                    break;
                case "Sarrià-Sant Gervasi":
                    SarriàSantGervasi++;
                    break;
                case "Gràcia":
                    Gràcia++;
                    break;
                case "Horta-Guinardó":
                    HortaGuinardó++;
                    break;
                case "Nou Barris":
                    NouBarris++;
                    break;
                case "Sant Andreu":
                    SantAndreu++;
                    break;
                case "Desconegut":
                    Desconegut++;
                    break;
            }

        }



    //Per saber quin districte te més accidents
        if (districteMesAccidents < santMarti){districteMesAccidents = santMarti;}
        if (districteMesAccidents < ciutatVella){districteMesAccidents = ciutatVella;}
        if (districteMesAccidents < Eixample){districteMesAccidents = Eixample;}
        if (districteMesAccidents < SantsMontjuïc){districteMesAccidents = SantsMontjuïc;}
        if (districteMesAccidents < LesCorts){districteMesAccidents = LesCorts;}
        if (districteMesAccidents < SantAndreu){districteMesAccidents = SantAndreu;}
        if (districteMesAccidents < SarriàSantGervasi){districteMesAccidents = SarriàSantGervasi;}
        if (districteMesAccidents < Gràcia){districteMesAccidents = Gràcia;}
        if (districteMesAccidents < HortaGuinardó){districteMesAccidents = HortaGuinardó;}
        if (districteMesAccidents < NouBarris){districteMesAccidents = NouBarris;}
        if (districteMesAccidents < Desconegut){districteMesAccidents = Desconegut;}


   //Per saber el nom del districte que a tingut més accidents

        if (districteMesAccidents == santMarti){
                System.out.println("El districte amb més accidents és Sant Martí amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == ciutatVella){
                System.out.println("El districte amb més accidents és Ciutat Vella amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == Eixample){
                System.out.println("El districte amb més accidents és Eixample amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == SantsMontjuïc){
                 System.out.println("El districte amb més accidents és Sants-Montjuïc amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == LesCorts){
                 System.out.println("El districte amb més accidents és Les Corts amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == SantAndreu){
                 System.out.println("El districte amb més accidents és Sant Andreu amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == SarriàSantGervasi){
                 System.out.println("El districte amb més accidents és Sarrià Sant Gervasi amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == Gràcia){
                 System.out.println("El districte amb més accidents és Gràcia amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == HortaGuinardó){
                 System.out.println("El districte amb més accidents és Horta Guinardó amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == NouBarris){
                 System.out.println("El districte amb més accidents és Nou Barris amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == Desconegut){
                 System.out.println("El districte amb més accidents és Desconegut amb: "+districteMesAccidents+" accidents.");}



    }



}
