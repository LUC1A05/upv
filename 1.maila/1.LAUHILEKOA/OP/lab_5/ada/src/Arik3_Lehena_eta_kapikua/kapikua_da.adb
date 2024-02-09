function kapikua_da (zenb: in integer) return boolean is
 
   -- pre: N >= 1
   -- post: irteera balioa true zenbakia kapikua balitz bestela false
   
   alderantzizko_zenb,  
   digitoa, gainontzeko_digitoak: Integer;
   kap : Boolean;
begin
   kap := False;
   alderantzizko_zenb := 0;
   digitoa:= zenb;
   gainontzeko_digitoak:=0;
   
   loop exit when digitoa = 0;
      alderantzizko_zenb := alderantzizko_zenb*10;
      gainontzeko_digitoak := digitoa rem 10;
      digitoa := digitoa /10;
      alderantzizko_zenb := alderantzizko_zenb + gainontzeko_digitoak;
   end loop;
   
   if alderantzizko_zenb = zenb then
      kap:=True;
   end if;
   return(kap);
end kapikua_da;
