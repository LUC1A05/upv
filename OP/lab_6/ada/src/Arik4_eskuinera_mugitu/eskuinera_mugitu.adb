with bektoreak; use bektoreak;

function Eskuinera_mugitu (B: in out Osokoen_Bektorea) return Osokoen_Bektorea is
   
   -- aurre: Array-a informazio esanguratsuz betea dago
   -- post: Elementu guztiak eskuinera mugitzen dira eta azken 
   --       elementua lehen elementua izatera pasatzen da
   pos, aux:integer:=1;
begin
      for pos in 1..B'Last loop
         aux := B(pos);
         B(pos) := B(1);
         B(1) := aux;
      end loop;
      return B;
      
end Eskuinera_mugitu;

