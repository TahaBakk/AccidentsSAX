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

    String nomBarri ="";
    String nomCarrer ="";
    String diaDeSetmana ="";
    String diaDeMes ="";
    String nomMes ="";
    String horaDedia ="";
    String codiDistricte="";


    @Override
    public void startElement(String s, String s1, String s2, Attributes attributes) throws SAXException {

        if (s.equalsIgnoreCase("Registre"))
            contador_Accidents++;
        if (s.equalsIgnoreCase("Nombarri"))
            is_nomBarri=true;
        if (s.equalsIgnoreCase("Nomcarrer"))
            is_nomCarrer=true;
        if (s.equalsIgnoreCase("Diadesetmana"))
            is_diaDeSetmana=true;
        if (s.equalsIgnoreCase("Diademes"))
            is_diaDeMes=true;
        if (s.equalsIgnoreCase("Nommes"))
            is_nomMes=true;
        if (s.equalsIgnoreCase("Horadedia"))
            is_horaDedia=true;
        if (s.equalsIgnoreCase("Codidistricte"))
            is_codiDistricte=true;


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

            accList.add(acc); }

    }

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
        }



    }

    @Override
    public void startDocument() {System.out.println("Comença a llegir");}

    @Override
    public void endDocument(){System.out.println("Acaba de llegir");}
}



