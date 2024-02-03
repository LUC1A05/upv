with Ada.Text_Io, Ada.integer_Text_Io;
use Ada.Text_Io, Ada.integer_Text_Io;

with n_baino_handiagoa_den_lehena_eta_kapikua;

procedure n_baino_handiagoa_den_lehena_eta_kapikua_proba is 



emaitza:integer;
begin
   Put("Lehenengo proba: n_baino_handiagoa_den_lehena_eta_kapikua(1) emaitza 2 izan behar da eta zure emaitza da:  ");
   emaitza:=n_baino_handiagoa_den_lehena_eta_kapikua(1);
   put(emaitza);
   New_Line(3);
   Put_Line("Jarraitzeko return sakatu");
   Skip_Line;
   -- dei honek "return" karaktere bat irakurtzen du, hau da, 
   -- erabiltzeaileak return zapaldu arte itxaron dezen balio du
  
   Put("Bigarren proba: n_baino_handiagoa_den_lehena_eta_kapikua(17) emaitza 101 izan behar da eta zure emaitza da:  ");
   emaitza:=n_baino_handiagoa_den_lehena_eta_kapikua(17);
   put(emaitza);
   New_Line(3);
   Put_Line("Jarraitzeko return sakatu");
   Skip_Line;


   Put("Hirugarren proba: n_baino_handiagoa_den_lehena_eta_kapikua(3000) emaitza 10301 izan behar da eta zure emaitza da: ");
   emaitza:=n_baino_handiagoa_den_lehena_eta_kapikua(3000);
   put(emaitza);
   New_Line(3);
   Put_Line("Jarraitzeko return sakatu");
   Skip_Line;


   Put("Laugarren proba: n_baino_handiagoa_den_lehena_eta_kapikua(3000000) emaitza 3001003 izan behar da eta zure emaitza da:  ");
   emaitza:=n_baino_handiagoa_den_lehena_eta_kapikua(3000000);
   put(emaitza);
   New_Line(3);
   Put_Line("Jarraitzeko return sakatu");
   Skip_Line;

end n_baino_handiagoa_den_lehena_eta_kapikua_proba;

