with bektoreak;
use bektoreak;

function bektorean_dago (x:in integer; V:Osokoen_Bektorea) return Boolean is
   i:integer;
   dago:Boolean:=False;
   -- aurre: V bektoreak gutxienez elementu bat dauka (V'Last >= 1)
   -- eta elementuek ez du inongo ordenik jarraitzen
   -- post: emaitza True izango da N balioa V-n baldin badago, eta False bestela
   
begin
   i:=1;

   loop exit when i > V'Last or dago;
      if V(i) = x then
         dago:=True;
      end if;
      i:= i + 1;
   end loop;
   return dago;

end bektorean_dago;

