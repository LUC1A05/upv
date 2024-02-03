with datuak; use datuak;
with palindromoa_da_errekurtsiboa;

function palindromoa_da (K : in Katea) return Boolean is 
-- aurre: K kateak minuskulazko letrak eta/edo zuriuneak baino ez ditu.
-- post: emaitza True da, baldin eta K kateak palindromo bat badu, eta False bestela.
--		 Zuriuneak EZ dira kontuan hartzen kateak palindromoa duen ala ez erabakitzeko orduan.
--		 Funtzioak estrategia ERREKURTSIBO baten bidez lortzen du emaitza.

   hasiera:Integer:=1;
   amaiera:Integer:=K.Luzera;
   kat:String:=K.Karaktereak;
   ema:Boolean:=True;
begin
   if K.Luzera = 1 then
      return ema;
   end if;
   
   ema:=palindromoa_da_errekurtsiboa(Kat, hasiera, amaiera);
   return ema;

end palindromoa_da;
