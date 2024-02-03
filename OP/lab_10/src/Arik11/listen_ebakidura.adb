with datuak, txertatu_nposizioan; use datuak;

function listen_ebakidura (
      L1: in  Lista;               
      L2 : in  Lista ) 
  return Lista is 
   -- aurre: L1-ek ez ditu errepikatutako elementurik
   --        L2-ek ez ditu errepikatutako elementurik
   -- post: itzultzen duen zerrendak L1 eta L2 zerrendetan dauden elementuak izango ditu
   --       hau da, L1 eta L2 zerrenden arteko ebakidura
   L3:Lista;
   lag1:Lista:=L1;
   lag2:Lista:=L2;
   i:Integer:=1;

begin
   while lag1 /= null loop
      while lag2 /= null loop
         if lag1.Info = lag2.Info then
            Txertatu_nposizioan(L3, lag1.Info, i);
            i:=i+1;
         end if;
         lag2:=lag2.Hurrengoa;
      end loop;
      lag1:=lag1.Hurrengoa;
      lag2:=L2;
   end loop;
   
   return L3;

end listen_ebakidura;

