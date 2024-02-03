function bitarren_batuketa(bitarra1,bitarra2: in integer) return integer is
  batuketabitar,hondarra1,pisua,bitar1,bitar2:integer;
begin
   bitar1:=bitarra1;
   bitar2:=bitarra2;
   hondarra1:= 0;
   batuketabitar:= 0;
   pisua:=0;
   
   loop exit when(bitar1 = 0 and bitar2 = 0);
      batuketabitar := batuketabitar + (bitar1 rem 10 + bitar2 rem 10 + hondarra1)rem 2*(10**pisua);
      hondarra1:= (bitar1 rem 10 + bitar2 rem 10 + hondarra1) /2;
      bitar1:=bitar1/10;
      bitar2:=bitar2/10;
      pisua:= pisua + 1;
   end loop;
   if hondarra1 = 1 then
      batuketabitar:= batuketabitar + (bitar1 rem 10 + bitar2 rem 10 + hondarra1)rem 2*(10**pisua);
   end if;
   
return(batuketabitar); 
end bitarren_batuketa;

