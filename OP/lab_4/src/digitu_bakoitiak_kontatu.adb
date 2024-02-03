with Ada.Integer_Text_IO, Ada.Text_IO;
use Ada.Integer_Text_IO, Ada.Text_IO;

procedure digitu_bakoitiak_kontatu is
   zenb, aux, kont: integer;
begin
   kont := 0;
   -- hasieraketak
   put("Sartu osoko zenbaki bat: ");
   get(zenb);

   -- lortu digituak
   while(zenb > 0) loop
      aux := zenb rem 10;
      if(aux rem 2 /= 0) then
        kont := kont + 1;
   end if;
   zenb:= zenb/10;
end loop;

   put_line("Zuk sartutako zenbakiak ");
   put(kont);
   put(" digitu bakoiti ditu.");
end digitu_bakoitiak_kontatu;

