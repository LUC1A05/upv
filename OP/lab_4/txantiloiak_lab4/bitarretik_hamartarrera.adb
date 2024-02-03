with Ada.Integer_Text_IO, Ada.Text_IO;
use Ada.Integer_Text_IO, Ada.Text_IO;
procedure bitarretik_hamartarrera is
   num, aux, ham, kont: integer;
begin
   -- hasieraketak
   put("Sartu zenbaki bat bitarrez eta 1ekin hasten dena");
   get(num);
   ham := 0;
   kont := 0;

   -- sortu zenbakia hamartarrez
   while(num >= 1) loop
      aux := num rem 10;
      ham := ham + aux*(2**kont);
      kont := kont + 1;
      num := num / 10;
   end loop;
   put_line("Zenbakia hamartarrez honakoa da:");
   put(ham);
end bitarretik_hamartarrera;
