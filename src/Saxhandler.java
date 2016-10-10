import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by x3727349s on 03/10/16.
 */
public class Saxhandler extends DefaultHandler {

    int contador_Accidents = 0;
    Accidents Acc = new Accidents();
    public List<Accidents> accList = new ArrayList<Accidents>();

    boolean is_nomBarri =false;
    boolean is_nomCarrer =false;
    boolean is_diaDeSetmana =false;
    boolean is_diaDeMes =false;
    boolean is_nomMes =false;
    boolean is_horaDedia =false;
    boolean is_codiDistricte =false;
    boolean is_Nomdistricte =false;
    boolean is_codiCarrer =false;



    String nomBarri ="";
    String nomCarrer ="";
    String diaDeSetmana ="";
    String diaDeMes ="";
    String nomMes ="";
    String horaDedia ="";
    String codiDistricte="";
    String Nomdistricte="";
    String codiCarrer="";


    @Override
    public void startElement(String s, String s1, String s2, Attributes attributes) throws SAXException {

        if (s2.equalsIgnoreCase("Registre"))
            contador_Accidents++;
        if (s2.equalsIgnoreCase("Nombarri"))
            is_nomBarri=true;
        if (s2.equalsIgnoreCase("Nomcarrer"))
            is_nomCarrer=true;
        if (s2.equalsIgnoreCase("Diadesetmana"))
            is_diaDeSetmana=true;
        if (s2.equalsIgnoreCase("Diademes"))
            is_diaDeMes=true;
        if (s2.equalsIgnoreCase("Nommes"))
            is_nomMes=true;
        if (s2.equalsIgnoreCase("Horadedia"))
            is_horaDedia=true;
        if (s2.equalsIgnoreCase("Codidistricte"))
            is_codiDistricte=true;
        if (s2.equalsIgnoreCase("Nomdistricte"))
            is_Nomdistricte=true;
        if (s2.equalsIgnoreCase("Codicarrer"))
            is_codiCarrer=true;

    }


    @Override
    public void endElement(String uri, String localName, String qName){

        if (qName.equalsIgnoreCase("Registre")){
            Accidents acc = new Accidents();
            acc.setNomBarri(nomBarri);
            acc.setNomCarrer(nomCarrer);
            acc.setDiadesetmana(diaDeSetmana);
            acc.setDiademes(diaDeMes);
            acc.setNommes(nomMes);
            acc.setCodiDistricte(codiDistricte);
            acc.setNomDistricte(Nomdistricte);
            acc.setCodiCarrer(codiCarrer);

            accList.add(acc); }

    }

  /*  @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
    }*/

    @Override
    public void characters(char[] ch, int start, int length){

        String value = new String(ch, start, length).trim();

        if(value.length()==0)return;
        if (is_nomBarri){
            nomBarri = value;
            is_nomBarri = false;
        }else if(is_nomCarrer){
            nomCarrer = value;
            is_nomCarrer= false;
        }else if(is_diaDeSetmana){
            diaDeSetmana = value;
            is_diaDeSetmana= false;
        } else if(is_diaDeMes){
            diaDeMes = value;
            is_diaDeMes= false;
        }else if(is_nomMes){
            nomMes = value;
            is_nomMes= false;
        }else if(is_horaDedia){
            horaDedia = value;
            is_horaDedia= false;
        }else if(is_codiDistricte){
            codiDistricte = value;
            is_codiDistricte= false;
        }else if(is_Nomdistricte){
            Nomdistricte = value;
            is_Nomdistricte= false;
        }else if(is_codiCarrer){
            codiCarrer = value;
            is_codiCarrer= false;
        }
    }

    @Override
    public void startDocument() {System.out.println("Comença a llegir");}

    @Override
    public void endDocument(){System.out.println("Acaba de llegir");}
}




