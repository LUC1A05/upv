with motak;
use motak;

with Ada.Text_Io;
use Ada.Text_Io;


with alderdien_botoen_lista_idatzi, aulkiak_idatzi, aulkiak_banatu;


procedure proba_aulkiak_banatu is


   L_P_V_Originala : T_lista_alderdien_botoak;
   aulkiak: T_lista_aulkiak;

begin
   put ("lehenengo kasua alderdi bakarra du ");
   L_P_V_Originala.Alderdi_kop:=1;
   L_P_V_Originala.Alderdien_taula(1) := ("       alderdi1", 80141);

   Put_Line("eta alderdi horien informazioa honakoa da: ");
   alderdien_botoen_lista_idatzi(L_P_V_Originala);
   Put_Line("eta emaitzak izan behar du  ");
   Put_Line("alderdi1 -> 25 aulki");
   new_line(2);
   Put_Line("eta zuen programak dio   ");
   aulkiak_banatu(L_P_V_Originala, aulkiak);
   aulkiak_idatzi(aulkiak);
   New_Line(4);
   Put_Line("sakatu return jarraitzeko");
   Skip_Line;
   --caso2
   --- Ahora vamos a modificar L_P_V_original tal que haya 5 partidos
    L_P_V_Originala.Alderdi_kop:=5;
    L_P_V_originala.Alderdien_taula(1) := ("       alderdi1", 140141);
    L_P_V_Originala.Alderdien_taula(2) := ("       alderdi2", 128103);
    L_P_V_originala.Alderdien_taula(3) := ("       alderdi3", 100241);
    L_P_V_originala.Alderdien_taula(4) := ("       alderdi4",  60050);
    L_P_V_Originala.Alderdien_taula(5) := ("       alderdi5",  30200);

   ---Y probamos con la nueva informaci�n:

   Put_Line("2. kasua -> taulak 5 alderdien informazioa du. ");
   New_Line;
   Put_Line("eta alderdi horien informazioa honakoa da: ");
   alderdien_botoen_lista_idatzi(L_P_V_Originala);

   Put_Line("eta emaitzak izan behar du  ");
   Put_line("alderdi 1 -> 8 escanos");
   Put_line("alderdi 2 -> 7 escanos");
   Put_line("alderdi 3 -> 6 escanos");
   Put_line("alderdi 4 -> 3 escanos");
   Put_line("alderdi 5 -> 1 escanos");
   New_Line(2);
   Put_Line("eta zuen programak dio   ");
   aulkiak_banatu(L_P_V_Originala, aulkiak);
   aulkiak_idatzi(aulkiak);

   Skip_Line;

    L_P_V_Originala.Alderdi_kop:=6;
    L_P_V_originala.Alderdien_taula(1) := ("         PNV/EA", 264774);
    L_P_V_Originala.Alderdien_taula(2) := ("       PSE-PSOE", 151347);
    L_P_V_originala.Alderdien_taula(3) := ("             PP", 113867);
    L_P_V_originala.Alderdien_taula(4) := ("           EHAK", 65431);
    L_P_V_originala.Alderdien_taula(5) := ("          EB-IU",  36258);
    L_P_V_Originala.Alderdien_taula(6) := ("         ARALAR",  10187);

   Put_Line("3. kasua -> taulak 6 alderdien informazioa du. ");
   New_Line;
   Put_Line("eta alderdi horien informazioa honakoa da: ");
   alderdien_botoen_lista_idatzi(L_P_V_Originala);

   Put_Line("eta emaitzak izan behar du  ");
   Put_line("alderdi 1 -> 11 escanos");
   Put_line("alderdi 2 -> 6 escanos");
   Put_line("alderdi 3 -> 5 escanos");
   Put_line("alderdi 4 -> 2 escanos");
   Put_line("alderdi 5 -> 1 escanos");
   New_Line(2);
   Put_Line("eta zuen programak dio   ");
   aulkiak_banatu(L_P_V_Originala, aulkiak);
   aulkiak_idatzi(aulkiak);

   Skip_Line;

    L_P_V_Originala.Alderdi_kop:=6;
    L_P_V_originala.Alderdien_taula(1) := ("         PNV/EA", 147498);
    L_P_V_Originala.Alderdien_taula(2) := ("       PSE-PSOE", 78088);
    L_P_V_originala.Alderdien_taula(3) := ("             PP", 70577);
    L_P_V_originala.Alderdien_taula(4) := ("           EHAK", 51163);
    L_P_V_originala.Alderdien_taula(5) := ("          EB-IU",  20278);
    L_P_V_Originala.Alderdien_taula(6) := ("         ARALAR",  15273);
   Put_Line("4. kasua -> taulak 6 alderdien informazioa du. ");
   New_Line;
   Put_Line("eta alderdi horien informazioa honakoa da: ");
   alderdien_botoen_lista_idatzi(L_P_V_Originala);

   Put_Line("eta emaitzak izan behar du  ");
   Put_line("alderdi 1 -> 10 escanos");
   Put_line("alderdi 2 -> 5 escanos");
   Put_line("alderdi 3 -> 5 escanos");
   Put_line("alderdi 4 -> 3 escanos");
   Put_line("alderdi 5 -> 1 escanos");
   Put_line("alderdi 6 -> 1 escanos");
   New_Line(2);
   Put_Line("eta zuen programak dio   ");
   aulkiak_banatu(L_P_V_Originala, aulkiak);
   aulkiak_idatzi(aulkiak);

   Skip_Line;
end proba_aulkiak_banatu ;
