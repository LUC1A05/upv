function digitu_kopurua(n : in integer) return integer is

   --- Sarrera: autobus kode bat (Integer)
   --- Pre: autobus kodea >=0 da
   --- Irteera: Integer balio bat
   --- Post: autobus kodeak dituen digitu kopurua itzultzen da
   zenb, kont: integer;

begin
   zenb := n;
   kont := 0;

   loop exit when zenb = 0;
      kont := kont + 1;
      zenb := zenb /10;
   end loop;

   return(kont);

end digitu_kopurua;
