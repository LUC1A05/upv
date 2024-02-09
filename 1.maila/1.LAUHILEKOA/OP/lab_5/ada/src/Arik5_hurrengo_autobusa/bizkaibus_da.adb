function bizkaibus_da(n: integer) return boolean is

   --- Sarrera: autobus kode bat (Integer)
   --- Pre: kodeak 5 digitu ditu
   --- Irteera: balio boolear bat
   --- Post: true autobus kodea 2rekin edo 3rekin hasten bada
   bizkaibus: Boolean;
   zenb:integer;
begin
   bizkaibus:=False;
   zenb:= n;
   if zenb /(10**4) = 2 or zenb/(10**4) = 3 then
      bizkaibus:=True;
   end if;
   return(bizkaibus);

end bizkaibus_da;
