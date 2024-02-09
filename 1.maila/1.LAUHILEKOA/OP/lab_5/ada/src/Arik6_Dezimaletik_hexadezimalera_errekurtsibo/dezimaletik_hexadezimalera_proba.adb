with Ada.Integer_Text_IO,Ada.Text_IO;
use Ada.Integer_Text_IO,Ada.Text_IO;

with dezimaletik_hexadezimalera;

procedure dezimaletik_hexadezimalera_proba is
   zenb:integer;
begin
   put_line("Lehenengo probaren zenbakia: 4");
   put("zure programak 4 itzuli beharko luke");
   new_line;
   zenb:=4;
   --hex:=dezimaletik_hexadezimalera(zenb);
   put("eta zure programak hurrengoa itzultzen du: ");
   dezimaletik_hexadezimalera(zenb);
   new_line;
   New_Line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   put_line("Lehenengo probaren zenbakia: 0");
   put("zure programak 0 itzuli beharko luke");
   new_line;
   zenb:=0;
   --hex:=dezimaletik_hexadezimalera(zenb);
   put("eta zure programak hurrengoa itzultzen du: ");
   dezimaletik_hexadezimalera(zenb);
   new_line;
   New_Line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   put_line("Lehenengo probaren zenbakia: 15");
   put("zure programak F itzuli beharko luke");
   new_line;
   zenb:=15;
   --hex:=dezimaletik_hexadezimalera(zenb);
   put("eta zure programak hurrengoa itzultzen du: ");
   dezimaletik_hexadezimalera(zenb);
   new_line;
   New_Line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   put_line("Lehenengo probaren zenbakia: 1222");
   put("zure programak 4C6 itzuli beharko luke");
   new_line;
   zenb:=1222;
   --hex:=dezimaletik_hexadezimalera(zenb);
   put("eta zure programak hurrengoa itzultzen du: ");
   dezimaletik_hexadezimalera(zenb);
   new_line;
   New_Line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;

   put_line("Lehenengo probaren zenbakia: 161");
   put("zure programak A1 itzuli beharko luke");
   new_line;
   zenb:=161;
   --hex:=dezimaletik_hexadezimalera(zenb);
   put("eta zure programak hurrengoa itzultzen du: ");
   dezimaletik_hexadezimalera(zenb);
   new_line;
   New_Line;
   Put_Line("jarraitzeko enter sakatu");
   Skip_Line;


end dezimaletik_hexadezimalera_proba;



