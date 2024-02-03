with digitu_kopurua;
function nazionala_da(n: integer) return boolean is

   --- Sarrera: autobus kode bat (Integer)
   --- Pre: kodeak 3 edo 4 digitu ditu
   --- Irteera: balio boolear bat
   --- Post: true autobus kodea ez bada 48rekin hasten
   nazionala: Boolean;
   zenb, kop:integer;
begin
   nazionala:=False;
   zenb:= n;
   kop:=digitu_kopurua(n);
   kop:= kop-2;

   if zenb /(10**kop) /= 48 then
      nazionala:=True;
   end if;
   return(nazionala);

end nazionala_da;
