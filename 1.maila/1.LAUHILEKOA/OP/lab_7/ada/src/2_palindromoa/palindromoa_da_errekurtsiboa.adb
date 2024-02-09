with datuak; use datuak;
function palindromoa_da_errekurtsiboa(Kat: in String; hasiera,amaiera:in out Integer) return Boolean is

begin
   if hasiera >= amaiera then
      return True;
   elsif Kat(hasiera) = ' ' then
      hasiera:=hasiera+1;
      return palindromoa_da_errekurtsiboa(Kat, hasiera, amaiera);
   elsif kat(amaiera) = ' ' then
      amaiera:=amaiera-1;
      return palindromoa_da_errekurtsiboa(kat,hasiera,amaiera);
   elsif (Kat(hasiera) > 'a' and Kat(hasiera) < 'z') and (Kat(amaiera)>'a' and Kat(amaiera)<'z') then
      if Kat(amaiera) /= Kat(hasiera)then
         return False;
      else
         hasiera:=hasiera+1;
         amaiera:=amaiera-1;
         return palindromoa_da_errekurtsiboa(kat, hasiera, amaiera);
      end if;
   else
      hasiera:=hasiera+1;
      amaiera:=amaiera-1;
      return palindromoa_da_errekurtsiboa(kat,hasiera,amaiera);
   end if;
end palindromoa_da_errekurtsiboa;
