with Ada.Text_Io, Ada.Integer_Text_Io;
use Ada.Text_Io, Ada.Integer_Text_Io;
with datuak; use datuak;
with palindromoa_da;

procedure proba_palindromoa_da is 
   -- programa honek palindromoa_da funtziora deitzen du eta
   -- bere funtzionamendua zuzena den egiaztatzeko erabilgarria da

   
Kat: Katea;

	procedure eskatu_return_eta_jarraitu is
	begin
	  new_line(3);
	  put_line("Zakatu return jarraitzeko");
	  skip_line;
	  new_line(3);
	end eskatu_return_eta_jarraitu;


begin

   Kat.Luzera:=0;
   put_line("1. kasua: Karaketere gabeko katea.");
   put_line("Emaitza True izan beharko litzateke");
   put(" eta emaitza honakoa da: ");
   if palindromoa_da(Kat) then put("True");
   else put("False");
   end if;
   eskatu_return_eta_jarraitu;

   
   put_line("2. kasua: Iker, ireki!!!");
   Kat.Karaktereak(1..15):= "arriba la birra";
   Kat.Luzera:=15;
   put_line("Emaitza True izan beharko litzateke");
   put(" eta emaitza honakoa da: ");
   if palindromoa_da(Kat) then put("True");
   else put("False");
   end if;
  

end proba_palindromoa_da;

