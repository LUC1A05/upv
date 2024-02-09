with Ada.Text_Io,Ada.Integer_Text_IO; use Ada.Text_Io,Ada.Integer_Text_IO;
with bektoreak; use bektoreak;
with posizioan_dago;

procedure proba_posizioan_dago is 
   -- progama honek posizioan_dago funtzioari dei egiten dio, eta 
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du
   
   bektore1: Osokoen_Bektorea(1..10);
   bektore2:Osokoen_Bektorea(1..15);
   bektore3:Osokoen_Bektorea(1..2);
   pos: Integer;
begin
   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("1. kasua: balioa erdian dago");
   put_line(" posizioan_dago(13, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" 7 izan behar da, eta emaitza da: ");
   pos:= posizioan_dago(13, bektore1);
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("2. kasua: balioa bukaeran dago");
   put_line(" posizioan_dago(9, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" 10 izan behar da, eta emaitza da: ");
   pos:= posizioan_dago(9, bektore1);
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("3. kasua: balioa ez dago, bektore osoa zeharkatu behar da");
   put_line(" posizioan_dago(45, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" -1 izan behar da, eta emaitza da: ");
   pos:= posizioan_dago(45, bektore1);
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);

   --proba kasu batzuk falta dira
   bektore1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);
   put_line("4. kasua: balioa hasieran dago");
   put_line(" posizioan_dago(1, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_line(" 1 izan behar da, eta emaitza da: ");
   pos:= posizioan_dago(1, bektore1);
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   bektore1 := (1, 1,1,1,1,1,1,1,1,1);
   put_line("5. kasua: balioa dago eta elementuak errepikatzen dira");
   put_line(" posizioan_dago(1, (1,1,1,1,1,1,1,1,1,1))");
   put_line(" 1 izan behar da, eta emaitza da: ");
   pos:= posizioan_dago(1, bektore1);
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   bektore2 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9, 1, 3, 5, 7, 19);
   put_line("6. kasua: bektore handiagoa eta elementua dago");
   put_line(" posizioan_dago(1, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9, 1, 3, 5, 7, 19))");
   put_line(" 1 izan behar da, eta emaitza da: ");
   pos:= posizioan_dago(1, bektore2);
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   bektore2 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9, 1, 3, 5, 7, 19);
   put_line("7. kasua: bektore handiagoa eta elementua ez dago");
   put_line(" posizioan_dago(2, (1, 3, 5, 7, 19, 6, 13, 15, 17, 9, 1, 3, 5, 7, 19))");
   put_line(" -1 izan behar da, eta emaitza da: ");
   pos:= posizioan_dago(2, bektore2);
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   bektore3:=(0,1);
   put_line("8. kasua: bektore txikiagoa eta elementua dago");
   put_line(" posizioan_dago(1, (0,1))");
   put_line(" 2 izan behar da, eta emaitza da: ");
   pos:= posizioan_dago(1, bektore3);
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);
   
   bektore3:=(0,1);
   put_line("9. kasua: bektore txikiagoa eta elementua ez dago");
   put_line(" posizioan_dago(2, (0,1))");
   put_line(" -1 izan behar da, eta emaitza da: ");
   pos:= posizioan_dago(2, bektore3);
   put(pos);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   new_line(3);




end Proba_Posizioan_dago;

