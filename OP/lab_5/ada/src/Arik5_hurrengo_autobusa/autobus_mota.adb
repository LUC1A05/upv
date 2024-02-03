with digitu_kopurua, bilbobus_da, bizkaibus_da,
     regionala_da, nazionala_da, nazioartekoa_da;

function autobus_mota(n: in integer) return integer is
   --- Sarrera: autobus kode bat (Integer)
   --- Pre: kodea >=0 da
   --- Irteera: Integer motako balio bat autobus mota adierazten
   --- Post: mota 1 eta 6 arteko balio bat da
   -- 			1 (Bilbobus)
   -- 			2 (Bizkaibus)
   -- 			3 (regionala)
   -- 			4 (nazionala)
   -- 			5 (nacioartekoa)
   -- 			6 (zerbitzu berezia)
zenb:integer;
begin
   zenb:= 6;
   if digitu_kopurua(n) = 5 then
      if bilbobus_da(n) then
         zenb:= 1;
      end if;
      if bizkaibus_da(n) then
         zenb:=2;
      end if;
      if regionala_da(n)then
         zenb:=3;
      end if;
   end if;

   if digitu_kopurua(n) = 3 or digitu_kopurua(n) = 4 then
      if nazionala_da(n) then
         zenb:=4;
      end if;
   end if;

   if digitu_kopurua(n) = 6 then
      if nazioartekoa_da(n) then
         zenb:= 5;
      end if;
   end if;

   return (zenb);

end autobus_mota;
