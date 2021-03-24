/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFicha;
import Conecta.Conexao;
import Autenticacao.Login;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Ficha_Personagem extends javax.swing.JInternalFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public static String nmchar = "";
    public static String id_header = "0";
    public static String id_atb = "0";
    public static String id_persona = "0";
    public static String id_prof = "0";
    public static String id_eqp = "0";
    public static String id_trt = "0";
    public Ficha_Personagem() {
        initComponents();
        conexao = Conexao.conector();
        
        if(conexao == null){
            lbl_Status.setForeground(Color.RED);
            lbl_Status.setText("Desonectado");
        }
        else {
            lbl_Status.setForeground(Color.GREEN);
            lbl_Status.setText("Conectado");      
        }
        
         nm_play.setText(Login.nm);
         
    }
    
    
    public void falso(){
           str_st.setSelected(false);
           dex_st.setSelected(false);
           con_st.setSelected(false);
           int_st.setSelected(false);
           wis_st.setSelected(false);
           cha_st.setSelected(false);
       }
    
    public void prof(){
        int prof = 0;
        int lvl = 0;
        lvl = (Integer) char_level.getValue();
                                           
        if(lvl >= 1 && lvl < 5){
            prof = 2;
            lbl_prof.setText("+" + prof);
            
        } else if (lvl >= 5 && lvl < 9){
            prof = 3;
            lbl_prof.setText("+" + prof);
        } else if (lvl >= 9 && lvl < 13){
            prof = 4;
            lbl_prof.setText("+" + prof);
        } else if (lvl >= 13 && lvl < 17){
            prof = 5;
            lbl_prof.setText("+" + prof);
        } else if (lvl >= 17){
            prof = 6;
            lbl_prof.setText("+" + prof);
        }
    }
    
    public void levelup(){
        int up = 0;
        up = (Integer) char_exp.getValue();
        if (up >= 300 && up < 900){
            char_level.setValue(2);
        } else if (up >= 900 && up < 2700) {
            char_level.setValue(3);
        }  else if (up >= 2700 && up < 6500) {
            char_level.setValue(4);
        } else if (up >= 6500 && up < 14000) {
            char_level.setValue(5);
        } else if (up >= 14000 && up < 23000) {
            char_level.setValue(6);
        } else if (up >= 23000 && up < 34000) {
            char_level.setValue(7);
        } else if (up >= 34000 && up < 48000) {
            char_level.setValue(8);
        } else if (up >= 48000 && up < 64000) {
            char_level.setValue(9);
        } else if (up >= 64000 && up < 85000) {
            char_level.setValue(10);
        } else if (up >= 85000 && up < 100000) {
            char_level.setValue(11);
        } else if (up >= 10000 && up < 120000) {
            char_level.setValue(12);
        } else if (up >= 120000 && up < 140000) {
            char_level.setValue(13);
        } else if (up >= 140000 && up < 165000) {
            char_level.setValue(14);
        } else if (up >= 165000 && up < 195000) {
            char_level.setValue(15);
        } else if (up >= 195000 && up < 225000) {
            char_level.setValue(15);
        } else if (up >= 225000 && up < 265000) {
            char_level.setValue(16);
        } else if (up >= 265000 && up < 265000) {
            char_level.setValue(17);
        } else if (up >= 225000 && up < 305000) {
            char_level.setValue(18);
        } else if (up >= 305000 && up < 355000) {
            char_level.setValue(19);
        } else if (up >= 355000) {
            char_level.setValue(20);
        }
        
    }
    
   public void race(){
       String race;
       race = char_race.getSelectedItem().toString();
       
       
       if (race.equals("Aarakocra")){
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Aasimar")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Caído");
            char_subrace.addItem("Flagelo");
            char_subrace.addItem("Protetor");
       } else if (race.equals("Anão")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Colinas");
            char_subrace.addItem("Montanhas");
            char_subrace.addItem("Profundezas");
       } else if (race.equals("Bugurso")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Centauro")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Changeling")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Draconato")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Azul");
            char_subrace.addItem("Branco");
            char_subrace.addItem("Preto");
            char_subrace.addItem("Vermelho");
            char_subrace.addItem("Verde");
            char_subrace.addItem("Bronze");
            char_subrace.addItem("Cobre");
            char_subrace.addItem("Latão");
            char_subrace.addItem("Ouro");
            char_subrace.addItem("Prata");
       } else if (race.equals("Elfo")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Drow");
            char_subrace.addItem("Alto Elfo");
            char_subrace.addItem("Elfo da Floresta");
       } else if (race.equals("Firbolg")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Forjado")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Genasi")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Água");
            char_subrace.addItem("Ar");
            char_subrace.addItem("Fogo");
            char_subrace.addItem("Terra");
       } else if (race.equals("Gith")) {
            char_subrace.removeAllItems(); 
            char_subrace.addItem("Githyanki");
            char_subrace.addItem("Githzerai");
       } else if (race.equals("Gnomo")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Floresta");
            char_subrace.addItem("Rocha");
       } else if (race.equals("Goblin")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Goliath")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Pequenino")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Coração-Forte");
            char_subrace.addItem("Pés-Leves");
       } else if (race.equals("Híbrido Simic")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Hobgoblin")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Humano")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Variante");
            char_subrace.addItem("Padrão");
       } else if (race.equals("Kalashtar")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Kenku")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Kobold")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Leonin")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Loxodon")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Meio-Elfo")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Meio-Orc")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Minotauro")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Orc")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Povo Lagarto")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Satíro")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Shifter")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Tabaxi")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Tieferino")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Tortle")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Triton")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Vedalken")) {
            char_subrace.removeAllItems();
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Verdan")) {
            char_subrace.removeAllItems(); 
            char_subrace.addItem("Nenhuma");
       } else if (race.equals("Yuan-Ti Sangue Puro")) {
            char_subrace.addItem("Nenhuma");
     }
   }
   
   public void subclass(){
       String classe;
       classe = char_class.getSelectedItem().toString();
       
       if (classe.equals("Artífice")){
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           con_st.setSelected(true);
           int_st.setSelected(true);
           if(lvl >= 3) {
               char_subclass.addItem("Alquimista");
               char_subclass.addItem("Armeiro");
               char_subclass.addItem("Artilharista");
               char_subclass.addItem("Ferreiro de Batalha");
           }
       } else if (classe.equals("Barbáro")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           str_st.setSelected(true);
           con_st.setSelected(true);
           if(lvl >= 3) {
               char_subclass.addItem("Guardião Ancestral");
               char_subclass.addItem("Fúria de Batalha");
               char_subclass.addItem("Berserker");
               char_subclass.addItem("Guerreiro Totêmico");
               char_subclass.addItem("Arauto da Tempestade");
               char_subclass.addItem("Magia Selvagem");
               char_subclass.addItem("Fera");
               char_subclass.addItem("Fanático");
           }
       } else if (classe.equals("Bardo")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           dex_st.setSelected(true);
           cha_st.setSelected(true);
           if(lvl >= 3) {
               char_subclass.addItem("Criação");
               char_subclass.addItem("Eloquência");
               char_subclass.addItem("Glamour");
               char_subclass.addItem("Conhecimento");
               char_subclass.addItem("Lâminas");
               char_subclass.addItem("Bravura");
               char_subclass.addItem("Sussurros");
           }
       } else if (classe.equals("Bruxo")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           wis_st.setSelected(true);
           cha_st.setSelected(true);
           if(lvl >= 1) {
               char_subclass.addItem("O Arquifada");
               char_subclass.addItem("O Celestial");
               char_subclass.addItem("O Profundo");
               char_subclass.addItem("O Corruptor");
               char_subclass.addItem("O Gênio");
               char_subclass.addItem("O Grande Ancião");
               char_subclass.addItem("Lâmina Maldita");
               char_subclass.addItem("O Eterno");
           }
       } else if (classe.equals("Caçador de Sangue")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           dex_st.setSelected(true);
           int_st.setSelected(true);
           if(lvl >= 3) {
               char_subclass.addItem("Caçador de Espectros");
               char_subclass.addItem("Licantropo");
               char_subclass.addItem("Mutante");
               char_subclass.addItem("Alma Profana");
           }
       } else if (classe.equals("Clérigo")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           wis_st.setSelected(true);
           cha_st.setSelected(true);
           if(lvl >= 1) {
               char_subclass.addItem("Arcano");
               char_subclass.addItem("Morte");
               char_subclass.addItem("Forja");
               char_subclass.addItem("Cova");
               char_subclass.addItem("Conhecimento");
               char_subclass.addItem("Vida");
               char_subclass.addItem("Luz");
               char_subclass.addItem("Natureza");
               char_subclass.addItem("Ordem");
               char_subclass.addItem("Paz");
               char_subclass.addItem("Tempestade");
               char_subclass.addItem("Trapaça");
               char_subclass.addItem("Crepúsculo");
               char_subclass.addItem("Guerra");
           }
       } else if (classe.equals("Druida")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           int_st.setSelected(true);
           wis_st.setSelected(true);
           if(lvl >= 2) {
               char_subclass.addItem("Sonhos");
               char_subclass.addItem("Solo");
               char_subclass.addItem("Lua");
               char_subclass.addItem("Pastor");
               char_subclass.addItem("Esporos");
               char_subclass.addItem("Estrelas");
               char_subclass.addItem("Fogo Selvagem");
           }
       } else if (classe.equals("Feiticeiro")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           con_st.setSelected(true);
           cha_st.setSelected(true);
           if(lvl >= 1) {
               char_subclass.addItem("Mente Aberrante");
               char_subclass.addItem("Alma do Relógio");
               char_subclass.addItem("Dracônico");
               char_subclass.addItem("Alma Divina");
               char_subclass.addItem("Sombra");
               char_subclass.addItem("Tormenta");
               char_subclass.addItem("Magia Selvagem");
           }
       } else if (classe.equals("Guardião")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           dex_st.setSelected(true);
           str_st.setSelected(true);
           if(lvl >= 3) {
               char_subclass.addItem("Mestre das Feras");
               char_subclass.addItem("Errante Feérico");
               char_subclass.addItem("Perseguidor Sombrio");
               char_subclass.addItem("Caminhante do Horizonte");
               char_subclass.addItem("Caçador");
               char_subclass.addItem("Caçador de Monstros");
               char_subclass.addItem("Guardião do Enxame");
           }
       } else if (classe.equals("Guerreiro")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           str_st.setSelected(true);
           con_st.setSelected(true);
           if(lvl >= 3) {
               char_subclass.addItem("Arqueiro Arcano");
               char_subclass.addItem("Mestre de Batalha");
               char_subclass.addItem("Cavaleiro");
               char_subclass.addItem("Campeão");
               char_subclass.addItem("Cavaleiro Ecoante");
               char_subclass.addItem("Cavaleiro Arcano");
               char_subclass.addItem("Guerreiro Psiquíco");
               char_subclass.addItem("Cavaleiro Rúnico");
               char_subclass.addItem("Samurai");
           }
       } else if (classe.equals("Ladino")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           dex_st.setSelected(true);
           int_st.setSelected(true);
           if(lvl >= 3) {
               char_subclass.addItem("Trapaceiro Arcano");
               char_subclass.addItem("Inquisidor");
               char_subclass.addItem("Assassino");
               char_subclass.addItem("Manipulador");
               char_subclass.addItem("Fantasma");
               char_subclass.addItem("Batedor");
               char_subclass.addItem("Lâmina Espectral");
               char_subclass.addItem("Duelista");
               char_subclass.addItem("Ladrão");
           }
       } else if (classe.equals("Mago")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           wis_st.setSelected(true);
           int_st.setSelected(true);
           if(lvl >= 2) {
               char_subclass.addItem("Abjuração");
               char_subclass.addItem("Lâmina Cantante");
               char_subclass.addItem("Cronomancia");
               char_subclass.addItem("Conjuração");
               char_subclass.addItem("Adivinhação");
               char_subclass.addItem("Encantamento");
               char_subclass.addItem("Evocação");
               char_subclass.addItem("Graviturgia");
               char_subclass.addItem("Ilusão");
               char_subclass.addItem("Necromancia");
               char_subclass.addItem("Ordem dos Escribas");
               char_subclass.addItem("Transmutação");
               char_subclass.addItem("Magia de Guerra");
           }
       } else if (classe.equals("Monge")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           dex_st.setSelected(true);
           str_st.setSelected(true);
           if(lvl >= 3) {
               char_subclass.addItem("Eu-Astral");
               char_subclass.addItem("Mestre Bêbado");
               char_subclass.addItem("Quatro Elementos");
               char_subclass.addItem("Kensei");
               char_subclass.addItem("Longa Morte");
               char_subclass.addItem("Misericórdia");
               char_subclass.addItem("Palma Aberta");
               char_subclass.addItem("Sombra");
               char_subclass.addItem("Alma Solar");
           }
       } else if (classe.equals("Paladino")) {
           char_subclass.removeAllItems();
           int lvl = 0;
           lvl = (Integer) char_level.getValue();
           falso();
           wis_st.setSelected(true);
           cha_st.setSelected(true);
           if(lvl >= 3) {
               char_subclass.addItem("Ancião");
               char_subclass.addItem("Conquista");
               char_subclass.addItem("Coroa");
               char_subclass.addItem("Devoção");
               char_subclass.addItem("Glória");
               char_subclass.addItem("Redenção");
               char_subclass.addItem("Vingança");
               char_subclass.addItem("Vigia");
               char_subclass.addItem("Quebrador do Juramento");
           }
       }
   }
   
   public void str(){
       int str = 0, modstr;
       str = (Integer) char_str.getValue();
       modstr = (str - 10)/2;
       String x = String.valueOf(modstr); 
       if (modstr > 0){
            lbl_str.setText("+" + x);
            String y = lbl_str.getText();
            atle_skill.setText("Atletismo (For)" + "("+y+")");
       } else if (modstr <= 0)
           lbl_str.setText(x);
           String y = lbl_str.getText();
           atle_skill.setText("Atletismo (For)" + "("+y+")");
   }
   
   public void dex(){
       int dex = 0, moddex;
       dex = (Integer) char_dex.getValue();
       moddex = (dex - 10)/2;
       String x = String.valueOf(moddex);
       boolean vdd = true;
       int ca = 10;
       int init = 0;
       int vary = 0, varx = 0;
       if (moddex > 0){
            lbl_dex.setText("+" + x);
            String y = lbl_dex.getText();
            acro_skill.setText(null);
            pres_skill.setText(null);
            stl_skill.setText(null);
            acro_skill.setText("Acrobacia (Des)" + "("+y+")");
            pres_skill.setText("Presitidigitação (Des)" + "("+y+")");
            stl_skill.setText("Furtividade (Des)" + "("+y+")");
            vary = ca + moddex;
            char_ca.setValue(vary);
            varx = init + moddex;
            char_init.setValue(varx);
       } else if (moddex <= 0)
           lbl_dex.setText(x);
           String y = lbl_dex.getText();
           acro_skill.setText(null);
           pres_skill.setText(null);
           stl_skill.setText(null);
           acro_skill.setText("Acrobacia (Des)" + "("+y+")");
           pres_skill.setText("Presitidigitação (Des)" + "("+y+")");
           stl_skill.setText("Furtividade (Des)" + "("+y+")");
           vary = ca + moddex;
           char_ca.setValue(vary);
           varx = init + moddex;
           char_init.setValue(varx);
   }
   
   public void con(){
       int con = 0, modcon;
       con = (Integer) char_con.getValue();
       modcon = (con - 10)/2;
       String x = String.valueOf(modcon); 
       if (modcon > 0){
           lbl_con.setText("+" + x);
       } else if (modcon <= 0)
           lbl_con.setText(x);
   }
   
   public void inte(){
       int inte = 0, modint;
       inte = (Integer) char_int.getValue();
       modint = (inte - 10)/2;
       String x = String.valueOf(modint);
       if (modint > 0){
            lbl_int.setText("+" + x);
            String y = lbl_int.getText();
            arc_skill.setText(null);
            his_skill.setText(null);
            inv_skill.setText(null);
            rel_skill.setText(null);
            arc_skill.setText("Arcanismo (Int) " + "( "+y+")");
            his_skill.setText("História (Int) " + "( "+y+")");
            inv_skill.setText("Investigação (Int) " + "( "+y+")");
            nat_skill.setText("Natureza (Int) " + "( "+y+")");
            rel_skill.setText("Religião (Int) " + "( "+y+")");
       } else if (modint <= 0)
            lbl_int.setText(x);
            String y = lbl_int.getText();
            arc_skill.setText(null);
            his_skill.setText(null);
            inv_skill.setText(null);
            rel_skill.setText(null);
            arc_skill.setText("Arcanismo (Int) " + "( "+y+")");
            his_skill.setText("História (Int) " + "( "+y+")");
            inv_skill.setText("Investigação (Int) " + "( "+y+")");
            nat_skill.setText("Natureza (Int) " + "( "+y+")");
            rel_skill.setText("Religião (Int) " + "( "+y+")");
            
   }
   
   public void wis(){
       int wis = 0, modwis;
       wis = (Integer) char_wis.getValue();
       modwis = (wis - 10)/2;
       String x = String.valueOf(modwis);
       if (modwis > 0){
            lbl_wis.setText("+" + x);
            String y = lbl_wis.getText();
            ins_skill.setText(null);
            med_skill.setText(null);
            per_skill.setText(null);
            sur_skill.setText(null);
            ins_skill.setText("Intuição (Sab) " + "( "+y+")");
            med_skill.setText("Medicina (Sab) " + "( "+y+")");
            per_skill.setText("Percepção (Sab) " + "( "+y+")");
            sur_skill.setText("Sobrevivência (Sab) " + "( "+y+")");
            passive_per.setText(y);
       } else if (modwis <= 0)
           lbl_wis.setText(x);
            String y = lbl_wis.getText();
            ins_skill.setText(null);
            med_skill.setText(null);
            per_skill.setText(null);
            sur_skill.setText(null);
            ins_skill.setText("Intuição (Sab) " + "("+y+")");
            med_skill.setText("Medicina (Sab) " + "("+y+")");
            per_skill.setText("Percepção (Sab) " + "("+y+")");
            sur_skill.setText("Sobrevivência (Sab) " + "("+y+")");
            passive_per.setText(y);
   }
   
   public void cha(){
       int cha = 0, modcha;
       cha = (Integer) char_cha.getValue();
       modcha = (cha - 10)/2;
       String x = String.valueOf(modcha); 
       if (modcha > 0){
            lbl_cha.setText("+" + x);
            String y = lbl_cha.getText();
            ani_skill.setText(null);
            dec_skill.setText(null);
            perf_skill.setText(null);
            pers_skill.setText(null);
            ani_skill.setText("Adestrar Animais (Car)" + "("+y+")");
            dec_skill.setText("Enganação (Car)" + "("+y+")");
            perf_skill.setText("Performace (Car)" + "("+y+")");
            pers_skill.setText("Persuasão (Car)" + "("+y+")");
       } else if (modcha <= 0)
            lbl_cha.setText(x);
            String y = lbl_cha.getText();
            ani_skill.setText(null);
            dec_skill.setText(null);
            perf_skill.setText(null);
            pers_skill.setText(null);
            ani_skill.setText("Adestrar Animais (Car)" + "("+y+")");
            dec_skill.setText("Enganação (Car)" + "("+y+")");
            perf_skill.setText("Performace (Car)" + "("+y+")");
            pers_skill.setText("Persuasão (Car)" + "("+y+")");
   }
   
   private boolean findCod() {
        PreparedStatement pstFind = null;
        ResultSet rsFind = null;
        boolean ret = false;
        
        String sql = "select * from tb_header1 where nm_char = ?";
        
        try {
            pstFind = conexao.prepareStatement(sql);
            pstFind.setString(1, nm_char.getText());
            rsFind = pstFind.executeQuery();
            if (rsFind.next()) {
                ret = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ret;
    }
   
   private void salvar(){
     String sql = "insert into tb_header1(nm_char,char_class,char_subclass,char_level,char_race,char_subrace,char_bagd,char_ali,nm_play,char_exp) values (?,?,?,?,?,?,?,?,?,?)";

     try {
        pst = conexao.prepareStatement(sql);
        pst.setString(1, nm_char.getText());
        pst.setString(2, char_class.getSelectedItem().toString());
        pst.setString(3, char_subclass.getSelectedItem().toString());
        pst.setInt(4,(Integer) char_level.getValue());
        pst.setString(5, char_race.getSelectedItem().toString());
        pst.setString(6, char_subrace.getSelectedItem().toString());
        pst.setString(7, char_bagd.getText());
        pst.setString(8, char_ali.getSelectedItem().toString());
        pst.setString(9, nm_play.getText());
        pst.setInt   (10,(Integer) char_exp.getValue());
        
         if (nm_char.getText().isEmpty() || char_bagd.getText().isEmpty() || nm_play.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos");
        } else {
 
            boolean bAchou = findCod();
            System.out.println(bAchou);
            if (bAchou == true) {
                JOptionPane.showMessageDialog(null,"Nome de Personagem já existe", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                int adicionado = pst.executeUpdate();
                
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Aviso", JOptionPane.PLAIN_MESSAGE);
                    nm_char.setText("Nome do Personagem"); 
                    char_class.setSelectedItem("Artífice");
                    char_subclass.setSelectedItem("");
                    char_level.setValue(0);
                    char_race.setSelectedItem("Aarakocra");
                    char_subrace.setSelectedItem("Nenhuma");
                    char_bagd.setText("Background"); 
                    char_ali.setSelectedItem("Leal e Bom");
                    nm_play.setText(Login.nm); 
                    
                }
            }
        }
         
     } catch (Exception e) {
         System.out.println(e);
     }
   } 
    
   private void salvar_atb(){
       String sql1 = "insert into tb_atb (char_str,char_dex,char_con,char_int,char_wis,char_cha,char_des,char_hp_tt,char_hp_at,char_hp_tp,char_dth_st,char_ca,char_init) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
       try{
         pst = conexao.prepareStatement(sql1);
         pst.setInt(1,(Integer) char_str.getValue());
         pst.setInt(2,(Integer) char_dex.getValue());
         pst.setInt(3,(Integer) char_con.getValue());
         pst.setInt(4,(Integer) char_int.getValue());
         pst.setInt(5,(Integer) char_wis.getValue());
         pst.setInt(6,(Integer) char_cha.getValue());
         pst.setInt(7,(Integer) char_des.getValue());
         pst.setInt(8,(Integer) char_hp_tt.getValue());
         pst.setInt(9,(Integer) char_hp_at.getValue());
         pst.setInt(10,(Integer) char_hp_tp.getValue());
         pst.setInt(11,(Integer) char_dth_st.getValue());
         pst.setInt(12,(Integer) char_ca.getValue());
         pst.setInt(13,(Integer) char_init.getValue());
         
         int adicionado = pst.executeUpdate();
                
                if (adicionado > 0) {
                    char_str.setValue(10);
                    char_dex.setValue(10);
                    char_con.setValue(10);
                    char_int.setValue(10);
                    char_wis.setValue(10);
                    char_cha.setValue(10);
                    char_des.setValue(0);
                    char_hp_tt.setValue(0);
                    char_hp_at.setValue(0);
                    char_hp_tp.setValue(0);
                    char_dth_st.setValue(0);
                    char_ca.setValue(10);
                    char_init.setValue(0); 
                    
            }
       } catch (Exception e){
           System.out.println();
       }
   }
   
   private void salvar_persona(){
       String sql2 = "insert into tb_per_trt (char_per,char_ids,char_bds,char_flw) values (?,?,?,?)";
       
       try{
         pst = conexao.prepareStatement(sql2);
         pst.setString(1,char_per.getText());
         pst.setString(2,char_ids.getText());
         pst.setString(3,char_bds.getText());
         pst.setString(4,char_flw.getText());
         
         int adicionado = pst.executeUpdate();
                
                if (adicionado > 0) {
                    char_per.setText(null); 
                    char_ids.setText(null); 
                    char_bds.setText(null); 
                    char_flw.setText(null);  
                    
            }
         
       } catch (Exception e) {
           System.out.println(e);
       }
   }
   
   private void salvar_oth_prof(){
       String sql3 = "insert into tb_oth_prof (char_oth_prof) value (?)";
    try {
         pst=conexao.prepareStatement(sql3);
         pst.setString(1, char_oth_prof.getText());
         
         int adicionado = pst.executeUpdate();
                
                if (adicionado > 0) {
                    char_oth_prof.setText(null); 
                    
            }
    } catch (Exception e){
           System.out.println(e);
    }
   }
   
   private void salvar_eqp(){
       String sql4 = "insert into tb_eqp (char_cp,char_sp,char_ep,char_gp,char_pp,char_eqp) values (?,?,?,?,?,?)";
       
       try{
         pst=conexao.prepareStatement(sql4);
         pst.setInt   (1,(Integer) char_cp.getValue());
         pst.setInt   (2,(Integer) char_sp.getValue());
         pst.setInt   (3,(Integer) char_ep.getValue());
         pst.setInt   (4,(Integer) char_gp.getValue());
         pst.setInt   (5,(Integer) char_pp.getValue());
         pst.setString(6, char_eqp.getText()); 
         
         int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                    char_cp.setValue(0);
                    char_sp.setValue(0);
                    char_ep.setValue(0);
                    char_gp.setValue(0);
                    char_pp.setValue(0);
                    char_eqp.setText(null); 
                    
            }
       } catch (Exception e){
           System.out.println(e);
       }
   }
   
   private void salvar_traits(){
        String sql5 = "insert into tb_traits (desc_trt) value (?)";  
        
        try{
         pst=conexao.prepareStatement(sql5);
         pst.setString(1, desc_trt.getText()); 
         
         int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                    desc_trt.setText(null);       
            }
       } catch (Exception e){
           System.out.println(e);
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel21 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nm_char = new javax.swing.JTextField();
        char_class = new javax.swing.JComboBox<>();
        char_race = new javax.swing.JComboBox<>();
        char_level = new javax.swing.JSpinner();
        char_bagd = new javax.swing.JTextField();
        char_ali = new javax.swing.JComboBox<>();
        char_subrace = new javax.swing.JComboBox<>();
        nm_play = new javax.swing.JTextField();
        char_subclass = new javax.swing.JComboBox<>();
        char_exp = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btn_adicionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        char_str = new javax.swing.JSpinner();
        lbl_str = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_dex = new javax.swing.JLabel();
        char_dex = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        char_con = new javax.swing.JSpinner();
        lbl_con = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        char_int = new javax.swing.JSpinner();
        lbl_int = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        char_wis = new javax.swing.JSpinner();
        lbl_wis = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        char_cha = new javax.swing.JSpinner();
        lbl_cha = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        char_ca = new javax.swing.JSpinner();
        jPanel18 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        char_hp_tt = new javax.swing.JSpinner();
        char_hp_at = new javax.swing.JSpinner();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        char_init = new javax.swing.JSpinner();
        jPanel19 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        char_hp_tp = new javax.swing.JSpinner();
        char_hp_tp_at = new javax.swing.JSpinner();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        char_des = new javax.swing.JSpinner();
        jPanel25 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        char_dth_st = new javax.swing.JSpinner();
        jPanel26 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        char_pp = new javax.swing.JSpinner();
        char_cp = new javax.swing.JSpinner();
        char_sp = new javax.swing.JSpinner();
        char_ep = new javax.swing.JSpinner();
        char_gp = new javax.swing.JSpinner();
        jPanel27 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        char_oth_prof = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        char_eqp = new javax.swing.JTextArea();
        jPanel29 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbl_prof = new javax.swing.JLabel();
        saving_throws = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dex_st = new javax.swing.JCheckBox();
        con_st = new javax.swing.JCheckBox();
        wis_st = new javax.swing.JCheckBox();
        str_st = new javax.swing.JCheckBox();
        cha_st = new javax.swing.JCheckBox();
        int_st = new javax.swing.JCheckBox();
        lbl_Status = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        char_per = new javax.swing.JTextArea();
        jPanel24 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        char_flw = new javax.swing.JTextArea();
        jPanel22 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        char_ids = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc_trt = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        char_bds = new javax.swing.JTextArea();
        jPanel31 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        acro_skill = new javax.swing.JCheckBox();
        atle_skill = new javax.swing.JCheckBox();
        arc_skill = new javax.swing.JCheckBox();
        ani_skill = new javax.swing.JCheckBox();
        dec_skill = new javax.swing.JCheckBox();
        his_skill = new javax.swing.JCheckBox();
        ins_skill = new javax.swing.JCheckBox();
        inv_skill = new javax.swing.JCheckBox();
        med_skill = new javax.swing.JCheckBox();
        nat_skill = new javax.swing.JCheckBox();
        per_skill = new javax.swing.JCheckBox();
        perf_skill = new javax.swing.JCheckBox();
        pers_skill = new javax.swing.JCheckBox();
        rel_skill = new javax.swing.JCheckBox();
        pres_skill = new javax.swing.JCheckBox();
        stl_skill = new javax.swing.JCheckBox();
        sur_skill = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        passive_per = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setMaximizable(true);
        setResizable(true);
        setTitle("Dungeons and Drives - Ficha de Personagem");
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jScrollPane7MouseDragged(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentHidden(evt);
            }
        });

        nm_char.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        nm_char.setText("Nome de Personagem");

        char_class.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        char_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artífice", "Barbáro", "Bardo", "Bruxo", "Caçador de Sangue", "Clérigo", "Druida", "Feiticeiro", "Guardião", "Guerreiro", "Ladino", "Mago", "Monge", "Paladino" }));
        char_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                char_classActionPerformed(evt);
            }
        });

        char_race.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        char_race.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aarakocra", "Aasimar", "Anão", "Bugurso", "Centauro", "Changeling", "Draconato", "Elfo", "Firbolg", "Forjado", "Genasi", "Gith", "Gnomo", "Goblin", "Goliath", "Híbrido Símico", "Hobgoblin", "Humano", "Kalashtar", "Kenku", "Kobold", "Leonin", "Loxodon", "Meio-Elfo", "Meio-Orc", "Minotauro", "Orc", "Pequenino", "Povo Lagarto", "Satíro", "Shifter", "Tabaxi", "Tieferino", "Tortle", "Triton", "Vedalken", "Verdan", "Yuan-Ti Sangue Puro" }));
        char_race.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                char_raceActionPerformed(evt);
            }
        });

        char_level.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        char_level.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        char_level.setPreferredSize(new java.awt.Dimension(50, 36));
        char_level.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                char_levelStateChanged(evt);
            }
        });
        char_level.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                char_levelComponentShown(evt);
            }
        });

        char_bagd.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        char_bagd.setText("Background");
        char_bagd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                char_bagdActionPerformed(evt);
            }
        });

        char_ali.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        char_ali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leal e Bom", "Neutro e Bom", "Caótico e Bom", "Leal e Neutro", "Neutro", "Caótico e Neutro", "Leal e Mau", "Neutro e Mau", "Caótico e Mau" }));

        char_subrace.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N

        nm_play.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        nm_play.setText("Nome do Jogador");
        nm_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nm_playActionPerformed(evt);
            }
        });

        char_subclass.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N

        char_exp.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        char_exp.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        char_exp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                char_expStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setText("XP");

        btn_adicionar.setBackground(new java.awt.Color(102, 102, 255));
        btn_adicionar.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btn_adicionar.setForeground(new java.awt.Color(255, 255, 255));
        btn_adicionar.setText("ADICIONAR");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nm_char)
                    .addComponent(char_bagd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nm_play))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(char_class, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(char_level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(char_subclass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(char_race, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(char_ali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(char_subrace, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(char_exp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_adicionar)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {char_class, char_subclass});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nm_char)
                    .addComponent(char_class)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(char_race)
                        .addComponent(btn_adicionar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(char_bagd)
                    .addComponent(char_level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(char_ali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(char_subrace)
                    .addComponent(nm_play)
                    .addComponent(char_subclass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(char_exp))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Força");

        char_str.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        char_str.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        char_str.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                char_strStateChanged(evt);
            }
        });

        lbl_str.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lbl_str.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(char_str, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_str, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_str, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(char_str, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Destreza");

        lbl_dex.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lbl_dex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dex.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lbl_dexComponentAdded(evt);
            }
        });

        char_dex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        char_dex.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        char_dex.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                char_dexStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(char_dex, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_dex, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(char_dex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Constituição");

        char_con.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        char_con.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        char_con.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                char_conStateChanged(evt);
            }
        });

        lbl_con.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lbl_con.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_con.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lbl_conComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(char_con, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_con, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(char_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Inteligência");

        char_int.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        char_int.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        char_int.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                char_intStateChanged(evt);
            }
        });

        lbl_int.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lbl_int.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_int.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lbl_intComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_int, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(char_int, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_int, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(char_int, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sabedoria");

        char_wis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        char_wis.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        char_wis.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                char_wisStateChanged(evt);
            }
        });

        lbl_wis.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lbl_wis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_wis.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lbl_wisComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_wis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(char_wis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_wis, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(char_wis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.setPreferredSize(new java.awt.Dimension(116, 124));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Carisma");

        char_cha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        char_cha.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        char_cha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                char_chaStateChanged(evt);
            }
        });

        lbl_cha.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lbl_cha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cha.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lbl_chaComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(char_cha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_cha, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(char_cha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Atributos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(153, 153, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CA");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        char_ca.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_ca.setModel(new javax.swing.SpinnerNumberModel(10, 0, 30, 1));
        char_ca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(char_ca, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(char_ca, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Pontos de Vida Máx.");

        char_hp_tt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_hp_tt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        char_hp_tt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        char_hp_at.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        char_hp_at.setModel(new javax.swing.SpinnerNumberModel());
        char_hp_at.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(6, 6, 6)
                        .addComponent(char_hp_tt))
                    .addComponent(char_hp_at))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(char_hp_tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(char_hp_at, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Iniciativa");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        char_init.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_init.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        char_init.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(char_init))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(char_init, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Pontos de Vida Temp.");

        char_hp_tp.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_hp_tp.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        char_hp_tp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        char_hp_tp_at.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        char_hp_tp_at.setModel(new javax.swing.SpinnerNumberModel());
        char_hp_tp_at.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(char_hp_tp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(char_hp_tp_at)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(char_hp_tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(char_hp_tp_at, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Deslocamento");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        char_des.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_des.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        char_des.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(char_des)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(char_des, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Jogadas de Salvamento de Morte");

        char_dth_st.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        char_dth_st.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        char_dth_st.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(char_dth_st)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(char_dth_st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(153, 153, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Moedas");

        jLabel28.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("PC:");

        jLabel29.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("PP:");

        jLabel30.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("PE:");

        jLabel31.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("PO:");

        jLabel32.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("PLP:");

        char_pp.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_pp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        char_cp.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_cp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        char_sp.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_sp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        char_ep.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_ep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        char_gp.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        char_gp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(char_cp, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(char_sp)
                            .addComponent(char_ep)
                            .addComponent(char_gp)
                            .addComponent(char_pp))))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(char_cp))
                .addGap(3, 3, 3)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(char_sp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(char_ep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(char_gp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(char_pp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(153, 153, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel27.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Outras Proficiências & Línguas");

        char_oth_prof.setColumns(20);
        char_oth_prof.setRows(5);
        char_oth_prof.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane11.setViewportView(char_oth_prof);

        jLabel33.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Equipamentos");

        char_eqp.setColumns(20);
        char_eqp.setRows(5);
        char_eqp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane9.setViewportView(char_eqp);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jScrollPane11)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(153, 153, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.setPreferredSize(new java.awt.Dimension(75, 120));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Proficiência");

        lbl_prof.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        lbl_prof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_prof.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_prof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_prof, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        saving_throws.setBackground(new java.awt.Color(255, 255, 255));
        saving_throws.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Jogadas de Salvamento");

        dex_st.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        dex_st.setText("Destreza");

        con_st.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        con_st.setText("Constituição");

        wis_st.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        wis_st.setText("Sabedoria");

        str_st.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        str_st.setText("Força");

        cha_st.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        cha_st.setText("Carisma");

        int_st.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        int_st.setText("Inteligência");

        javax.swing.GroupLayout saving_throwsLayout = new javax.swing.GroupLayout(saving_throws);
        saving_throws.setLayout(saving_throwsLayout);
        saving_throwsLayout.setHorizontalGroup(
            saving_throwsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(saving_throwsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(saving_throwsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dex_st, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(con_st, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(str_st, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cha_st, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wis_st, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(int_st, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        saving_throwsLayout.setVerticalGroup(
            saving_throwsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saving_throwsLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(str_st, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dex_st, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(con_st, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(int_st, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wis_st, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cha_st, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saving_throws, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saving_throws, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        lbl_Status.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Traços de Personalidade");

        char_per.setColumns(20);
        char_per.setRows(5);
        char_per.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane6.setViewportView(char_per);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Defeitos");

        char_flw.setColumns(20);
        char_flw.setRows(5);
        char_flw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane5.setViewportView(char_flw);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Ideais");

        char_ids.setColumns(20);
        char_ids.setRows(5);
        char_ids.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(char_ids);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        desc_trt.setColumns(20);
        desc_trt.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        desc_trt.setRows(5);
        desc_trt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(desc_trt);

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Características e Habilidades");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Ligações");

        char_bds.setColumns(20);
        char_bds.setRows(5);
        char_bds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(char_bds);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(153, 153, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Perícias");

        acro_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        acro_skill.setText("Acrobacias (Des)");
        acro_skill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acro_skillActionPerformed(evt);
            }
        });

        atle_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        atle_skill.setText("Atletismo (For)");

        arc_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        arc_skill.setText("Arcanismo (Int)");

        ani_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        ani_skill.setText("Adestrar Animais (Car)");
        ani_skill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ani_skillActionPerformed(evt);
            }
        });

        dec_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        dec_skill.setText("Enganação (Car)");

        his_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        his_skill.setText("História (Int)");

        ins_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        ins_skill.setText("Intuição (Sab)");

        inv_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        inv_skill.setText("Investigação (Int)");

        med_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        med_skill.setText("Medicina (Sab)");

        nat_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        nat_skill.setText("Natureza (Int)");

        per_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        per_skill.setText("Percepção (Sab)");

        perf_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        perf_skill.setText("Performace (Car)");

        pers_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pers_skill.setText("Persuasão (Car)");

        rel_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        rel_skill.setText("Religião (Int)");

        pres_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        pres_skill.setText("Prestidigitação (Des)");

        stl_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        stl_skill.setText("Furtividade (Des)");

        sur_skill.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        sur_skill.setText("Subrevivência (Sab)");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rel_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sur_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stl_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pres_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pers_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(perf_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(per_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nat_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(med_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inv_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ins_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(his_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dec_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ani_skill, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addComponent(arc_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atle_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acro_skill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acro_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(atle_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arc_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ani_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dec_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(his_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ins_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inv_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(med_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nat_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(per_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perf_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pers_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rel_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pres_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stl_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sur_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Percepção Passiva");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        passive_per.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        passive_per.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passive_per, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passive_per, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(lbl_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(lbl_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(760, 760, 760))
        );

        jScrollPane7.setViewportView(jPanel21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void char_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_char_classActionPerformed
        subclass();
    }//GEN-LAST:event_char_classActionPerformed

    private void jPanel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentHidden
        
    }//GEN-LAST:event_jPanel1ComponentHidden

    private void char_raceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_char_raceActionPerformed
        race();
    }//GEN-LAST:event_char_raceActionPerformed

    private void char_bagdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_char_bagdActionPerformed
        
    }//GEN-LAST:event_char_bagdActionPerformed

    private void char_levelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_char_levelComponentShown
        
    }//GEN-LAST:event_char_levelComponentShown

    private void char_strStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_char_strStateChanged
        str();
    }//GEN-LAST:event_char_strStateChanged

    private void lbl_dexComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lbl_dexComponentAdded
  
    }//GEN-LAST:event_lbl_dexComponentAdded

    private void lbl_conComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lbl_conComponentAdded
 
    }//GEN-LAST:event_lbl_conComponentAdded

    private void lbl_intComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lbl_intComponentAdded

    }//GEN-LAST:event_lbl_intComponentAdded

    private void lbl_wisComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lbl_wisComponentAdded
      
    }//GEN-LAST:event_lbl_wisComponentAdded

    private void lbl_chaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lbl_chaComponentAdded

    }//GEN-LAST:event_lbl_chaComponentAdded

    private void char_dexStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_char_dexStateChanged
        dex();
    }//GEN-LAST:event_char_dexStateChanged

    private void char_conStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_char_conStateChanged
       con();
    }//GEN-LAST:event_char_conStateChanged

    private void char_intStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_char_intStateChanged
        inte();
    }//GEN-LAST:event_char_intStateChanged

    private void char_wisStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_char_wisStateChanged
        wis();
    }//GEN-LAST:event_char_wisStateChanged

    private void char_chaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_char_chaStateChanged
        cha();
    }//GEN-LAST:event_char_chaStateChanged

    private void char_levelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_char_levelStateChanged
        prof();
    }//GEN-LAST:event_char_levelStateChanged

    private void char_expStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_char_expStateChanged
        levelup();
    }//GEN-LAST:event_char_expStateChanged

    private void acro_skillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acro_skillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acro_skillActionPerformed

    private void ani_skillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ani_skillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ani_skillActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        salvar();
        salvar_atb();
        salvar_persona();
        salvar_oth_prof();
        salvar_eqp();
        salvar_traits();
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void nm_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nm_playActionPerformed
        
    }//GEN-LAST:event_nm_playActionPerformed

    private void jScrollPane7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane7MouseDragged

    }//GEN-LAST:event_jScrollPane7MouseDragged

    private javax.swing.JTable att_ob;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acro_skill;
    private javax.swing.JCheckBox ani_skill;
    private javax.swing.JCheckBox arc_skill;
    private javax.swing.JCheckBox atle_skill;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JCheckBox cha_st;
    private javax.swing.JComboBox<String> char_ali;
    private javax.swing.JTextField char_bagd;
    private javax.swing.JTextArea char_bds;
    private javax.swing.JSpinner char_ca;
    private javax.swing.JSpinner char_cha;
    private javax.swing.JComboBox<String> char_class;
    private javax.swing.JSpinner char_con;
    private javax.swing.JSpinner char_cp;
    private javax.swing.JSpinner char_des;
    private javax.swing.JSpinner char_dex;
    private javax.swing.JSpinner char_dth_st;
    private javax.swing.JSpinner char_ep;
    private javax.swing.JTextArea char_eqp;
    private javax.swing.JSpinner char_exp;
    private javax.swing.JTextArea char_flw;
    private javax.swing.JSpinner char_gp;
    private javax.swing.JSpinner char_hp_at;
    private javax.swing.JSpinner char_hp_tp;
    private javax.swing.JSpinner char_hp_tp_at;
    private javax.swing.JSpinner char_hp_tt;
    private javax.swing.JTextArea char_ids;
    private javax.swing.JSpinner char_init;
    private javax.swing.JSpinner char_int;
    private javax.swing.JSpinner char_level;
    private javax.swing.JTextArea char_oth_prof;
    private javax.swing.JTextArea char_per;
    private javax.swing.JSpinner char_pp;
    private javax.swing.JComboBox<String> char_race;
    private javax.swing.JSpinner char_sp;
    private javax.swing.JSpinner char_str;
    private javax.swing.JComboBox<String> char_subclass;
    private javax.swing.JComboBox<String> char_subrace;
    private javax.swing.JSpinner char_wis;
    private javax.swing.JCheckBox con_st;
    private javax.swing.JCheckBox dec_skill;
    private javax.swing.JTextArea desc_trt;
    private javax.swing.JCheckBox dex_st;
    private javax.swing.JCheckBox his_skill;
    private javax.swing.JCheckBox ins_skill;
    private javax.swing.JCheckBox int_st;
    private javax.swing.JCheckBox inv_skill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lbl_Status;
    private javax.swing.JLabel lbl_cha;
    private javax.swing.JLabel lbl_con;
    private javax.swing.JLabel lbl_dex;
    private javax.swing.JLabel lbl_int;
    private javax.swing.JLabel lbl_prof;
    private javax.swing.JLabel lbl_str;
    private javax.swing.JLabel lbl_wis;
    private javax.swing.JCheckBox med_skill;
    private javax.swing.JCheckBox nat_skill;
    private javax.swing.JTextField nm_char;
    private javax.swing.JTextField nm_play;
    private javax.swing.JLabel passive_per;
    private javax.swing.JCheckBox per_skill;
    private javax.swing.JCheckBox perf_skill;
    private javax.swing.JCheckBox pers_skill;
    private javax.swing.JCheckBox pres_skill;
    private javax.swing.JCheckBox rel_skill;
    private javax.swing.JPanel saving_throws;
    private javax.swing.JCheckBox stl_skill;
    private javax.swing.JCheckBox str_st;
    private javax.swing.JCheckBox sur_skill;
    private javax.swing.JCheckBox wis_st;
    // End of variables declaration//GEN-END:variables

}
