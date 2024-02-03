with autobus_mota;
with irteera_maiztasuna;

function hurrengo_autobusa(bus_kodea, ordu, minutu: integer; egun_mota:Character) return integer is
   --- Sarrera: 1) Integer: autobusaren_kodea
   ---          2) Integer: ordua
   ---          3) Integer: minutuak
   ---          4) Character: egun_mota

   --- Pre:     autobus_kodea >= 0
   ---          0<= ordua <= 23
   ---          0<= minutuak <= 59
   ---          egun_mota 'A' (asteguna), 'L' (larunbata) o 'J' (jaieguna)

   --- Irteera: 1) Integer: falta_diren_minutuak

   --- Post: falta_diren_minutuak >=0 autobus_kodea kodea duen hurrengo autobusa
   ---       atera dadin falta diren minutuak dira

maiz, ormin, kont, faltan: integer;

begin
   -- hasteko autobus_mota lortu behar da
   -- Autobusaren_mota motako autobusek gaurko egunean duten maiztasuna lortu
   maiz:=irteera_maiztasuna(bus_kodea, egun_mota);
   -- Bukatzeko, hurrengo autobusa atera dadin falta diren minutuak kalkulatzen
   -- dira, frec ordua eta minutuak erabiliz
   ormin:= (ordu*60) + minutu;
   kont:=0;
   faltan:=0;
   loop exit when kont >= ormin;
      kont:= kont + maiz;
   end loop;
   faltan:= kont - ormin;
   return(faltan);

end hurrengo_autobusa;
