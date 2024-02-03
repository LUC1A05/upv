function lehena_da (n: in integer) return boolean is 
 
-- sarrera: zenbaki bat
-- aurre: N >= 1
-- irteera: boolear bat
-- post: irteera balioa true zenbakia lehena balitz bestela false

   zatitzaile_posible: integer:=2;
   lehena: boolean:= True;

begin
   loop exit when  lehena=false or zatitzaile_posible=n;                
      if n rem zatitzaile_posible = 0 or n = 1 then
         lehena:= False;
      end if;
      zatitzaile_posible := zatitzaile_posible +1;
   end loop;
   
   return(lehena);

end lehena_da;
