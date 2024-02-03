function nazioartekoa_da(n: integer) return boolean is

   --- Sarrera: autobus kode bat (Integer)
   --- Pre: kodeak 6 digitu ditu
   --- Irteera: balio boolear bat
   --- Post: true kodea 34rekin hasten bada
   nazioartekoa: Boolean;
   zenb:integer;
begin
   nazioartekoa:=False;
   zenb:= n;
   if zenb /(10**4) =34 then
      nazioartekoa:=True;
   end if;
   return(nazioartekoa);

end nazioartekoa_da;
