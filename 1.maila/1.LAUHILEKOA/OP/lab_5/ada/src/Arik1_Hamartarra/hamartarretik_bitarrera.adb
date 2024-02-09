function hamartarretik_bitarrera (n: in integer) return integer is

   --- Sarrera: zenbaki 1
   --- aurre: zenbakia osokoa da eta >=0
   --- irteera: zenbaki 1
   --- post: emaitza, sarrerako zenbaki hamartarraren zenbaki bikoiti baliokidea izango da

hamartar_lag, bitar, kont:integer;
   
begin
   hamartar_lag:=n;
   kont := 0;
   bitar := 0;
   loop exit when hamartar_lag <= 0;
      bitar := (hamartar_lag rem 2) * (10**kont) + bitar;
      hamartar_lag := hamartar_lag / 2;
      kont := kont + 1;   
    end loop;
return (bitar);
  
end hamartarretik_bitarrera;
