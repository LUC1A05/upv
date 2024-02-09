with Ada.Text_Io, Ada.Integer_Text_Io, datuak;
use datuak;
use Ada.Text_Io, Ada.Integer_Text_Io;


function luzera (L: in Lista) return integer is
   i:Integer:=0;
   Egungoa:Lista:=L;
	--Aurre: Idatzi ezazue!!
	--Post: Idatzi ezazue!!
begin
   while Egungoa /= null loop
      Egungoa:=Egungoa.Hurrengoa;
      i := i+1;
   end loop;
   return i;
end luzera;


