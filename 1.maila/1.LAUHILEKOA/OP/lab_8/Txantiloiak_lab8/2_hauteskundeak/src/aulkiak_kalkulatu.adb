with Motak; use Motak;
with Ada.text_io; use ada.text_io;

with aulkiak_banatu, aulkiak_idatzi;

procedure aulkiak_kalkulatu (Lpv_Bizkaia, Lpv_Araba, Lpv_Gipuzkoa : in     T_Lista_alderdien_botoak;aulkiak_guztira   :    out T_lista_aulkiak) is
   -- Aurre:  sarrerako 3 aldagaiek, probintzia bakoitzeko hauteskundeen emaitzak dituzte.
   -- Post: Emaitza, alderdi politiko bakoitzak lortu dituen aulki kopurua izango da. Probintzi bakoitzeko
   --        25 aulki esleituko dira, non 25 aulkiak alderdi politikoen artean banatuko diren.

   function dago ( alderdiaren_izena : in     T_izena;
                   aulkiak        : in     T_lista_aulkiak) return Integer is
      -- Aurre:
      -- Post: emaitza 0 izango da baldin eta alderdia ez badago aulkiak aldagaiko zerrendan, bestela, zerrendan agertzen den posizioa itzuliko da.
      Ind:integer:=1;
      aur:Boolean:=False;

   begin
      while ind<aulkiak.Kop_alderdi and aur=False loop
         if aulkiak.Taula_aulkiak(ind).Izena = alderdiaren_izena then
            return Ind;
            aur:=True;
            Ind:=0;
         end if;
         ind := ind+1;
      end loop;
      return ind;

   end dago;

   procedure aulkiak_metatu (aulkiak_guztira : in out T_lista_aulkiak;aulkiak : in T_lista_aulkiak) is
      -- Aurre:
      -- Post: Aulkiak aldagaiko aulki kopurua, aulkiak_guztira aldagaiara gehitu dira
      Pos : Integer;
   begin
      for I in 1..aulkiak_guztira.Kop_alderdi loop
         Pos:=dago(aulkiak.Taula_aulkiak(I).Izena, aulkiak_guztira);
         aulkiak_guztira.Taula_aulkiak(Pos).Aulki_kop:=(aulkiak_guztira.Taula_aulkiak(Pos).Aulki_kop) + (aulkiak.Taula_aulkiak(Pos).Aulki_kop);
      end loop;
   end aulkiak_metatu;


   aulkiak_Bizkaia, aulkiak_Araba, aulkiak_Gipuzkoa: T_lista_aulkiak;

begin

   --       Lehenik, aulkiak banatu beharko dira.
   --***********************************************************
  aulkiak_guztira.Kop_alderdi := 6;
  aulkiak_guztira.taula_aulkiak(1) := ("         PNV/EA", 0);
  aulkiak_guztira.taula_aulkiak(2) := ("             PP", 0);
  aulkiak_guztira.taula_aulkiak(3) := ("       PSE-PSOE", 0);
  aulkiak_guztira.taula_aulkiak(4) := ("           EHAK", 0);
  aulkiak_guztira.taula_aulkiak(5) := ("          EB-IU", 0);
  aulkiak_guztira.taula_aulkiak(6) := ("         ARALAR", 0);
  aulkiak_banatu(Lpv_Bizkaia, aulkiak_Bizkaia);
  aulkiak_banatu(Lpv_Araba, aulkiak_Araba);
  aulkiak_banatu(Lpv_Gipuzkoa, aulkiak_Gipuzkoa);

  aulkiak_metatu(aulkiak_guztira, aulkiak_Bizkaia);
  aulkiak_metatu(aulkiak_guztira, aulkiak_Bizkaia);
  aulkiak_metatu(aulkiak_guztira, aulkiak_Gipuzkoa);

end aulkiak_kalkulatu;


