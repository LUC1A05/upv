with autobus_mota;
function irteera_maiztasuna(a:in integer; e:Character) return integer is
   --- Sarrera: 1) Integer: autobus_mota
   ---          2) Character: egun_mota
   --- Pre: autobus_mota 1 eta 6 arteko balio bat izango da
   ---      egun_mota 'A', 'L' edo 'J' balioak hartu ditzake (asteguna, larunbata edo jaieguna, hurrenez hurren)  
   --- Irteera: 1) Integer: maiztasuna (minututan adierazia)
   --- Post: maiztasuna >0 izango da eta autobus_mota motako autobusek egun_mota egunetan duten maiztasuna adiraziko
   ---       du, ariketaren enuntziatuko taulan adierazten denaren arabera			

   egun:Character:=e;
   auto, maiztasuna:Integer;

begin
   maiztasuna:= 0;
   auto:= autobus_mota(a);
   
   if auto = 1 then
      if egun = 'A' then
         maiztasuna:= 10;
      end if;
      if egun = 'L' or egun = 'J' then
         maiztasuna:= 15;
      end if;
   end if;
   
   if auto = 2 then
      if egun = 'A' or egun = 'L' then
         maiztasuna:= 20;
      end if;
      if egun = 'J' then
         maiztasuna:= 30;
      end if;
   end if;
   
   if auto = 3 then
         maiztasuna:= 30;
   end if;
   
   if auto = 4 then
      if egun = 'A' then
         maiztasuna:= 90;
      end if;
      if egun = 'L' then
         maiztasuna:= 120;
      end if;
      if egun = 'J' then
         maiztasuna:= 240;
      end if;
   end if;
   
   if auto = 5 then
      if egun = 'A' or egun = 'L' then
         maiztasuna:= 480;
      end if;
      if egun = 'J' then
         maiztasuna:= 720;
      end if;
   end if;
   
   if auto = 6 then
         maiztasuna:= 60;
   end if;
   return(maiztasuna);
   
   
end irteera_maiztasuna;
