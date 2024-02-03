with ada.text_io, datuak, sortu_zerrenda_hutsa, txertatu_hasieran, n_aurrera, idatzi;
use ada.text_io, datuak;


procedure proba_n_aurrera is
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
   txertatu_hasieran(Lis, 4);
   txertatu_hasieran(Lis, 3);
   txertatu_hasieran(Lis, 2);
   txertatu_hasieran(Lis, 1);
   put_line("Zerrenda hasieran:");
   idatzi(Lis);
   put_line("Proba kasua  1: erdiko posizioan moztu.");
   put_line("Zerrendak <3 4 1 2> dauka");
   n_aurrera(Lis, 3);
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   txertatu_hasieran(Lis, 3);
   txertatu_hasieran(Lis, 2);
   txertatu_hasieran(Lis, 1);
   put_line("Zerrenda hasieran:");
   idatzi(Lis);
   put_line("Proba kasua  2: hasieran moztu.");
   put_line("Zerrendak <1234> dauka");
   n_aurrera(Lis, 1);
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   sortu_zerrenda_hutsa(Lis);
   txertatu_hasieran(Lis, 4);
   txertatu_hasieran(Lis, 3);
   txertatu_hasieran(Lis, 2);
   txertatu_hasieran(Lis, 1);
   put_line("Zerrenda hasieran:");
   idatzi(Lis);
   put_line("Proba kasua  3: amaieran moztu.");
   put_line("Zerrendak <4321> dauka");
   n_aurrera(Lis, 4);
   idatzi(Lis);
   new_line;
   new_line;
   return_eskatu;

   put_line("Proba bukatu da. Agur ");

end proba_n_aurrera;
