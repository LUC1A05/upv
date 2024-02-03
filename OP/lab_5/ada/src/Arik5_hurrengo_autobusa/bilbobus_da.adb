function bilbobus_da(n: in integer) return boolean is

   --- Sarrera: autobus kode bat (Integer)
   --- Pre: kodeak 5 digitu ditu
   --- Irteera: balio boolear bat
   --- Post: true autobus kodea 1ekin hasten bada
   bilbobus: Boolean;
   zenb:integer;
begin
   bilbobus:=False;
   zenb:= n;
   if zenb /(10**4) = 1 then
      bilbobus:=True;
   end if;
   return(bilbobus);

end bilbobus_da;
