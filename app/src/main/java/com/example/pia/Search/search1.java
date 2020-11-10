package com.example.pia.Search;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class search1 extends AppCompatActivity {
    public static HashMap<String, Meanings> listEn_Vn = new HashMap<String, Meanings>();
    public static List<String> listKey_EN_VN = new ArrayList<String>();
    public static final int MAX = 20;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ReadFile_EN_VN();
    }
    /*
        ReadFile Viet_Anh.xml
    */
    public void ReadFile_EN_VN(){
        File En_Vn_XML = null;
        try{
            En_Vn_XML = new File("xml\\Anh_Viet.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc  = dBuilder.parse(En_Vn_XML);

            doc.getDocumentElement().normalize();

            NodeList list = doc.getElementsByTagName("record");
            for(int i = 0; i < list.getLength(); i++){
                Node node = list.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element elm = (Element)node;
                    String keyword;
                    // get word ENGLISH
                    keyword = elm.getElementsByTagName("word").item(0).getTextContent().toString();
                    listKey_EN_VN.add(keyword);
                    String waitpro;
                    Meanings temp;
                    waitpro = elm.getElementsByTagName("meaning").item(0).getTextContent().toString();
                    /*
                        String processing into 3 components
                            +   pronunciation
                            +   attrubute
                            +   listword
                            +   Key
                    */
                    String[] edit_1 = waitpro.split("\\*");
                    //Has attribute
                    if(edit_1.length > 1){
                        String[] edit_2 = edit_1[1].split("(?=-)", 2);
                        if(edit_2.length > 1){
                            temp = new Meanings(edit_1[0],edit_2[0], edit_2[1], keyword);
                        }
                        else{
                            temp = new Meanings(edit_1[0],edit_2[0], "No define!!!", keyword);

                        }
                        if(temp!= null)
                            listEn_Vn.put(keyword, temp);

                    }
                    //No attribute
                    else{
                        String[] edit_3 = waitpro.split("(?=-)", 2);
                        if(edit_3.length > 1)
                        {
                            temp = new Meanings(edit_3[0], "Not defined!!!", edit_3[1], keyword);

                        }
                        else{
                            temp = new Meanings(edit_3[0], "Not defined!!!", "Not defined!!!", keyword);
                        }
                        if(temp != null)
                            listEn_Vn.put(keyword,temp);
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println("ReadFile Error!!!");
        }
    }

    // Lookup KeyWord EN -> VN
    public Meanings LookUpEN_VN(AutoCompleteTextView Key){
        return listEn_Vn.get(Key);
    }

}
