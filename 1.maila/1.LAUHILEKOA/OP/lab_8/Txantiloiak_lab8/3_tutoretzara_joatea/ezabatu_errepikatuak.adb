with datuak;
use datuak;

procedure ezabatu_errepikatuak (egun_bat: in out Info_eguna) is
   -- Aurre:
   -- Pos: egun_bat aldagaian, nan errepikatuak zituzten informazioa ezabatu da (hau da nan baten informazioa
   --       hainbat aldiz agertzen bazen, orain soilik behin agertzen da.
   --       Zerrendaren amaierako ordenak ez du orden berezi batean agertu behar, hau da,
   --       ez du zertan hasierako ordena mantendu beharrik, beraz, eraginkortasuna kontuan hartuko da
   pos, ind, i:Integer:=1;
begin
   for pos in 1..egun_bat.Ikasle_kop loop
      for ind in pos+1..egun_bat.Ikasle_kop loop
         if egun_bat.NANak(pos) = egun_bat.NANak(ind) then
            for i in ind..egun_bat.Ikasle_kop-1 loop
               egun_bat.NANak(i) := egun_bat.NANak(i + 1);
            end loop;
            egun_bat.Ikasle_kop := egun_bat.Ikasle_kop - 1;
         end if;
      end loop;
   end loop;
end ezabatu_errepikatuak;
