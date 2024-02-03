with matrizeak; use matrizeak;

procedure Maximoa_matrizean (M:in Osokoen_Matrizea; maximoa, posLerroa, posZutabea: out Integer)is

   -- aurre: M matrizeak gutxienez elementu bat dauka
   -- post: Max-ek matrizearen balio maximoa dauka
   --       eta Pos_L, Pos_Z bere posizioa (lerroa, zutabea).
   --       Maximoa hainbat haldiz agertuz gero, lehenego agerpena itzuliko da
   lerro, zutabe:integer:=1;
begin
   maximoa:=Integer'First;
   while lerro<=M'Last(1) loop
      while zutabe<=M'Last(2) loop
         if M(lerro, zutabe)>maximoa then
            maximoa:=M(lerro, zutabe);
            posLerroa:=lerro;
            posZutabea:=zutabe;
         end if;
         zutabe:=zutabe+1;
      end loop;
      zutabe:=1;
      lerro:=lerro+1;
   end loop;

end Maximoa_matrizean;

