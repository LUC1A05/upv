with bektoreak; use bektoreak;

function posizioan_dago (x:in integer; V:Osokoen_Bektorea) return integer is
   i:integer;
   -- aurre: V bektoreak gutxienez elementu bat dauka (V'Last >= 1)
   -- eta elementuek ez du inongo ordenik jarraitzen. 
   -- Bilatzen den elementua ez du zertan V bektorean egon
   -- post: elementua agertzen den posizioa itzultzen du, eta ez bada agertzen -1


begin
   i:=1;
   loop exit when i > V'Last;
      if V(i)=x then
         return i;
      end if;
      i:= i +1;
   end loop;
   return -1;



end Posizioan_dago;

