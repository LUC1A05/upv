function regionala_da(n: integer) return boolean is

   --- Sarrera: autobus kode bat (Integer)
   --- Pre: kodeak 5 digitu ditu
   --- Irteera: balio boolear bat
   --- Post: true autobus kodea 48rekin hasten bada
   regionala: Boolean;
   zenb:integer;
begin
   regionala:=False;
   zenb:= n;
   if zenb /(10**3) = 48 then
      regionala:=True;
   end if;
   return(regionala);

end regionala_da;
