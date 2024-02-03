with Ada.Text_IO;
use Ada.Text_IO;
procedure dezimaletik_hexadezimalera (n: in integer) is
   hex:String(1..16):= "0123456789ABCDEF";
   hondarra:integer;
begin
   if n < 16 then
      hondarra:=n;
   else
      dezimaletik_hexadezimalera(n/16);
   end if;
   hondarra := n rem 16;
   hondarra:=hondarra+1;
   put(hex(hondarra));
end dezimaletik_hexadezimalera;


