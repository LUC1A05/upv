with Ada.Text_Io;
use Ada.Text_Io;

with lehena_da;

procedure lehena_da_proba is 
   -- programa honek lehena_da programari deitzen dio
   -- eta bere funtzionamendua egokia den probatzeko balio du

   package Boolean_E_S is new Enumeration_Io(Boolean);
   use Boolean_E_S;
   -- Honek Boolean motako balioak idazteko balio du

begin
   Put("Lehen proba: lehena_da(1) false izan behar da eta emaitza da ");
   Put(lehena_da(1));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;
   -- dei honek "return" karaktere bat irakurtzen du, hau da, 
   -- erabiltzeaileak return zapaldu arte itxaron dezen balio du
   
   Put("Bigarren proba: lehena_da(2) true izan behar da eta emaitza da ");
   Put(lehena_da(2));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;

   Put("Hirugarren proba: lehena_da(3) true izan behar da eta emaitza da ");
   Put(lehena_da(3));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;

   Put("Laugarren proba: lehena_da(49) false izan behar da eta emaitza da ");
   Put(lehena_da(49));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;

   Put("Bostgarren proba: lehena_da(137) true izan behar da eta emaitza da ");
   Put(lehena_da(137));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;

end lehena_da_proba;

