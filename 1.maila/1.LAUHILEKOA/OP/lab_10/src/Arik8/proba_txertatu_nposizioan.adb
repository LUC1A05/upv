
with ada.text_io, datuak, sortu_zerrenda_hutsa, txertatu_hasieran, txertatu_nposizioan, idatzi;
use ada.text_io, datuak;


procedure proba_txertatu_nposizioan is
   Lis : Lista; -- variable del programa principal

   procedure return_eskatu is
   begin
      put_line("Return sakatu jarraitzeko ");
      skip_line;
   end return_eskatu;

begin

   put_line("*******************************");
   put_line("*    Probetarako programa:    *");
   put_line("*******************************");

   Put_Line("Lista originala");
   idatzi(Lis);

   sortu_zerrenda_hutsa(Lis);
   txertatu_nposizioan(Lis, 5, 1);
   put_line("Proba kasua  1: Lista elementu bat 1 posizioan txertatu ondoren.");
   put_line("Zerrendak <5> dauka");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 3);
   txertatu_hasieran(Lis, 1);
   txertatu_nposizioan(Lis, 2, 2);
   put_line("Proba kasua  2: Lista elementu bat 2 posizioan txertatu ondoren.");
   put_line("Zerrendak <1 2 3> dauka");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 3);
   txertatu_hasieran(Lis, 1);
   txertatu_nposizioan(Lis, 2, 3);
   put_line("Proba kasua  3: Lista elementu bat azken posizioan txertatu ondoren.");
   put_line("Zerrendak <1 3 2> dauka");
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   Sortu_Zerrenda_Hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   txertatu_hasieran(Lis, 3);
   txertatu_hasieran(Lis, 2);
   txertatu_hasieran(Lis, 1);
   Txertatu_Nposizioan(Lis, 7, 3);
   Put_Line("Proba kasua 4: Hainbat elementuen artean erdiko posizioan txertatu.");
   Put_Line("Zerrendak <1 2 7 3 4> dauka");
   Idatzi(Lis);
   New_Line;
   New_Line;
   Return_Eskatu;

   Sortu_Zerrenda_Hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   txertatu_hasieran(Lis, 3);
   txertatu_hasieran(Lis, 2);
   txertatu_hasieran(Lis, 1);
   Put_Line("Proba kasua 5: Elementua posizio handiegia du.");
   Put_Line("Zerrendak <1 2 3 4> dauka");
   Txertatu_Nposizioan(Lis, 7, 6);
   Idatzi(Lis);
   New_Line;
   New_Line;
   Return_Eskatu;

   Sortu_Zerrenda_Hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   txertatu_hasieran(Lis, 3);
   txertatu_hasieran(Lis, 2);
   txertatu_hasieran(Lis, 1);
   Put_Line("Proba kasua 6: azken posizioa.");
   Put_Line("Zerrendak <1 2 3 4> dauka");
   Txertatu_Nposizioan(Lis, 7, 5);
   Idatzi(Lis);
   New_Line;
   New_Line;
   Return_Eskatu;

   put_line("Proba bukatu da. Agur ");

end proba_txertatu_nposizioan;
