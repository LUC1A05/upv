with Ada.Text_Io;
use Ada.Text_Io;

with kapikua_da;

procedure kapikua_da_proba is 
   -- programa honek kapikua_da programari deitzen dio
   -- eta bere funtzionamendua egokia den probatzeko balio du

   package Boolean_E_S is new Enumeration_Io(Boolean);
   use Boolean_E_S;
   -- Honek Boolean motako balioak idazteko balio du

begin
   Put("Lehen proba: kapikua_da(1) true izan behar da eta emaitza da ");
   Put(kapikua_da(1));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;
   -- dei honek "return" karaktere bat irakurtzen du, hau da, 
   -- erabiltzeaileak return zapaldu arte itxaron dezen balio du
   
   Put("Bigarren proba: kapikua_da(232) true izan behar da eta emaitza da ");
   Put(kapikua_da(232));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;

   Put("Hirugarren proba: kapikua_da(1234554321) true izan behar da eta emaitza da ");
   Put(kapikua_da(1234554321));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;

   Put("Laugarren proba: kapikua_da(1234567) false izan behar da eta emaitza da ");
   Put(kapikua_da(1234567));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;

   Put("Bostgarren proba: kapikua_da(12321) true izan behar da eta emaitza da ");
   Put(kapikua_da(12321));
   New_Line(3);
   Put_Line("jarraitzeko sakatu 'return'");
   Skip_Line;

end kapikua_da_proba;
