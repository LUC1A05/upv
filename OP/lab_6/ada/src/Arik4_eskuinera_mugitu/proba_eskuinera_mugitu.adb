with Ada.Text_Io; use Ada.Text_Io;
with bektoreak; use bektoreak;
with Eskuinera_mugitu, Bektorea_idatzi;

procedure Proba_Eskuinera_mugitu is 
   
   -- progama honek eskuinera_mugitu funtzioari dei egiten dio, eta 
   -- horren funtzionamendua zuzena dela ziurtatzeko balio du


   bektorea1: Osokoen_bektorea(1..10);
   bektorea2: Osokoen_Bektorea(1..3);
 
begin
 
   
   bektorea1 := (1, 3, 5, 7, 19, 6, 13, 15, 17, 9);  
   put_line("1. kasua: (1, 3, 5, 7, 19, 6, 13, 15, 17, 9)");
   put_line(" eskuinera_mugitu((1, 3, 5, 7, 19, 6, 13, 15, 17, 9))");
   put_Line(" honako emaitza eman behar du ");
   put_line(" 9, 1, 3, 5, 7, 19, 6, 13, 15, 17");
   bektorea1:=eskuinera_mugitu(bektorea1);
   bektorea_idatzi(bektorea1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   
   bektorea1 := (1, 3,5,7,9,11,13,15,17,19);  
   put_line("2. kasua: (1, 3,5,7,9,11,13,15,17,19)");
   put_line(" eskuinera_mugitu((1,3,5,7,9,11,13,15,17,19))");
   put_Line(" honako emaitza eman behar du ");
   put_line("19,1,3,5,7,9,11,13,15,17");
   bektorea1:=eskuinera_mugitu(bektorea1);
   bektorea_idatzi(bektorea1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   
   bektorea1 := (1, 3,5,7,9,11,13,15,17,1);  
   put_line("3. kasua: (1, 3,5,7,9,11,13,15,17,1)");
   put_line(" eskuinera_mugitu((1,3,5,7,9,11,13,15,17,1))");
   put_Line(" honako emaitza eman behar du ");
   put_line("1,1,3,5,7,9,11,13,15,17");
   bektorea1:=eskuinera_mugitu(bektorea1);
   bektorea_idatzi(bektorea1);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;
   
   bektorea2 := (1, 2, 3);  
   put_line("4. kasua: (1, 2, 3)");
   put_line(" eskuinera_mugitu((1,2,3))");
   put_Line(" honako emaitza eman behar du ");
   put_line("3,1,2");
   bektorea1:=eskuinera_mugitu(bektorea2);
   bektorea_idatzi(bektorea2);
   new_line(3);
   put_line("Return teklari eman jarraitzeko");
   skip_line;

end Proba_Eskuinera_mugitu;

